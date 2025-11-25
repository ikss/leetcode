package medium

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * [URL](https://leetcode.com/problems/integer-to-roman/)
 */
object IntegerToRoman {
    fun intToRoman(num: Int): String {
        val roman = mapOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )

        val answer = StringBuilder()
        var handleNum = num

        for (r in roman.entries) {
            while (handleNum >= r.key) {
                handleNum -= r.key
                answer.append(r.value)
            }
        }

        return answer.toString()
    }
}
