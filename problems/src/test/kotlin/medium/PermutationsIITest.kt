package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PermutationsIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2)
        val expected = listOf(
            listOf(1, 1, 2),
            listOf(1, 2, 1),
            listOf(2, 1, 1),
        )

        assertEquals(expected, PermutationsII.permuteUnique(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3)
        val expected = listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1),
        )

        assertEquals(expected, PermutationsII.permuteUnique(nums))
    }
}