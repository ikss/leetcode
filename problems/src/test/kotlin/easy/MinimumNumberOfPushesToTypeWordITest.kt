package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfPushesToTypeWordITest {
    @Test
    fun test1() {
        val word = "abcde"
        val expected = 5

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushes(word))
    }

    @Test
    fun test2() {
        val word = "xycdefghij"
        val expected = 12

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushes(word))
    }

    @Test
    fun test3() {
        val word = ""
        val expected = 0

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushes(word))
    }
}