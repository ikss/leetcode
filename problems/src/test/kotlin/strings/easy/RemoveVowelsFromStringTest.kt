package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveVowelsFromStringTest {
    @Test
    fun test1oneLiner() {
        val s = "leetcodeisacommunityforcoders"
        val expected = "ltcdscmmntyfrcdrs"

        assertEquals(expected, RemoveVowelsFromString.removeVowelsOneLiner(s))
    }

    @Test
    fun test2oneLiner() {
        val s = "aeiou"
        val expected = ""

        assertEquals(expected, RemoveVowelsFromString.removeVowelsOneLiner(s))
    }

    @Test
    fun test1stringBuilder() {
        val s = "leetcodeisacommunityforcoders"
        val expected = "ltcdscmmntyfrcdrs"

        assertEquals(expected, RemoveVowelsFromString.removeVowelsStringBuilder(s))
    }

    @Test
    fun test2stringBuilder() {
        val s = "aeiou"
        val expected = ""

        assertEquals(expected, RemoveVowelsFromString.removeVowelsStringBuilder(s))
    }
}