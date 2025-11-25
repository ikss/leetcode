package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LastStoneWeightTest {
    @Test
    fun test1() {
        val stones = intArrayOf(2, 7, 4, 1, 8, 1)
        val expected = 1

        assertEquals(expected, LastStoneWeight.lastStoneWeight(stones))
    }

    @Test
    fun test2() {
        val stones = intArrayOf(1)
        val expected = 1

        assertEquals(expected, LastStoneWeight.lastStoneWeight(stones))
    }
}