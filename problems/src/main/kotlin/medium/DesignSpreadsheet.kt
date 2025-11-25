package medium

/**
 * A spreadsheet is a grid with 26 columns (labeled from 'A' to 'Z') and a given number of rows.
 * Each cell in the spreadsheet can hold an integer value between 0 and 105.
 *
 * Implement the Spreadsheet class:
 * * Spreadsheet(int rows) Initializes a spreadsheet with 26 columns (labeled 'A' to 'Z') and the specified number of rows.
 * All cells are initially set to 0.
 * * void setCell(String cell, int value) Sets the value of the specified cell. The cell reference is provided in the
 * format "AX" (e.g., "A1", "B10"), where the letter represents the column (from 'A' to 'Z')
 * and the number represents a 1-indexed row.
 * * void resetCell(String cell) Resets the specified cell to 0.
 * * int getValue(String formula) Evaluates a formula of the form "=X+Y", where X and Y are either cell references or
 * non-negative integers, and returns the computed sum.
 *
 * Note: If getValue references a cell that has not been explicitly set using setCell, its value is considered 0.
 *
 * [URL](https://leetcode.com/problems/design-spreadsheet/)
 */
object DesignSpreadsheet {
    class Spreadsheet(val rows: Int) {
        val map = IntArray(26 * (rows + 1))

        fun setCell(cell: String, value: Int) {
            map[cellToIndex(cell)] = value
        }

        fun resetCell(cell: String) {
            map[cellToIndex(cell)] = 0
        }

        fun getValue(formula: String): Int {
            val (first, second) = formula.substring(1).split('+')
            val firstNum = if (first[0] in 'A'..'Z') map[cellToIndex(first)] else first.toInt()
            val secondNum = if (second[0] in 'A'..'Z') map[cellToIndex(second)] else second.toInt()

            return firstNum + secondNum
        }

        private fun cellToIndex(cell: String): Int {
            val col = cell[0] - 'A'
            val row = cell.substring(1).toInt()

            return (col * rows) + row
        }
    }

    /**
     * Your Spreadsheet object will be instantiated and called as such:
     * var obj = Spreadsheet(rows)
     * obj.setCell(cell,value)
     * obj.resetCell(cell)
     * var param_3 = obj.getValue(formula)
     */
}