package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RedistributeCharactersToMakeAllStringsEqualTest {
    @Test
    fun test1() {
        val words = arrayOf("abc", "aabc", "bc")
        val expected = true

        assertEquals(expected, RedistributeCharactersToMakeAllStringsEqual.makeEqual(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("ab", "a")
        val expected = false

        assertEquals(expected, RedistributeCharactersToMakeAllStringsEqual.makeEqual(words))
    }
}