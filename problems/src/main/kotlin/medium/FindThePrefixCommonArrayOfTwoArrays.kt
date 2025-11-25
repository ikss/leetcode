package medium

/**
 * You are given two 0-indexed integer permutations A and B of length n.
 *
 * A prefix common array of A and B is an array C such that `C[i]` is equal to the count of numbers that are present at
 * or before the index i in both A and B.
 *
 * Return the prefix common array of A and B.
 *
 * A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.
 *
 * [URL](https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/)
 */
object FindThePrefixCommonArrayOfTwoArrays {
    fun findThePrefixCommonArray(A: IntArray, B: IntArray): IntArray {
        val seen = HashSet<Int>()
        val result = IntArray(A.size)

        var curr = 0
        for (i in A.indices) {
            if (!seen.add(A[i])) {
                curr++
            }
            if (!seen.add(B[i])) {
                curr++
            }
            result[i] = curr
        }

        return result
    }
}
