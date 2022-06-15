package data_structures.arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MajorityElementTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 2, 3)
        val expected = 3

        assertEquals(expected, MajorityElement.majorityElement(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        val expected = 2

        assertEquals(expected, MajorityElement.majorityElement(nums))
    }

    @Test
    fun test1BoyerMoore() {
        val nums = intArrayOf(3, 2, 3)
        val expected = 3

        assertEquals(expected, MajorityElement.majorityElementBoyerMoore(nums))
    }

    @Test
    fun test2BoyerMoore() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        val expected = 2

        assertEquals(expected, MajorityElement.majorityElementBoyerMoore(nums))
    }
}
