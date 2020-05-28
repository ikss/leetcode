package week3

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StockSpannerTest {

    @Test
    fun test1() {
        val spanner = StockSpanner()
        assertEquals(1, spanner.next(100))
        assertEquals(1, spanner.next(80))
        assertEquals(1, spanner.next(60))
        assertEquals(2, spanner.next(70))
        assertEquals(1, spanner.next(60))
        assertEquals(4, spanner.next(75))
        assertEquals(6, spanner.next(85))
    }
}
