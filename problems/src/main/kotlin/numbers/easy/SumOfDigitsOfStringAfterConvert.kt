package numbers.easy

/**
 * You are given a string s consisting of lowercase English letters, and an integer k.
 *
 * First, convert s into an integer by replacing each letter with its position in the alphabet
 * (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of
 * its digits. Repeat the transform operation k times in total.
 *
 * For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:
 * * Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
 * * Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
 * * Transform #2: 17 ➝ 1 + 7 ➝ 8
 *
 * Return the resulting integer after performing the operations described above.
 *
 * [URL](https://leetcode.com/problems/sum-of-digits-of-string-after-convert/)
 */
object SumOfDigitsOfStringAfterConvert {
    fun getLucky(s: String, k: Int): Int {
        var result = 0
        for (c in s) {
            val number =  c - 'a' + 1
            result += if (number > 9) {
                number % 10 + number / 10
            } else {
                number
            }
        }

        for (i in 1 until k) {
            var n = result
            result = 0
            while (n > 0) {
                result += n % 10
                n /= 10
            }
        }

        return result
    }
}
