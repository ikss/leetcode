package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfIslandsIITest {
    @Test
    fun test1() {
        val m = 3
        val n = 3
        val positions = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(2, 1),
        )
        val expected = listOf(1, 1, 2, 3)

        assertEquals(expected, NumberOfIslandsII.numIslands2(m, n, positions))
    }

    @Test
    fun test2() {
        val m = 1
        val n = 1
        val positions = arrayOf(
            intArrayOf(0, 0),
        )
        val expected = listOf(1)

        assertEquals(expected, NumberOfIslandsII.numIslands2(m, n, positions))
    }
}