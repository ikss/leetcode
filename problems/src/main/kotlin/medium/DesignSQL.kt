package medium

/**
 * You are given two string arrays, names and columns, both of size n. The ith table is represented by the name
 * `names[i]` and contains `columns[i]` number of columns.
 *
 * You need to implement a class that supports the following operations:
 * * Insert a row in a specific table with an id assigned using an auto-increment method, where the id of the first
 * inserted row is 1, and the id of each new row inserted into the same table is one greater than the id of the last
 * inserted row, even if the last row was removed.
 * * Remove a row from a specific table. Removing a row does not affect the id of the next inserted row.
 * * Select a specific cell from any table and return its value.
 * * Export all rows from any table in csv format.
 *
 * Implement the SQL class:
 *  * SQL(String[] names, int[] columns)
 *  *  * Creates the n tables.
 *  * bool ins(String name, String[] row)
 *  *  * Inserts row into the table name and returns true.
 *  *  * If row.length does not match the expected number of columns, or name is not a valid table,
 * returns false without any insertion.
 *  * void rmv(String name, int rowId)
 *  *  * Removes the row rowId from the table name.
 *  *  * If name is not a valid table or there is no row with id rowId, no removal is performed.
 *  * String sel(String name, int rowId, int columnId)
 *  *  * Returns the value of the cell at the specified rowId and columnId in the table name.
 *  *  * If name is not a valid table, or the cell (rowId, columnId) is invalid, returns "<null>".
 *  * String[] exp(String name)
 *  *  * Returns the rows present in the table name.
 *  *  * If name is not a valid table, returns an empty array. Each row is represented as a string,
 *  with each cell value (including the row's id) separated by a ",".
 *
 * [URL](https://leetcode.com/problems/design-sql/)
 */
object DesignSQL {
    class SQL(names: List<String>, columns: List<Int>) {
        private var generators = HashMap<String, Int>()
        private val tableDefinitions = HashMap<String, Int>()
        private val tableStorage = HashMap<String, HashMap<Int, List<String>>>()

        init {
            for (i in names.indices) {
                tableDefinitions[names[i]] = columns[i]
                tableStorage[names[i]] = HashMap()
                generators[names[i]] = 0
            }
        }

        fun ins(name: String, row: List<String>): Boolean {
            val columns = tableDefinitions[name]
            if (columns != row.size) {
                return false
            }
            val generator = generators[name]!! + 1
            generators[name] = generator
            tableStorage[name]!![generator] = row
            return true
        }

        fun rmv(name: String, rowId: Int) {
            if (name !in tableDefinitions) {
                return
            }
            tableStorage[name]!!.remove(rowId)
        }

        fun sel(name: String, rowId: Int, columnId: Int): String {
            if (name !in tableDefinitions) {
                return "<null>"
            }
            return tableStorage[name]!![rowId]?.getOrNull(columnId - 1) ?: "<null>"
        }

        fun exp(name: String): List<String> {
            if (name !in tableDefinitions) {
                return emptyList()
            }
            println(tableStorage[name])
            return tableStorage[name]!!.entries.map { (k, v) -> "$k," + v.joinToString(",") }
        }
    }
}