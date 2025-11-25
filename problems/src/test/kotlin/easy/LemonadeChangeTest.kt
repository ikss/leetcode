package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LemonadeChangeTest {
    @Test
    fun test1() {
        val bills = intArrayOf(5, 5, 5, 10, 20)
        val expected = true

        assertEquals(expected, LemonadeChange.lemonadeChange(bills))
    }

    @Test
    fun test2() {
        val bills = intArrayOf(5, 5, 10, 10, 20)
        val expected = false

        assertEquals(expected, LemonadeChange.lemonadeChange(bills))
    }
}