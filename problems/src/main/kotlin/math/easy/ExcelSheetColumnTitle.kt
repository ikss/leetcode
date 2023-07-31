package math.easy

/**
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 *
 * [URL](https://leetcode.com/problems/excel-sheet-column-title/)
 */
object ExcelSheetColumnTitle {
    fun convertToTitle(columnNumber: Int): String {
        val sb = StringBuilder()
        var n = columnNumber
        while (n > 0) {
            val mod = n % 26
            val tmp = 'A' - 1 + if (mod == 0) 26 else mod
            sb.append(tmp)
            n /= 26
            if (mod == 0) n--
        }
        return sb.reverse().toString()
    }
}
