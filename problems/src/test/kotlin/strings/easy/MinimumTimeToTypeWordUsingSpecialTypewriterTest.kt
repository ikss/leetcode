package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumTimeToTypeWordUsingSpecialTypewriterTest {
    @Test
    fun test1() {
        val word = "abc"
        val expected = 5

        assertEquals(expected, MinimumTimeToTypeWordUsingSpecialTypewriter.minTimeToType(word))
    }

    @Test
    fun test2() {
        val word = "bza"
        val expected = 7

        assertEquals(expected, MinimumTimeToTypeWordUsingSpecialTypewriter.minTimeToType(word))
    }

    @Test
    fun test3() {
        val word = "zjpc"
        val expected = 34

        assertEquals(expected, MinimumTimeToTypeWordUsingSpecialTypewriter.minTimeToType(word))
    }
}