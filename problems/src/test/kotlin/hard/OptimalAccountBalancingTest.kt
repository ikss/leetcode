package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OptimalAccountBalancingTest {
    @Test
    fun test1() {
        val transactions = arrayOf(intArrayOf(0, 1, 10), intArrayOf(2, 0, 5))
        val expected = 2

        assertEquals(expected, OptimalAccountBalancing.minTransfers(transactions))
    }

    @Test
    fun test2() {
        val transactions = arrayOf(
            intArrayOf(0, 1, 10),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 2, 5),
            intArrayOf(2, 0, 5),
        )
        val expected = 1

        assertEquals(expected, OptimalAccountBalancing.minTransfers(transactions))
    }

}