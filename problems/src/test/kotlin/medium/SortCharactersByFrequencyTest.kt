package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SortCharactersByFrequencyTest {

    @Test
    fun test1() {
        val s = "tree"
        val expected = "eetr"

        assertEquals(expected, SortCharactersByFrequency.frequencySort(s))
    }

    @Test
    fun test2() {
        val s = "cccaaa"
        val expected = "cccaaa"

        assertEquals(expected, SortCharactersByFrequency.frequencySort(s))
    }

    @Test
    fun test3() {
        val s = "Aabb"
        val expected = "bbAa"

        assertEquals(expected, SortCharactersByFrequency.frequencySort(s))
    }
}