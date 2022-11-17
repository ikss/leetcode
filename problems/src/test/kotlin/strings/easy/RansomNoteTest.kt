package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RansomNoteTest {
    @Test
    fun test1() {
        val ransomNote = "a"
        val magazine = "b"
        val expected = false

        assertEquals(expected, RansomNote.canConstruct(ransomNote, magazine))
    }

    @Test
    fun test2() {
        val ransomNote = "aa"
        val magazine = "bb"
        val expected = false

        assertEquals(expected, RansomNote.canConstruct(ransomNote, magazine))
    }

    @Test
    fun test3() {
        val ransomNote = "aa"
        val magazine = "aab"
        val expected = true

        assertEquals(expected, RansomNote.canConstruct(ransomNote, magazine))
    }
}
