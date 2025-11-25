package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class MyCalendarIITest {

    @Test
    fun test1() {
        val calendar = MyCalendarII()
        val pairs = listOf(10 to 20, 50 to 60, 10 to 40, 5 to 15, 5 to 10, 25 to 55)
        val expected = listOf(true, true, true, false, true, true)

        assertAll(
            pairs.zip(expected)
                .map { (pair, result) ->
                    { assertEquals(result, calendar.book(pair.first, pair.second)) }
                }
        )
    }
}