package easy

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * *  F(0) = 0, F(1) = 1
 * *  F(n) = F(n - 1) + F(n - 2), for n > 1.
 *
 * Given n, calculate F(n).
 *
 * [URL](https://leetcode.com/problems/fibonacci-number/)
 */
object FibonacciNumber {
    fun fib(n: Int): Int {
        if (n == 0) return 0

        var prev = 0
        var curr = 1

        repeat(n - 1) {
            val tmp = prev
            prev = curr
            curr += tmp
        }
        return curr
    }
}
