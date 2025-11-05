package arrays.easy

/**
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 *
 * [URL](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
 */
object FindNUniqueIntegersSumUpToZero {
    fun sumZero(n: Int): IntArray {
        val result = IntArray(n)

        val neven = if (n % 2 == 0) n else n - 1
        for (i in 0 until neven / 2) {
            result[i] = i + 1
            result[n - i - 1] = -(i + 1)
        }

        return result
    }
}
