package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PalindromeNumberTest {

    @Test
    fun test1() {
        val number = 121
        val expected = true

        assertEquals(expected, PalindromeNumber.isPalindrome(number))
    }

    @Test
    fun test2() {
        val number = -123
        val expected = false

        assertEquals(expected, PalindromeNumber.isPalindrome(number))
    }

    @Test
    fun test3() {
        val number = 10
        val expected = false

        assertEquals(expected, PalindromeNumber.isPalindrome(number))
    }

    @Test
    fun test4() {
        val number = -101
        val expected = false

        assertEquals(expected, PalindromeNumber.isPalindrome(number))
    }

    @Test
    fun test5() {
        val number = Integer.MAX_VALUE
        val expected = false

        assertEquals(expected, PalindromeNumber.isPalindrome(number))
    }
}
