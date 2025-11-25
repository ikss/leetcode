package hard

import java.util.*


/**
 * You are given an array of integers nums. Perform the following steps:
 *
 * 1. Find any two adjacent numbers in nums that are non-coprime.
 * 2. If no such numbers are found, stop the process.
 * 3. Otherwise, delete the two numbers and replace them with their LCM (Least Common Multiple).
 * 4. Repeat this process as long as you keep finding two adjacent non-coprime numbers.
 *
 * Return the final modified array. It can be shown that replacing adjacent non-coprime numbers in any arbitrary order
 * will lead to the same result.
 *
 * The test cases are generated such that the values in the final array are less than or equal to 10^8.
 *
 * Two values x and y are non-coprime if GCD(x, y) > 1 where GCD(x, y) is the Greatest Common Divisor of x and y.
 *
 * [URL](https://leetcode.com/problems/replace-non-coprime-numbers-in-array/)
 */
object ReplaceNonCoprimeNumbersInArray {
    fun replaceNonCoprimes(nums: IntArray): List<Int> {
        val stack = Stack<Int>()

        for (num in nums) {
            var num = num
            while (!stack.isEmpty()) {
                val top = stack.peek()
                val g = gcd(top, num)
                if (g == 1) {
                    break
                }
                stack.pop()
                // merge top with current num (via LCM)
                num *= (top / g) // safer LCM
            }
            stack.push(num)
        }

        return stack
    }

    private fun gcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return gcd(b, a % b)
    }
}
