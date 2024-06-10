package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class HeightCheckerTest {
    @Test
    fun test1() {
        val heights = intArrayOf(1, 1, 4, 2, 1, 3)
        val expected = 3

        assertEquals(expected, HeightChecker.heightChecker(heights))
    }
    
    @Test
    fun test2() {
        val heights = intArrayOf(5, 1, 2, 3, 4)
        val expected = 5

        assertEquals(expected, HeightChecker.heightChecker(heights))
    }
    
    @Test
    fun test3() {
        val heights = intArrayOf(1, 2, 3, 4, 5)
        val expected = 0

        assertEquals(expected, HeightChecker.heightChecker(heights))
    }
}