package trees.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class MyCalendarITest {

    @Test
    fun test1() {
        val calendar = MyCalendarI()
        val pairs = listOf(10 to 20, 15 to 25, 20 to 30)
        val expected = listOf(true, false, true)

        assertAll(
                pairs.zip(expected)
                        .map { (pair, result) ->
                            { assertEquals(result, calendar.book(pair.first, pair.second)) }
                        }
        )
    }

    @Test
    fun test2() {
        val calendar = MyCalendarI()
        val pairs =
                listOf(47 to 50, 33 to 41, 39 to 45, 33 to 42, 25 to 32, 26 to 35, 19 to 25, 3 to 8, 8 to 13, 18 to 27)
        val expected = listOf(true, true, false, false, true, false, true, true, true, false)

        assertAll(
                pairs.zip(expected)
                        .map { (pair, result) ->
                            { assertEquals(result, calendar.book(pair.first, pair.second)) }
                        }
        )
    }
}
