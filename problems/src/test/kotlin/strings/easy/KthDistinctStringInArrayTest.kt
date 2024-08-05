package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthDistinctStringInArrayTest {
    @Test
    fun test1() {
        val words = arrayOf("a", "b", "c", "a", "b", "c")
        val k = 2
        val expected = "b"

        assertEquals(expected, KthDistinctStringInArray.kthDistinct(words, k))
    }

    @Test
    fun test2() {
        val words = arrayOf("aaa", "aa", "a")
        val k = 1
        val expected = "aaa"

        assertEquals(expected, KthDistinctStringInArray.kthDistinct(words, k))
    }

    @Test
    fun test3() {
        val words = arrayOf("a", "b", "a")
        val k = 3
        val expected = ""

        assertEquals(expected, KthDistinctStringInArray.kthDistinct(words, k))
    }
}