package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfNumberIsSumOfPowersOfThreeTest {
    @Test
    fun test1() {
        val n = 12
        val expected = true

        assertEquals(expected, CheckIfNumberIsSumOfPowersOfThree.checkPowersOfThree(n))
    }

    @Test
    fun test2() {
        val n = 91
        val expected = true

        assertEquals(expected, CheckIfNumberIsSumOfPowersOfThree.checkPowersOfThree(n))
    }
    
    @Test
    fun test3() {
        val n = 21
        val expected = false

        assertEquals(expected, CheckIfNumberIsSumOfPowersOfThree.checkPowersOfThree(n))
    }
}