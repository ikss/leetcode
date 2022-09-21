package arrays.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class JumpGameTest {

    @Test
    fun testGreedy1() {
        val nums = intArrayOf(2, 3, 1, 1, 4)

        assertTrue(JumpGame.canJumpGreedy(nums))
    }

    @Test
    fun testGreedy2() {
        val nums = intArrayOf(2, 3, 1, 1, 4)

        assertTrue(JumpGame.canJumpGreedy(nums))
    }
}
