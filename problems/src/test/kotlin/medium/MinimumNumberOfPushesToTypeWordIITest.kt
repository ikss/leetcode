package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfPushesToTypeWordIITest {
    @Test
    fun test1() {
        val word = "abcde"
        val expected = 5

        assertEquals(expected, MinimumNumberOfPushesToTypeWordII.minimumPushes(word))
    }

    @Test
    fun test2() {
        val word = "xyzxyzxyzxyz"
        val expected = 12

        assertEquals(expected, MinimumNumberOfPushesToTypeWordII.minimumPushes(word))
    }

    @Test
    fun test3() {
        val word = "aabbccddeeffgghhiiiiii"
        val expected = 24

        assertEquals(expected, MinimumNumberOfPushesToTypeWordII.minimumPushes(word))
    }
}