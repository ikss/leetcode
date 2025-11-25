package hard

/**
 * Convert a non-negative integer num to its English words representation.
 *
 * [URL](https://leetcode.com/problems/integer-to-english-words/)
 */
object IntegerToEnglishWords {
    private val LESS_THAN_20 = arrayOf(
        "",
        "One",
        "Two",
        "Three",
        "Four",
        "Five",
        "Six",
        "Seven",
        "Eight",
        "Nine",
        "Ten",
        "Eleven",
        "Twelve",
        "Thirteen",
        "Fourteen",
        "Fifteen",
        "Sixteen",
        "Seventeen",
        "Eighteen",
        "Nineteen",
    )
    private val TENS = arrayOf("", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")
    private val THOUSANDS = arrayOf("", "Thousand", "Million", "Billion")
    
    fun numberToWords(num: Int): String {
        if (num == 0) return "Zero"
        
        var n = num
        var i = 0
        var result = ""

        while (n > 0) {
            if (n % 1000 != 0) {
                result = helper(n % 1000) + THOUSANDS[i] + " " + result
            }
            n /= 1000
            i++
        }

        return result.trim()
    }

    private fun helper(num: Int): String =
        if (num == 0) ""
        else if (num < 20) LESS_THAN_20[num] + " "
        else if (num < 100) TENS[num / 10] + " " + helper(num % 10)
        else LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100)
}
