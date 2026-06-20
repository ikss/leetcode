package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumBuildingHeightTest {
    @Test
    fun test1() {
        val n = 5
        val restrictions = arrayOf(intArrayOf(2, 1), intArrayOf(4, 1))
        val expected = 2

        assertEquals(expected, MaximumBuildingHeight.maxBuilding(n, restrictions))
    }

    @Test
    fun test2() {
        val n = 6
        val restrictions = arrayOf<IntArray>()
        val expected = 5

        assertEquals(expected, MaximumBuildingHeight.maxBuilding(n, restrictions))
    }

    @Test
    fun test3() {
        val n = 10
        val restrictions = arrayOf(intArrayOf(5, 3), intArrayOf(2, 5), intArrayOf(7, 4), intArrayOf(10, 3))
        val expected = 5

        assertEquals(expected, MaximumBuildingHeight.maxBuilding(n, restrictions))
    }
}