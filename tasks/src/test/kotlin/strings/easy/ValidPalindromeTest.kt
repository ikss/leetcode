package strings.easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidPalindromeTest {

    @Test
    fun test1() {
        val str = "A man, a plan, a canal: Panama"
        assertTrue(ValidPalindrome.isPalindrome(str))
    }

    @Test
    fun test2() {
        val str = "race a car"
        assertFalse(ValidPalindrome.isPalindrome(str))
    }

    @Test
    fun test3() {
        val str = " "
        assertTrue(ValidPalindrome.isPalindrome(str))
    }
}
