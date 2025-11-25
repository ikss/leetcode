package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MajorityElementIITest {
    @Test
    fun test1() {
        val input = intArrayOf(3, 2, 3)
        val expected = listOf(3)

        assertEquals(expected, MajorityElementII.majorityElement(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(1)
        val expected = listOf(1)

        assertEquals(expected, MajorityElementII.majorityElement(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(1, 2)
        val expected = listOf(1, 2)

        assertEquals(expected, MajorityElementII.majorityElement(input))
    }
}