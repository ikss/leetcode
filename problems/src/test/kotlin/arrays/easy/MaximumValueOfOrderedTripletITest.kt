package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumValueOfOrderedTripletITest {
    @Test
    fun test1() {
        val nums = intArrayOf(12, 6, 1, 2, 7)
        val expected = 77

        assertEquals(expected, MaximumValueOfOrderedTripletI.maximumTripletValue(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 10, 3, 4, 19)
        val expected = 133

        assertEquals(expected, MaximumValueOfOrderedTripletI.maximumTripletValue(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val expected = 0

        assertEquals(expected, MaximumValueOfOrderedTripletI.maximumTripletValue(nums))
    }
}       