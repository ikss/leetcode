package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountSubmatricesWithAllOnesTest {
    @Test
    fun test1() {
        val mat = arrayOf(
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(1, 1, 0),
        )
        val expected = 13

        assertEquals(expected, CountSubmatricesWithAllOnes.numSubmat(mat))
    }

    @Test
    fun test2() {
        val mat = arrayOf(
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 1, 1, 1),
            intArrayOf(1, 1, 1, 0),
        )
        val expected = 24

        assertEquals(expected, CountSubmatricesWithAllOnes.numSubmat(mat))
    }

    @Test
    fun test3() {
        val mat = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1),
        )
        val expected = 20

        assertEquals(expected, CountSubmatricesWithAllOnes.numSubmat(mat))
    }
}