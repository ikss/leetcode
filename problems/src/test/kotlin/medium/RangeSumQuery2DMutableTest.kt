package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RangeSumQuery2DMutableTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(3, 0, 1, 4, 2),
            intArrayOf(5, 6, 3, 2, 1),
            intArrayOf(1, 2, 0, 1, 5),
            intArrayOf(4, 1, 0, 1, 7),
            intArrayOf(1, 0, 3, 0, 5),
        )
        val numMatrix = RangeSumQuery2DMutable.NumMatrix(matrix)

        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3))
        numMatrix.update(3, 2, 2)
        assertEquals(10, numMatrix.sumRegion(2, 1, 4, 3))
    }
}