package medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class JumpGameTest {

    @Test
    fun test1greedy() {
        val nums = intArrayOf(2, 3, 1, 1, 4)

        assertTrue(JumpGame.canJumpGreedy(nums))
    }

    @Test
    fun test2greedy() {
        val nums = intArrayOf(2, 3, 1, 1, 4)

        assertTrue(JumpGame.canJumpGreedy(nums))
    }
}
