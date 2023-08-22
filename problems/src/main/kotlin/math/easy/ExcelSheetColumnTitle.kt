package math.easy

/**
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 *
 * [URL](https://leetcode.com/problems/excel-sheet-column-title/)
 */
object ExcelSheetColumnTitle {
    fun convertToTitle(columnNumber: Int): String {
        val result = StringBuilder(5)
        var n = columnNumber
        while (n > 0) {
            n--
            result.insert(0, 'A' + n % 26)
            n /= 26
        }
        return result.toString()
    }
}
