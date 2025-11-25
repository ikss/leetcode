package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PermutationsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = listOf(
            listOf(1, 2, 3), listOf(1, 3, 2), listOf(2, 1, 3),
            listOf(2, 3, 1), listOf(3, 1, 2), listOf(3, 2, 1),
        )

        assertEquals(expected, Permutations.permute(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1)
        val expected = listOf(listOf(0, 1), listOf(1, 0))

        assertEquals(expected, Permutations.permute(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1)
        val expected = listOf(listOf(1))

        assertEquals(expected, Permutations.permute(nums))
    }
}
