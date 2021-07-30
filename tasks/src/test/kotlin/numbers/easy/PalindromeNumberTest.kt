package numbers.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PalindromeNumberTest {

    @Test
    fun test1() {
        val number = 121
        val excepted = true
        assertEquals(excepted, PalindromeNumber.isPalindrome(number))
    }

    @Test
    fun test2() {
        val number = -123
        val excepted = false
        assertEquals(excepted, PalindromeNumber.isPalindrome(number))
    }

    @Test
    fun test3() {
        val number = 10
        val excepted = false
        assertEquals(excepted, PalindromeNumber.isPalindrome(number))
    }

    @Test
    fun test4() {
        val number = -101
        val excepted = false
        assertEquals(excepted, PalindromeNumber.isPalindrome(number))
    }

    @Test
    fun test5() {
        val int = Integer.MAX_VALUE
        val excepted = 0
        assertEquals(excepted, ReverseInteger.reverse(int))
    }
}
