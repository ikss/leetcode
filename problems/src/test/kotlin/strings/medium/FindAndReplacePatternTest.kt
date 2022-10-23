package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FindAndReplacePatternTest {

    @Test
    fun test1() {
        val words = arrayOf("abc", "deq", "mee", "aqq", "dkd", "ccc")
        val pattern = "abb"
        val expected = listOf("mee", "aqq")

        assertEquals(expected, FindAndReplacePattern.findAndReplacePatternStraightforward(words, pattern))
    }

    @Test
    fun test2() {
        val words = arrayOf("a", "b", "c")
        val pattern = "a"
        val expected = listOf("a", "b", "c")

        assertEquals(expected, FindAndReplacePattern.findAndReplacePatternStraightforward(words, pattern))
    }
}
