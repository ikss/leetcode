package week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StockSpannerTest {

    @Test
    fun test1() {
        val spanner = StockSpanner()
        assertEquals(spanner.next(100), 1)
        assertEquals(spanner.next(80), 1)
        assertEquals(spanner.next(60), 1)
        assertEquals(spanner.next(70), 2)
        assertEquals(spanner.next(60), 1)
        assertEquals(spanner.next(75), 4)
        assertEquals(spanner.next(85), 6)
    }
}
