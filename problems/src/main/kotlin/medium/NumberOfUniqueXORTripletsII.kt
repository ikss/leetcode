package medium

/**
 * You are given an integer array nums.
 *
 * A XOR triplet is defined as the XOR of three elements `nums[i] XOR nums[j] XOR nums[k]` where i <= j <= k.
 *
 * Return the number of unique XOR triplet values from all possible triplets (i, j, k).
 *
 * [URL](https://leetcode.com/problems/number-of-unique-xor-triplets-ii/)
 */
object NumberOfUniqueXORTripletsII {
    fun uniqueXorTripletsEnumeration(nums: IntArray): Int {
        val xoredPairsSet = HashSet<Int>()
        val n = nums.size

        for (i in nums.indices) {
            for (j in i until n) {
                xoredPairsSet.add(nums[i] xor nums[j])
            }
        }

        val xoredPairs = xoredPairsSet.toList()
        val xored = HashSet<Int>()

        var result = 0
        for (i in nums.indices) {
            for (j in xoredPairs.indices) {
                if (xored.add(nums[i] xor xoredPairs[j])) {
                    result++
                }
            }
        }

        return result
    }

    fun uniqueXorTripletsEnumerationOptimized(nums: IntArray): Int {
        val m = nums.max()
        var u = 1
        while (u <= m) {
            u = u shl 1
        }
        val one = BooleanArray(u)
        val two = BooleanArray(u)
        val three = BooleanArray(u)
        for (v in nums) {
            one[v] = true
            for (x in 0..<u) {
                if (one[x]) {
                    two[x xor v] = true
                }
            }
        }
        for (v in nums) {
            for (x in 0..<u) {
                if (two[x]) {
                    three[x xor v] = true
                }
            }
        }
        var result = 0
        for (b in three) {
            if (b) {
                result++
            }
        }
        return result
    }
}
