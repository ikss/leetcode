package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeTheStringGreatTest {
    @Test
    fun test1cycle() {
        val s = "leEeetcode"
        val expected = "leetcode"

        assertEquals(expected, MakeTheStringGreat.makeGoodCycle(s))
    }

    @Test
    fun test2cycle() {
        val s = "s"
        val expected = "s"

        assertEquals(expected, MakeTheStringGreat.makeGoodCycle(s))
    }

    @Test
    fun test3cycle() {
        val s = ""
        val expected = ""

        assertEquals(expected, MakeTheStringGreat.makeGoodCycle(s))
    }

    @Test
    fun test4cycle() {
        val s = "abBAcC"
        val expected = ""

        assertEquals(expected, MakeTheStringGreat.makeGoodCycle(s))
    }

    @Test
    fun test1stack() {
        val s = "leEeetcode"
        val expected = "leetcode"

        assertEquals(expected, MakeTheStringGreat.makeGoodStack(s))
    }

    @Test
    fun test2stack() {
        val s = "s"
        val expected = "s"

        assertEquals(expected, MakeTheStringGreat.makeGoodStack(s))
    }

    @Test
    fun test3stack() {
        val s = ""
        val expected = ""

        assertEquals(expected, MakeTheStringGreat.makeGoodStack(s))
    }

    @Test
    fun test4stack() {
        val s = "abBAcC"
        val expected = ""

        assertEquals(expected, MakeTheStringGreat.makeGoodStack(s))
    }
}