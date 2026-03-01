package hard

import java.util.*


/**
 * Design the basic function of Excel and implement the function of the sum formula.
 *
 * Implement the Excel class:
 *
 * * Excel(int height, char width) Initializes the object with the height and the width of the sheet.
 * The sheet is an integer matrix mat of size height x width with the row index in the range `[1, height]`
 * and the column index in the range ['A', width]. All the values should be zero initially.
 * * void set(int row, char column, int val) Changes the value at `mat[row][column]` to be val.
 * int get(int row, char column) Returns the value at `mat[row][column]`.
 * * int sum(int row, char column, List<String> numbers) Sets the value at `mat[row][column] `to be the sum of cells
 * represented by numbers and returns the value at `mat[row][column]`. This sum formula should exist until this cell
 * is overlapped by another value or another sum formula. `numbers[i]` could be on the format:
 * * * "ColRow" that represents a single cell.
 * For example, "F7" represents the cell mat[7]['F'].
 * * * "ColRow1:ColRow2" that represents a range of cells. The range will always be a rectangle where "ColRow1"
 *   represent the position of the top-left cell, and "ColRow2" represents the position of the bottom-right cell.
 * For example, "B3:F7" represents the cells `mat[i][j] for 3 <= i <= 7 and 'B' <= j <= 'F'`.
 *
 * Note: You could assume that there will not be any circular sum reference.
 *
 * * For example, `mat[1]['A'] == sum(1, "B")` and `mat[1]['B'] == sum(1, "A")`.
 *
 * [URL](https://leetcode.com/problems/design-excel-sum-formula/)
 */
object DesignExcelSumFormula {
    class Excel(h: Int, w: Char) {
        internal class Formula(var cells: HashMap<String, Int>, var `val`: Int)

        private var formulas = Array<Array<Formula?>>(h) { arrayOfNulls<Formula>(w - 'A' + 1) }

        var stack = Stack<IntArray>()

        fun get(r: Int, c: Char): Int {
            val formula = formulas[r - 1][c - 'A']
                ?: return 0
            return formula.`val`
        }

        fun set(r: Int, c: Char, v: Int) {
            formulas[r - 1][c - 'A'] = Formula(HashMap<String, Int>(), v)
            topologicalSort(r - 1, c - 'A')
            executeStack()
        }

        fun sum(r: Int, c: Char, strs: Array<String>): Int {
            val cells = convert(strs)
            val summ = calculateSum(r - 1, c - 'A', cells)
            set(r, c, summ)
            formulas[r - 1][c - 'A'] = Formula(cells, summ)
            return summ
        }

        fun topologicalSort(r: Int, c: Int) {
            for (i in formulas.indices) {
                for (j in formulas[0].indices) {
                    if (formulas[i][j] != null && formulas[i][j]!!.cells.containsKey("" + ('A' + c) + (r + 1))) {
                        topologicalSort(i, j)
                    }
                }
            }
            stack.push(intArrayOf(r, c))
        }

        fun executeStack() {
            while (!stack.isEmpty()) {
                val top = stack.pop()
                if (formulas[top[0]][top[1]]!!.cells.isNotEmpty()) {
                    calculateSum(top[0], top[1], formulas[top[0]][top[1]]!!.cells)
                }
            }
        }

        fun convert(strs: Array<String>): HashMap<String, Int> {
            val res = HashMap<String, Int>()
            for (st in strs) {
                if (st.indexOf(':') < 0) {
                    res[st] = res.getOrDefault(st, 0) + 1
                } else {
                    val cells: Array<String> = st.split(':').dropLastWhile { it.isEmpty() }.toTypedArray()
                    val si = cells[0].substring(1).toInt()
                    val ei = cells[1].substring(1).toInt()
                    val sj = cells[0][0]
                    val ej = cells[1][0]
                    for (i in si..ei) {
                        var j = sj
                        while (j <= ej) {
                            res["" + j + i] = res.getOrDefault("" + j + i, 0) + 1
                            j++
                        }
                    }
                }
            }
            return res
        }

        fun calculateSum(r: Int, c: Int, cells: HashMap<String, Int>): Int {
            var sum = 0
            for (s in cells.keys) {
                val x = s.substring(1).toInt() - 1
                val y = s[0] - 'A'
                sum += (if (formulas[x][y] != null) formulas[x][y]!!.`val` else 0) * cells[s]!!
            }
            formulas[r][c] = Formula(cells, sum)
            return sum
        }
    }
}
