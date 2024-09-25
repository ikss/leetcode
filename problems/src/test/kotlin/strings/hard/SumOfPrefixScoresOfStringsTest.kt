package strings.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SumOfPrefixScoresOfStringsTest {
    @Test
    fun test1() {
        val words = arrayOf("abc", "ab", "bc", "b")
        val expected = intArrayOf(5, 4, 3, 2)
        
        assertArrayEquals(expected, SumOfPrefixScoresOfStrings.sumPrefixScores(words))
    }
    
    @Test
    fun test2() {
        val words = arrayOf("abcd")
        val expected = intArrayOf(4)
        
        assertArrayEquals(expected, SumOfPrefixScoresOfStrings.sumPrefixScores(words))
    }
}