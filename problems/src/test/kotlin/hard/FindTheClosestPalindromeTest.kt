package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheClosestPalindromeTest {
    @Test
    fun test1() {
        val input = "123"
        val output = "121"

        assertEquals(output, FindTheClosestPalindrome.nearestPalindromic(input))
    }

    @Test
    fun test2() {
        val input = "1"
        val output = "0"

        assertEquals(output, FindTheClosestPalindrome.nearestPalindromic(input))
    }

    @Test
    fun test3() {
        val input = "10"
        val output = "9"

        assertEquals(output, FindTheClosestPalindrome.nearestPalindromic(input))
    }

    @Test
    fun test4() {
        val input = "100"
        val output = "99"

        assertEquals(output, FindTheClosestPalindrome.nearestPalindromic(input))
    }

    @Test
    fun test5() {
        val input = "9999"
        val output = "10001"

        assertEquals(output, FindTheClosestPalindrome.nearestPalindromic(input))
    }
}