package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `132PatternTest` {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = false

        assertEquals(expected, `132Pattern`.find132pattern(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 1, 4, 2)
        val expected = true

        assertEquals(expected, `132Pattern`.find132pattern(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(-1, 3, 2, 0)
        val expected = true

        assertEquals(expected, `132Pattern`.find132pattern(nums))
    }
}
