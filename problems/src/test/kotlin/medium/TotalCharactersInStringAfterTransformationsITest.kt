package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TotalCharactersInStringAfterTransformationsITest {

    @Test
    fun test1() {
        val s = "abcyy"
        val t = 2
        val expected = 7

        assertEquals(expected, TotalCharactersInStringAfterTransformationsI.lengthAfterTransformations(s, t))
    }

    @Test
    fun test2() {
        val s = "azbk"
        val t = 1
        val expected = 5

        assertEquals(expected, TotalCharactersInStringAfterTransformationsI.lengthAfterTransformations(s, t))
    }
}