package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindAllGroupsOfFarmlandTest {
    @Test
    fun test1() {
        val input = arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 1, 1),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0, 0),
            intArrayOf(1, 1, 2, 2),
        )

        assertArrayEquals(expected, FindAllGroupsOfFarmland.findFarmland(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 1),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 1, 1),
        )

        assertArrayEquals(expected, FindAllGroupsOfFarmland.findFarmland(input))
    }
}