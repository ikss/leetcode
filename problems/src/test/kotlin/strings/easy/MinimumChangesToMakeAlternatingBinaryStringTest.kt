package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumChangesToMakeAlternatingBinaryStringTest {
    @Test
    fun test1() {
        val s = "0100"
        val expected = 1
        assertEquals(expected, MinimumChangesToMakeAlternatingBinaryString.minOperations(s))
    }

    @Test
    fun test2() {
        val s = "10"
        val expected = 0
        assertEquals(expected, MinimumChangesToMakeAlternatingBinaryString.minOperations(s))
    }

    @Test
    fun test3() {
        val s = "1111"
        val expected = 2
        assertEquals(expected, MinimumChangesToMakeAlternatingBinaryString.minOperations(s))
    }

    @Test
    fun test4() {
        val s = "110010"
        val expected = 2
        assertEquals(expected, MinimumChangesToMakeAlternatingBinaryString.minOperations(s))
    }
}