package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubmatricesWithEqualFrequencyOfXAndYTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            charArrayOf('X', 'Y', '.'),
            charArrayOf('Y', '.', '.'),
        )
        val expected = 3

        assertEquals(expected, CountSubmatricesWithEqualFrequencyOfXAndY.numberOfSubmatrices(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            charArrayOf('X', 'X'),
            charArrayOf('X', 'Y'),
        )
        val expected = 0

        assertEquals(expected, CountSubmatricesWithEqualFrequencyOfXAndY.numberOfSubmatrices(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            charArrayOf('.', '.', '.'),
            charArrayOf('.', '.', '.'),
        )
        val expected = 0

        assertEquals(expected, CountSubmatricesWithEqualFrequencyOfXAndY.numberOfSubmatrices(grid))
    }
}