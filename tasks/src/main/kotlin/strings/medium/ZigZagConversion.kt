package strings.medium

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 *
 * URL: [https://leetcode.com/problems/zigzag-conversion/]
 */
object ZigZagConversion {

    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) {
            return s
        }
        val array = Array(numRows) { StringBuilder() }
        val chars = s.toCharArray()

        var sum = true
        var listIndex = 0
        var charIndex = 0
        while (charIndex < chars.size) {
            array[listIndex].append(chars[charIndex++])
            if (sum) {
                listIndex++
            } else {
                listIndex--
            }
            if (listIndex == numRows - 1) {
                sum = false
            } else if (listIndex == 0) {
                sum = true
            }
        }
        return array.joinToString(separator = "") { it.toString() }
    }
}
