package monthly_challenge.may_2020.week4

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

object CountingBitsTest {

    @Test
    fun test1() {
        val expected = intArrayOf(0, 1, 1)
        val actual = CountingBits.countBits(2)
        assertTrue(actual.contentEquals(expected)) { "Expected ${expected.contentToString()}, but was ${actual.contentToString()}" }
    }

    @Test
    fun test2() {
        val expected = intArrayOf(0, 1, 1, 2, 1, 2)
        val actual = CountingBits.countBits(5)
        assertTrue(actual.contentEquals(expected)) { "Expected ${expected.contentToString()}, but was ${actual.contentToString()}" }
    }
}
