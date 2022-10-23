package strings.easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ValidAnagramTest {

    @Test
    fun test1() {
        val s = "usa"
        val t = "asu"

        assertTrue(ValidAnagram.isAnagram(s, t))
    }

    @Test
    fun test2() {
        val s = "anagram"
        val t = "nagaram"

        assertTrue(ValidAnagram.isAnagram(s, t))
    }

    @Test
    fun test3() {
        val s = "rat"
        val t = "car"

        assertFalse(ValidAnagram.isAnagram(s, t))
    }
}
