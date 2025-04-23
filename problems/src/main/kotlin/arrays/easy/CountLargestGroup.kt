package arrays.easy

/**
 * You are given an integer n.
 *
 * Each number from 1 to n is grouped according to the sum of its digits.
 *
 * Return the number of groups that have the largest size.
 *
 * [URL](https://leetcode.com/problems/can-place-flowers/)
 */
object CountLargestGroup {
    fun countLargestGroup(n: Int): Int {
        val sums = IntArray(37)

        var max = 0
        for (i in 1..n) {
            val sum = getSum(i)
            max = maxOf(max, ++sums[sum])
        }

        return sums.count { it == max }
    }

    private fun getSum(i: Int): Int {
        var result = 0
        var i = i

        while (i > 0) {
            result += i % 10
            i /= 10
        }

        return result
    }
}
