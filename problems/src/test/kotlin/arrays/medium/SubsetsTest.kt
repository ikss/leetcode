package arrays.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SubsetsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = listOf(
            listOf(),
            listOf(1, 2, 3),
            listOf(1, 2),
            listOf(1, 3),
            listOf(1),
            listOf(2, 3),
            listOf(2),
            listOf(3),
        )
        
        assertEquals(expected, Subsets.subsets(nums))
    }
    
    @Test
    fun test2() {
        val nums = intArrayOf(0)
        val expected = listOf(
            listOf(),
            listOf(0),
        )
        
        assertEquals(expected, Subsets.subsets(nums))
    }
}