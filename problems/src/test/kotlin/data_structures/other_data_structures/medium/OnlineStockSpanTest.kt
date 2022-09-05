package data_structures.other_data_structures.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OnlineStockSpanTest {

    @Test
    fun test1() {
        val spanner = OnlineStockSpan()
        val actual = mutableListOf<Int>()
        actual.add(spanner.next(100))
        actual.add(spanner.next(80))
        actual.add(spanner.next(60))
        actual.add(spanner.next(70))
        actual.add(spanner.next(60))
        actual.add(spanner.next(75))
        actual.add(spanner.next(85))
        val expected = listOf(1, 1, 1, 2, 1, 4, 6)

        assertEquals(expected, actual)
    }
}
