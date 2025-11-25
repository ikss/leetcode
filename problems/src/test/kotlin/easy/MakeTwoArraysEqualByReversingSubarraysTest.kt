package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeTwoArraysEqualByReversingSubarraysTest {
    @Test
    fun test1() {
        val target = intArrayOf(1, 2, 3, 4)
        val arr = intArrayOf(2, 4, 1, 3)
        val expected = true

        assertEquals(expected, MakeTwoArraysEqualByReversingSubarrays.canBeEqual(target, arr))
    }

    @Test
    fun test2() {
        val target = intArrayOf(7)
        val arr = intArrayOf(7)
        val expected = true

        assertEquals(expected, MakeTwoArraysEqualByReversingSubarrays.canBeEqual(target, arr))
    }

    @Test
    fun test3() {
        val target = intArrayOf(3, 7, 9)
        val arr = intArrayOf(3, 7, 11)
        val expected = false

        assertEquals(expected, MakeTwoArraysEqualByReversingSubarrays.canBeEqual(target, arr))
    }
}