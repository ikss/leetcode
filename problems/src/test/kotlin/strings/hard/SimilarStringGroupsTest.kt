package strings.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SimilarStringGroupsTest {

    @Test
    fun test1() {
        val strs = arrayOf("tars", "rats", "arts", "star")
        val expected = 2

        assertEquals(expected, SimilarStringGroups.numSimilarGroups(strs))
    }

    @Test
    fun test2() {
        val strs = arrayOf("omv", "ovm")
        val expected = 1

        assertEquals(expected, SimilarStringGroups.numSimilarGroups(strs))
    }
}