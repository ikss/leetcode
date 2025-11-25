package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PassThePillowTest {
    @Test
    fun test1() {
        val n = 4
        val time = 5
        val expected = 2

        assertEquals(expected, PassThePillow.passThePillow(n, time))
    }

    @Test
    fun test2() {
        val n = 3
        val time = 2
        val expected = 3

        assertEquals(expected, PassThePillow.passThePillow(n, time))
    }
}