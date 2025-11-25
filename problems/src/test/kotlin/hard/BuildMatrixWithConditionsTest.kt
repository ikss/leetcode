package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class BuildMatrixWithConditionsTest {
    @Test
    fun test1() {
        val k = 3
        val rowConditions = arrayOf(intArrayOf(1, 2), intArrayOf(3, 2))
        val colConditions = arrayOf(intArrayOf(2, 1), intArrayOf(3, 2))
        val expected = arrayOf(intArrayOf(0, 0, 1), intArrayOf(3, 0, 0), intArrayOf(0, 2, 0))

        assertArrayEquals(expected, BuildMatrixWithConditions.buildMatrix(k, rowConditions, colConditions))
    }

    @Test
    fun test2() {
        val k = 3
        val rowConditions = arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))
        val colConditions = arrayOf(intArrayOf(2, 1))
        val expected = emptyArray<IntArray>()

        assertArrayEquals(expected, BuildMatrixWithConditions.buildMatrix(k, rowConditions, colConditions))
    }
}