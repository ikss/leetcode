package numbers.medium

/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 *
 * [URL](https://leetcode.com/problems/sum-of-two-integers/)
 */
object SumOfTwoIntegers {
    fun getSum(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b != 0) {
            val res = a xor b
            val carry = (a and b) shl 1
            a = res
            b = carry
        }

        return a
    }
}