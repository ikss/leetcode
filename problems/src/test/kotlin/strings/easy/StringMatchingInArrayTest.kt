package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringMatchingInArrayTest {
    @Test
    fun test1() {
        val input = arrayOf("mass", "as", "hero", "superhero")
        val expected = listOf("as", "hero")

        assertEquals(expected, StringMatchingInArray.stringMatching(input))
    }

    @Test
    fun test2() {
        val input = arrayOf("leetcode", "et", "code")
        val expected = listOf("et", "code")

        assertEquals(expected, StringMatchingInArray.stringMatching(input))
    }

    @Test
    fun test3() {
        val input = arrayOf("blue", "green", "bu")
        val expected = emptyList<String>()

        assertEquals(expected, StringMatchingInArray.stringMatching(input))
    }

    @Test
    fun test4() {
        val input = arrayOf("leetcoder", "leetcode", "od", "hamlet", "am")
        val expected = listOf("leetcode", "od", "am")

        assertEquals(expected, StringMatchingInArray.stringMatching(input))
    }
}