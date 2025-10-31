package arrays.easy

/**
 * In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1.
 * Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an
 * additional time, making the list longer than usual.
 *
 * As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two
 * numbers (in any order), so peace can return to Digitville.
 *
 * [URL](https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/)
 */
object TheTwoSneakyNumbersOfDigitville {
    fun getSneakyNumbers(nums: IntArray): IntArray {
        val set = HashSet<Int>()

        val result = IntArray(2) { -1 }
        for (n in nums) {
            if (!set.add(n)) {
                if (result[0] != -1) {
                    result[1] = n
                    break
                }
                result[0] = n
            }
        }
        return result
    }
}
