package week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

object SortCharsByFrequencyTest {

    @Test
    fun test1() {
        val input = "tree"
        assertEquals("eetr", SortCharsByFrequency.frequencySort(input))
    }

    @Test
    fun test2() {
        val input = "cccaaa"
        assertEquals("cccaaa", SortCharsByFrequency.frequencySort(input))
    }

    @Test
    fun test3() {
        val input = "Aabb"
        assertEquals("bbAa", SortCharsByFrequency.frequencySort(input))
    }
}
