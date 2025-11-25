package easy

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 *
 * [URL](https://leetcode.com/problems/palindrome-number/)
 */
object PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false
        var reverted = 0
        var curr = x
        while (curr > reverted) {
            reverted = reverted * 10 + curr % 10
            curr /= 10
        }
        return curr == reverted || curr == reverted / 10
    }
}
