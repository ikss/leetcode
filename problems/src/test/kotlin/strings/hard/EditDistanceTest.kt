package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EditDistanceTest {

    @Test
    fun test1dp() {
        val word1 = "horse"
        val word2 = "ros"
        val expected = 3

        assertEquals(expected, EditDistance.minDistanceDp(word1, word2))
    }

    @Test
    fun test2dp() {
        val word1 = "intention"
        val word2 = "execution"
        val expected = 5

        assertEquals(expected, EditDistance.minDistanceDp(word1, word2))
    }

    @Test
    fun test3dp() {
        val word1 = "abc"
        val word2 = ""
        val expected = 3

        assertEquals(expected, EditDistance.minDistanceDp(word1, word2))
    }

    @Test
    fun test4dp() {
        val word1 = "a"
        val word2 = "a"
        val expected = 0

        assertEquals(expected, EditDistance.minDistanceDp(word1, word2))
    }


    @Test
    fun test1dpMemOptimized() {
        val word1 = "horse"
        val word2 = "ros"
        val expected = 3

        assertEquals(expected, EditDistance.minDistanceDpMemOptimized(word1, word2))
    }

    @Test
    fun test2dpMemOptimized() {
        val word1 = "intention"
        val word2 = "execution"
        val expected = 5

        assertEquals(expected, EditDistance.minDistanceDpMemOptimized(word1, word2))
    }

    @Test
    fun test3dpMemOptimized() {
        val word1 = "abc"
        val word2 = ""
        val expected = 3

        assertEquals(expected, EditDistance.minDistanceDpMemOptimized(word1, word2))
    }

    @Test
    fun test4dpMemOptimized() {
        val word1 = "a"
        val word2 = "a"
        val expected = 0

        assertEquals(expected, EditDistance.minDistanceDpMemOptimized(word1, word2))
    }
}