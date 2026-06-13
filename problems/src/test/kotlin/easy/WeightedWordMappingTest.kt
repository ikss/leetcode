package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WeightedWordMappingTest {
    @Test
    fun test1() {
        val words = arrayOf("abcd", "def", "xyz")
        val weights = intArrayOf(5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2)
        val expected = "rij"

        assertEquals(expected, WeightedWordMapping.mapWordWeights(words, weights))
    }

    @Test
    fun test2() {
        val words = arrayOf("a", "b", "c")
        val weights = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
        val expected = "yyy"

        assertEquals(expected, WeightedWordMapping.mapWordWeights(words, weights))
    }

    @Test
    fun test3() {
        val words = arrayOf("abcd")
        val weights = intArrayOf(7, 5, 3, 4, 3, 5, 4, 9, 4, 2, 2, 7, 10, 2, 5, 10, 6, 1, 2, 2, 4, 1, 3, 4, 4, 5)
        val expected = "g"

        assertEquals(expected, WeightedWordMapping.mapWordWeights(words, weights))
    }
}