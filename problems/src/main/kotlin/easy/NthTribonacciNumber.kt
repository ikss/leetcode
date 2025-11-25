package easy

/**
 * The Tribonacci sequence Tn is defined as follows:
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 * [URL](https://leetcode.com/problems/n-th-tribonacci-number/)
 */
object NthTribonacciNumber {
    fun tribonacci(n: Int): Int {
        if (n < 3) {
            return if (n == 2) 1 else 0
        }

        var prevprev = 0
        var prev = 1
        var curr = 1

        repeat(n - 2) {
            val temp = prevprev + prev + curr
            prevprev = prev
            prev = curr
            curr = temp
        }
        return curr
    }
}
