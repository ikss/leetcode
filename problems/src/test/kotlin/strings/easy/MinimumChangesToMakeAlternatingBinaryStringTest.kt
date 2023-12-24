package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumChangesToMakeAlternatingBinaryStringTest {
    @Test
    fun test1() {
        val s = "0100"
        val output = 1
        assertEquals(output, MinimumChangesToMakeAlternatingBinaryString.minOperations(s))
    }

    @Test
    fun test2() {
        val s = "10"
        val output = 0
        assertEquals(output, MinimumChangesToMakeAlternatingBinaryString.minOperations(s))
    }

    @Test
    fun test3() {
        val s = "1111"
        val output = 2
        assertEquals(output, MinimumChangesToMakeAlternatingBinaryString.minOperations(s))
    }

    @Test
    fun test4() {
        val s = "110010"
        val output = 2
        assertEquals(output, MinimumChangesToMakeAlternatingBinaryString.minOperations(s))
    }
}