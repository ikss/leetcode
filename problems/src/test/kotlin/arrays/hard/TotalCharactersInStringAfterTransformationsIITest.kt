package arrays.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TotalCharactersInStringAfterTransformationsIITest {
    @Test
    fun test1() {
        val s = "abcyy"
        val t = 2
        val nums = listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2)
        val expected = 7

        assertEquals(expected, TotalCharactersInStringAfterTransformationsII.lengthAfterTransformations(s, t, nums))
    }

    @Test
    fun test2() {
        val s = "azbk"
        val t = 1
        val nums = listOf(2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2)
        val expected = 8

        assertEquals(expected, TotalCharactersInStringAfterTransformationsII.lengthAfterTransformations(s, t, nums))
    }
}