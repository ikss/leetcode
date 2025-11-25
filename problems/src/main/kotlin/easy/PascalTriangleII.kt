package easy

/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 * [URL](https://leetcode.com/problems/pascals-triangle-ii/)
 */
object PascalTriangleII {
    fun getRow(r: Int): List<Int> {
        val result = arrayListOf(1)

        var temp = 1L
        var up = r
        var down = 1
        for (i in 1..r) {
            temp = temp * up-- / down++
            result.add(temp.toInt())
        }
        return result
    }
}
