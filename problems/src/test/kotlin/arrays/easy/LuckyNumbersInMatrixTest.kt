package arrays.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LuckyNumbersInMatrixTest {
    @Test
    fun test1() {
        val matrix = arrayOf(
            intArrayOf(3, 7, 8),
            intArrayOf(9, 11, 13),
            intArrayOf(15, 16, 17)
        )
        val expected = listOf(15)
        
        assertEquals(expected, LuckyNumbersInMatrix.luckyNumbers(matrix))
    }
    
    @Test
    fun test2() {
        val matrix = arrayOf(
            intArrayOf(1, 10, 4, 2),
            intArrayOf(9, 3, 8, 7),
            intArrayOf(15, 16, 17, 12)
        )
        val expected = listOf(12)
        
        assertEquals(expected, LuckyNumbersInMatrix.luckyNumbers(matrix))
    }
    
    @Test
    fun test3() {
        val matrix = arrayOf(
            intArrayOf(7, 8),
            intArrayOf(1, 2)
        )
        val expected = listOf(7)
        
        assertEquals(expected, LuckyNumbersInMatrix.luckyNumbers(matrix))
    }
}