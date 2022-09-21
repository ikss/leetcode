package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSubmatricesThatSumToTargetTest {

    @Test
    fun test1() {
        val matrix = arrayOf(
                intArrayOf(0, 1, 0),
                intArrayOf(1, 1, 1),
                intArrayOf(0, 1, 0),
        )
        val target = 0
        val expected = 4

        assertEquals(expected, NumberOfSubmatricesThatSumToTarget.numSubmatrixSumTarget(matrix, target))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(
                intArrayOf(1, -1),
                intArrayOf(-1, 1),
        )
        val target = 0
        val expected = 5

        assertEquals(expected, NumberOfSubmatricesThatSumToTarget.numSubmatrixSumTarget(matrix, target))
    }

    @Test
    fun test3() {
        val matrix = arrayOf(
                intArrayOf(904),
        )
        val target = 0
        val expected = 0

        assertEquals(expected, NumberOfSubmatricesThatSumToTarget.numSubmatrixSumTarget(matrix, target))
    }
}
