package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheMinimumAreaToCoverAllOnesIITest {
    @Test
    fun test1() {
        val grid = arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
        val expected = 5

        assertEquals(expected, FindTheMinimumAreaToCoverAllOnesII.minimumSum(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(intArrayOf(1, 0, 1, 0), intArrayOf(0, 1, 0, 1))
        val expected = 5

        assertEquals(expected, FindTheMinimumAreaToCoverAllOnesII.minimumSum(grid))
    }
}