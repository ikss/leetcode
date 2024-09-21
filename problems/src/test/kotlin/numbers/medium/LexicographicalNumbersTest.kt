package numbers.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LexicographicalNumbersTest {
    @Test
    fun test1() {
        val n = 13
        val expected = listOf(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9)
        
        assertEquals(expected, LexicographicalNumbers.lexicalOrder(n))
    }
}