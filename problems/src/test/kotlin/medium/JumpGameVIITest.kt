package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JumpGameVIITest {
    @Test
    fun test1() {
        val s = "011010"
        val minJump = 2
        val maxJump = 3
        val expected = true

        assertEquals(expected, JumpGameVII.canReach(s, minJump, maxJump))
    }

    @Test
    fun test2() {
        val s = "01101110"
        val minJump = 2
        val maxJump = 3
        val expected = false

        assertEquals(expected, JumpGameVII.canReach(s, minJump, maxJump))
    }
}