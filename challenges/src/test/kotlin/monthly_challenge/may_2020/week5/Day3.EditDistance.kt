package monthly_challenge.may_2020.week5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object EditDistanceTest {
    @Test
    fun test1() {
        val word1 = "horse"
        val word2 = "ros"
        assertEquals(3, EditDistance.minDistance(word1, word2))
    }

    @Test
    fun test2() {
        val word1 = "intention"
        val word2 = "execution"
        assertEquals(5, EditDistance.minDistance(word1, word2))
    }

    @Test
    fun `test1 optimized one array`() {
        val word1 = "horse"
        val word2 = "ros"
        assertEquals(3, EditDistance.minDistanceOneArray(word1, word2))
    }

    @Test
    fun `test2 optimized one array`() {
        val word1 = "intention"
        val word2 = "execution"
        assertEquals(5, EditDistance.minDistanceOneArray(word1, word2))
    }
}
