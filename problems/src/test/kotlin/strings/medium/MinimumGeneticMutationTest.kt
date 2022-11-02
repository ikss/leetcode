package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MinimumGeneticMutationTest {

    @Test
    fun test1() {
        val start = "AACCGGTT"
        val end = "AACCGGTA"
        val bank = arrayOf("AACCGGTA")
        val expected = 1

        assertEquals(expected, MinimumGeneticMutation.minMutation(start, end, bank))
    }

    @Test
    fun test2() {
        val start = "AACCGGTT"
        val end = "AAACGGTA"
        val bank = arrayOf("AACCGGTA", "AACCGCTA", "AAACGGTA")
        val expected = 2

        assertEquals(expected, MinimumGeneticMutation.minMutation(start, end, bank))
    }

    @Test
    fun test3() {
        val start = "AAAAACCC"
        val end = "AACCCCCC"
        val bank = arrayOf("AAAACCCC", "AAACCCCC", "AACCCCCC")
        val expected = 3

        assertEquals(expected, MinimumGeneticMutation.minMutation(start, end, bank))
    }
}