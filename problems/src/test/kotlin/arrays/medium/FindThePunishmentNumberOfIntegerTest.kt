package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindThePunishmentNumberOfIntegerTest {
    @Test
    fun test1() {
        val n = 10
        val expected = 182

        assertEquals(expected, FindThePunishmentNumberOfInteger.punishmentNumber(n))
    }

    @Test
    fun test2() {
        val n = 37
        val expected = 1478

        assertEquals(expected, FindThePunishmentNumberOfInteger.punishmentNumber(n))
    }
}