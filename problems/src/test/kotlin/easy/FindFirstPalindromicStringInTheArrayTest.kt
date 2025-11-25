package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindFirstPalindromicStringInTheArrayTest {
    @Test
    fun test1() {
        val words = arrayOf("abc", "car", "ada", "racecar", "cool")
        val expected = "ada"

        assertEquals(expected, FindFirstPalindromicStringInTheArray.firstPalindrome(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("notapalindrome", "racecar")
        val expected = "racecar"

        assertEquals(expected, FindFirstPalindromicStringInTheArray.firstPalindrome(words))
    }

    @Test
    fun test3() {
        val words = arrayOf("def", "ghi")
        val expected = ""

        assertEquals(expected, FindFirstPalindromicStringInTheArray.firstPalindrome(words))
    }
}