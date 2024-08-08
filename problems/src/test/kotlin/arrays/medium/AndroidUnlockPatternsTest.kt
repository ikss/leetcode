package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AndroidUnlockPatternsTest {
    @Test
    fun test1() {
        val m = 1
        val n = 1
        val expected = 9

        assertEquals(expected, AndroidUnlockPatterns.numberOfPatterns(m, n))
    }

    @Test
    fun test2() {
        val m = 1
        val n = 2
        val expected = 65

        assertEquals(expected, AndroidUnlockPatterns.numberOfPatterns(m, n))
    }
}