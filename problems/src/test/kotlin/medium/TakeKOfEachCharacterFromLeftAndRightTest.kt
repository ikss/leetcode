package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TakeKOfEachCharacterFromLeftAndRightTest {
    @Test
    fun test1() {
        val s = "aabaaaacaabc"
        val k = 2
        val expected = 8

        assertEquals(expected, TakeKOfEachCharacterFromLeftAndRight.takeCharacters(s, k))
    }

    @Test
    fun test2() {
        val s = "a"
        val k = 1
        val expected = -1

        assertEquals(expected, TakeKOfEachCharacterFromLeftAndRight.takeCharacters(s, k))
    }
}