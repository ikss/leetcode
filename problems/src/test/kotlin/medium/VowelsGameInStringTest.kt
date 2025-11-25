package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VowelsGameInStringTest {
    @Test
    fun test1() {
        val s = "leetcoder"
        val expected = true

        assertEquals(expected, VowelsGameInString.doesAliceWin(s))
    }

    @Test
    fun test2() {
        val s = "bbcd"
        val expected = false

        assertEquals(expected, VowelsGameInString.doesAliceWin(s))
    }

    @Test
    fun test3() {
        val s = "abc"
        val expected = true

        assertEquals(expected, VowelsGameInString.doesAliceWin(s))
    }
}