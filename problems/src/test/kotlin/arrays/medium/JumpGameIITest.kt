package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JumpGameIITest {

    @Test
    fun test1dp() {
        val nums = intArrayOf(2, 3, 1, 1, 4)
        val expected = 2

        assertEquals(expected, JumpGameII.jumpDp(nums))
    }

    @Test
    fun test2dp() {
        val nums = intArrayOf(2, 3, 0, 1, 4)
        val expected = 2

        assertEquals(expected, JumpGameII.jumpDp(nums))
    }

    @Test
    fun test1official() {
        val nums = intArrayOf(2, 3, 1, 1, 4)
        val expected = 2

        assertEquals(expected, JumpGameII.jumpOfficial(nums))
    }

    @Test
    fun test2official() {
        val nums = intArrayOf(2, 3, 0, 1, 4)
        val expected = 2

        assertEquals(expected, JumpGameII.jumpOfficial(nums))
    }
}