package numbers.easy

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * URL: [https://leetcode.com/problems/roman-to-integer/]
 */
object RomanToInteger {
    fun romanToInt(num: String): Int {
        val roman = mapOf(
            'M' to 1000,
            'D' to 500,
            'C' to 100,
            'L' to 50,
            'X' to 10,
            'V' to 5,
            'I' to 1
        )

        val roman2digit = mapOf(
            "CM" to 900,
            "CD" to 400,
            "XC" to 90,
            "XL" to 40,
            "IX" to 9,
            "IV" to 4,
        )

        var answer = 0
        val chars = num.toCharArray()
        var index = 0
        while (index < chars.size - 1) {
            val currChar = chars[index]
            val value = roman2digit[currChar.toString() + chars[index + 1]]
            if (value != null) {
                answer += value
                index += 2
                continue
            }
            answer += roman[currChar]!!
            index++
        }
        if (index != chars.size) {
            answer += roman[chars[index]]!!
        }
        return answer
    }
}
