package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReorganizeStringKApartTest {
    @Test
    fun test1() {
        val input = "aaabc"
        val k = 3
        val expected = ""

        assertEquals(expected, ReorganizeStringKApart.reorganizeString(input, k))
    }

    @Test
    fun test2() {
        val input = "aaaabbbccd"
        val k = 3
        val expected = "abcabcabda"

        assertEquals(expected, ReorganizeStringKApart.reorganizeString(input, k))
    }
}