package numbers.easy
/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 * URL: [https://leetcode.com/problems/reverse-integer/]
 */
object ReverseInteger {
    fun reverse(x: Int): Int {
        var rev = 0
        var curr = x
        val upperBound = Integer.MAX_VALUE / 10
        val lowerBound = Integer.MIN_VALUE / 10
        while (curr != 0) {
            val pop = curr % 10
            curr /= 10
            if ((rev > upperBound || (rev == upperBound && pop > 7)) ||
                (rev < lowerBound || (rev == lowerBound && pop < -8))
            ) {
                return 0
            }
            rev = rev * 10 + pop
        }
        return rev
    }
}
