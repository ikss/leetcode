package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindSmallestLetterGreaterThanTargetTest {
    @Test
    fun test1() {
        val letters = charArrayOf('c', 'f', 'j')
        val target = 'a'
        val expected = 'c'

        assertEquals(expected, FindSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target))
    }

    @Test
    fun test2() {
        val letters = charArrayOf('c', 'f', 'j')
        val target = 'c'
        val expected = 'f'

        assertEquals(expected, FindSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target))
    }

    @Test
    fun test3() {
        val letters = charArrayOf('x', 'x', 'y', 'y')
        val target = 'z'
        val expected = 'x'

        assertEquals(expected, FindSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target))
    }
}