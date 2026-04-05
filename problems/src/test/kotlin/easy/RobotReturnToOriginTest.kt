package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RobotReturnToOriginTest {
    @Test
    fun test1() {
        val moves = "UD"
        val expected = true

        assertEquals(expected, RobotReturnToOrigin.judgeCircle(moves))
    }

    @Test
    fun test2() {
        val moves = "LL"
        val expected = false

        assertEquals(expected, RobotReturnToOrigin.judgeCircle(moves))
    }
}