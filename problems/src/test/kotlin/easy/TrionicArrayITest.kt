package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TrionicArrayITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 5, 4, 2, 6)
        val expected = true

        assertEquals(expected, TrionicArrayI.isTrionic(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 1, 3)
        val expected = false

        assertEquals(expected, TrionicArrayI.isTrionic(nums))
    }
}