package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumTotalDamageWithSpellCastingTest {
    @Test
    fun test1() {
        val power = intArrayOf(1, 1, 3, 4)
        val expected = 6L

        assertEquals(expected, MaximumTotalDamageWithSpellCasting.maximumTotalDamage(power))
    }

    @Test
    fun test2() {
        val power = intArrayOf(7, 1, 6, 6)
        val expected = 13L

        assertEquals(expected, MaximumTotalDamageWithSpellCasting.maximumTotalDamage(power))
    }

    @Test
    fun test3() {
        val power = intArrayOf(4, 5, 5, 6, 3, 6, 5, 3, 4)
        val expected = 18L

        assertEquals(expected, MaximumTotalDamageWithSpellCasting.maximumTotalDamage(power))
    }

    @Test
    fun test4() {
        val power = intArrayOf(5, 9, 2, 10, 2, 7, 10, 9, 3, 8)
        val expected = 31L

        assertEquals(expected, MaximumTotalDamageWithSpellCasting.maximumTotalDamage(power))

    }

    @Test
    fun test5() {
        val power = intArrayOf(7, 1, 6, 3)
        val expected = 10L

        assertEquals(expected, MaximumTotalDamageWithSpellCasting.maximumTotalDamage(power))

    }
}