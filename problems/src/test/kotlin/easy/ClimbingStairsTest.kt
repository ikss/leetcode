package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ClimbingStairsTest {

    @Test
    fun test1() {
        val number = 2
        val expected = 2

        assertEquals(expected, ClimbingStairs.climbStairs(number))
    }

    @Test
    fun test2() {
        val number = 4
        val expected = 5

        assertEquals(expected, ClimbingStairs.climbStairs(number))
    }

    @Test
    fun test3() {
        val number = 35
        val expected = 14930352

        assertEquals(expected, ClimbingStairs.climbStairs(number))
    }
}
