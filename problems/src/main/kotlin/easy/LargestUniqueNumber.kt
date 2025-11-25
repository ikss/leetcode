package easy

/**
 * Given an integer array nums, return the largest integer that only occurs once. If no integer occurs once, return -1.
 *
 * [URL](https://leetcode.com/problems/largest-unique-number/)
 */
object LargestUniqueNumber {
    fun largestUniqueNumberMap(nums: IntArray): Int {
        val frequencyMap = HashMap<Int, Int>()

        for (num in nums) {
            frequencyMap.merge(num, 1, Int::plus)
        }

        var largestUnique = -1

        for (num in frequencyMap.keys) {
            if (frequencyMap[num] == 1 && num > largestUnique) {
                largestUnique = num
            }
        }

        return largestUnique
    }

    fun largestUniqueNumberArray(nums: IntArray): Int {
        val frequencyArr = IntArray(1001)

        for (num in nums) {
            frequencyArr[num]++
        }

        for (num in 1000 downTo 0) {
            if (frequencyArr[num] == 1) return num
        }

        return -1
    }
}
