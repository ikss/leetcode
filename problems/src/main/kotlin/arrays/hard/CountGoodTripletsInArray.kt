package arrays.hard

import data_structures.FenwickTree

/**
 * You are given two 0-indexed arrays nums1 and nums2 of length n,
 * both of which are permutations of `[0, 1, ..., n - 1]`.
 *
 * A good triplet is a set of 3 distinct values which are present in increasing order by position both in nums1 and nums2.
 * In other words, if we consider pos1v as the index of the value v in nums1 and pos2v as the index of the value
 * v in nums2, then a good triplet will be a set (x, y, z) where 0 <= x, y, z <= n - 1,
 * such that pos1x < pos1y < pos1z and pos2x < pos2y < pos2z.
 *
 * Return the total number of good triplets.
 *
 * [URL](https://leetcode.com/problems/count-good-triplets-in-an-array/)
 */
object CountGoodTripletsInArray {

    fun goodTriplets(nums1: IntArray, nums2: IntArray): Long {
        val n = nums1.size
        val pos2 = IntArray(n)

        val reversedIndexMapping = IntArray(n)
        for (i in 0..<n) {
            pos2[nums2[i]] = i
        }

        for (i in 0..<n) {
            reversedIndexMapping[pos2[nums1[i]]] = i
        }

        val tree = FenwickTree(n)
        var result = 0L
        
        for (value in 0..<n) {
            val pos = reversedIndexMapping[value]
            val left = tree.query(pos)
            tree.update(pos, 1)
            val right = (n - 1 - pos) - (value - left)
            result += left.toLong() * right
        }
        return result
    }
}
