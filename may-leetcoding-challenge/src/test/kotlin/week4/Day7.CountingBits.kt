package week4

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

object CountingBitsTest {

    @Test
    fun test1() {
        val expected = intArrayOf(0, 1, 1)
        assertTrue(CountingBits.countBits(2).contentEquals(expected))
    }

    @Test
    fun test2() {
        val expected = intArrayOf(0, 1, 1, 2, 1, 2)
        assertTrue(CountingBits.countBits(5).contentEquals(expected))
    }
}
