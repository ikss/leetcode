package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NRepeatedElementInSize2NArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 3)
        val expected = 3

        assertEquals(expected, NRepeatedElementInSize2NArray.repeatedNTimes(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 1, 2, 5, 3, 2)
        val expected = 2

        assertEquals(expected, NRepeatedElementInSize2NArray.repeatedNTimes(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5, 1, 5, 2, 5, 3, 5, 4)
        val expected = 5

        assertEquals(expected, NRepeatedElementInSize2NArray.repeatedNTimes(nums))
    }
}