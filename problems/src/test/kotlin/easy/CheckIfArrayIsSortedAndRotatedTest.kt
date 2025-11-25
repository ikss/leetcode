package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfArrayIsSortedAndRotatedTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 4, 5, 1, 2)
        val result = true

        assertEquals(result, CheckIfArrayIsSortedAndRotated.check(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 1, 3, 4)
        val result = false

        assertEquals(result, CheckIfArrayIsSortedAndRotated.check(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val result = true

        assertEquals(result, CheckIfArrayIsSortedAndRotated.check(nums))
    }
}