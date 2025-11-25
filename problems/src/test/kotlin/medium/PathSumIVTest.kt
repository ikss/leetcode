package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PathSumIVTest {
    @Test
    fun test1() {
        val nums = intArrayOf(113, 215, 221)
        val expected = 12

        assertEquals(expected, PathSumIV.pathSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(113, 221)
        val expected = 4
        
        assertEquals(expected, PathSumIV.pathSum(nums))
    }
}