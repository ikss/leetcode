package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DecodedStringAtIndexTest {

    @Test
    fun test1() {
        val s = "leet2code3"
        val k = 10
        val expected = "o"

        assertEquals(expected, DecodedStringAtIndex.decodeAtIndex(s, k))
    }

    @Test
    fun test2() {
        val s = "ha22"
        val k = 5
        val expected = "h"

        assertEquals(expected, DecodedStringAtIndex.decodeAtIndex(s, k))
    }

    @Test
    fun test3() {
        val s = "a2345678999999999999999"
        val k = 1
        val expected = "a"

        assertEquals(expected, DecodedStringAtIndex.decodeAtIndex(s, k))
    }

    @Test
    fun test4() {
        val s = "a23"
        val k = 6
        val expected = "a"

        assertEquals(expected, DecodedStringAtIndex.decodeAtIndex(s, k))
    }
}