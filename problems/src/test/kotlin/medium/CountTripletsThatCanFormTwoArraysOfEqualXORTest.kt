package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTripletsThatCanFormTwoArraysOfEqualXORTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 1, 6, 7)
        val expected = 4

        assertEquals(expected, CountTripletsThatCanFormTwoArraysOfEqualXOR.countTriplets(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        val expected = 10

        assertEquals(expected, CountTripletsThatCanFormTwoArraysOfEqualXOR.countTriplets(nums))
    }
}