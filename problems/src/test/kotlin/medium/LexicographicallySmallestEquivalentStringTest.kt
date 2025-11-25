package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LexicographicallySmallestEquivalentStringTest {

    @Test
    fun test1() {
        val s1 = "parker"
        val s2 = "morris"
        val baseStr = "parser"
        val expected = "makkek"

        assertEquals(expected, LexicographicallySmallestEquivalentString.smallestEquivalentString(s1, s2, baseStr))
    }

    @Test
    fun test2() {
        val s1 = "hello"
        val s2 = "world"
        val baseStr = "hold"
        val expected = "hdld"

        assertEquals(expected, LexicographicallySmallestEquivalentString.smallestEquivalentString(s1, s2, baseStr))
    }

    @Test
    fun test3() {
        val s1 = "leetcode"
        val s2 = "programs"
        val baseStr = "sourcecode"
        val expected = "aauaaaaada"

        assertEquals(expected, LexicographicallySmallestEquivalentString.smallestEquivalentString(s1, s2, baseStr))
    }
}