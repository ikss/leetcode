package strings.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindKthBitInNthBinaryStringTest {
    @Test
    fun test1() {
        val n = 3
        val k = 1
        val expected = '0'

        assertEquals(expected, FindKthBitInNthBinaryString.findKthBit(n, k))
    }
    
    @Test
    fun test2() {
        val n = 4
        val k = 11
        val expected = '1'
        
        assertEquals(expected, FindKthBitInNthBinaryString.findKthBit(n, k))
    }
}