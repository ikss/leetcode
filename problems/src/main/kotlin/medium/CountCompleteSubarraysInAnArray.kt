package medium

/**
 * You are given an array nums consisting of positive integers.
 *
 * We call a subarray of an array complete if the following condition is satisfied:
 *
 * The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
 * Return the number of complete subarrays.
 *
 * A subarray is a contiguous non-empty part of an array.
 *
 * [URL](https://leetcode.com/problems/count-complete-subarrays-in-an-array/)
 */
object CountCompleteSubarraysInAnArray {
    fun countCompleteSubarrays(nums: IntArray): Int {
        val set = HashSet<Int>()
        
        for (n in nums) {
            set.add(n)
        }
        
        val k = set.size
        var unique = 0
        
        var start = 0
        var result = 0
        val map = HashMap<Int, Int>()
        for (end in nums.indices) {
            val endNum = nums[end]
            val count = map.getOrDefault(endNum, 0)
            if (count == 0) {
                unique++
            }
            map[endNum] = count + 1
            
            while (unique == k) {
                val startNum = nums[start]
                map[startNum] = map[startNum]!! - 1
                if (map[startNum] == 0) {
                    unique--
                }
                start++
            }
            result += start      
        }
        return result
    }
}