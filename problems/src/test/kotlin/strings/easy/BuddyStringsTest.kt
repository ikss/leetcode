package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BuddyStringsTest {
    @Test
    fun test1() {
        val s = "ab"
        val goal = "ba"
        val expected = true
        assertEquals(expected, BuddyStrings.buddyStrings(s, goal))
    }

    @Test
    fun test2() {
        val s = "ab"
        val goal = "ab"
        val expected = false
        assertEquals(expected, BuddyStrings.buddyStrings(s, goal))
    }

    @Test
    fun test3() {
        val s = "aa"
        val goal = "aa"
        val expected = true
        assertEquals(expected, BuddyStrings.buddyStrings(s, goal))
    }
}