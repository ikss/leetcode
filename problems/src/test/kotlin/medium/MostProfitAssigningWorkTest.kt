package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MostProfitAssigningWorkTest {
    @Test
    fun test1() {
        val difficulty = intArrayOf(2, 4, 6, 8, 10)
        val profit = intArrayOf(10, 20, 30, 40, 50)
        val worker = intArrayOf(4, 5, 6, 7)
        val expected = 100
        
        assertEquals(expected, MostProfitAssigningWork.maxProfitAssignment(difficulty, profit, worker))
    }
    
    @Test
    fun test2() {
        val difficulty = intArrayOf(85, 47, 57)
        val profit = intArrayOf(24, 66, 99)
        val worker = intArrayOf(40, 25, 25)
        val expected = 0
        
        assertEquals(expected, MostProfitAssigningWork.maxProfitAssignment(difficulty, profit, worker))
    }
    
    @Test
    fun test3() {
        val difficulty = intArrayOf(68, 35, 52, 47, 86)
        val profit = intArrayOf(67, 17, 1, 81, 3)
        val worker = intArrayOf(92, 10, 85, 84, 82)
        val expected = 324
        
        assertEquals(expected, MostProfitAssigningWork.maxProfitAssignment(difficulty, profit, worker))
    }
}