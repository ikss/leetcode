package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MovePiecesToObtainStringTest {
    @Test
    fun test1() {
        val start = "_L__R__R_"
        val target = "L______RR"
        val expected = true

        assertEquals(expected, MovePiecesToObtainString.canChange(start, target))
    }

    @Test
    fun test2() {
        val start = "R_L_"
        val target = "__LR"
        val expected = false

        assertEquals(expected, MovePiecesToObtainString.canChange(start, target))
    }

    @Test
    fun test3() {
        val start = "_R"
        val target = "R_"
        val expected = false

        assertEquals(expected, MovePiecesToObtainString.canChange(start, target))
    }
}