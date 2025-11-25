package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountOfSubstringsContainingEveryVowelAndKConsonantsIITest {
    @Test
    fun test1() {
        val s = "aeioqq"
        val k = 1
        val expected = 0L

        assertEquals(expected, CountOfSubstringsContainingEveryVowelAndKConsonantsII.countOfSubstrings(s, k))
    }

    @Test
    fun test2() {
        val s = "aeiou"
        val k = 0
        val expected = 1L

        assertEquals(expected, CountOfSubstringsContainingEveryVowelAndKConsonantsII.countOfSubstrings(s, k))
    }

    @Test
    fun test3() {
        val s = "ieaouqqieaouqq"
        val k = 1
        val expected = 3L

        assertEquals(expected, CountOfSubstringsContainingEveryVowelAndKConsonantsII.countOfSubstrings(s, k))
    }
    
    @Test
    fun test4() {
        val s = "iqeaouqi"
        val k = 2
        val expected = 3L

        assertEquals(expected, CountOfSubstringsContainingEveryVowelAndKConsonantsII.countOfSubstrings(s, k))
    }
}