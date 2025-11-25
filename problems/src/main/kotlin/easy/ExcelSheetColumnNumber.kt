package easy

/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet,
 * return its corresponding column number.
 *
 * [URL](https://leetcode.com/problems/excel-sheet-column-number/)
 */
object ExcelSheetColumnNumber {
    fun titleToNumber(columnTitle: String): Int {
        var result = 0
        for (char in columnTitle) {
            result = result * 26 + (char - 'A') + 1
        }
        return result
    }
}
