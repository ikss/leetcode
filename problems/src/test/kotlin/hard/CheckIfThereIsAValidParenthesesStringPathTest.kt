package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfThereIsAValidParenthesesStringPathTest {
    @Test
    fun test1() {
        val grid = arrayOf(
            charArrayOf('(', '(', '('),
            charArrayOf(')', '(', ')'),
            charArrayOf('(', '(', ')'),
            charArrayOf('(', '(', ')'),
        )
        val expected = true

        assertEquals(expected, CheckIfThereIsAValidParenthesesStringPath.hasValidPath(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            charArrayOf(')', ')'),
            charArrayOf('(', '('),
        )
        val expected = false

        assertEquals(expected, CheckIfThereIsAValidParenthesesStringPath.hasValidPath(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf(
            charArrayOf(')', ')', '('),
            charArrayOf('(', '(', '('),
        )
        val expected = false

        assertEquals(expected, CheckIfThereIsAValidParenthesesStringPath.hasValidPath(grid))
    }

    @Test
    fun test4() {
        val grid = arrayOf(
            charArrayOf('(', ')'),
            charArrayOf('(', ')'),
            charArrayOf('(', '('),
        )
        val expected = false

        assertEquals(expected, CheckIfThereIsAValidParenthesesStringPath.hasValidPath(grid))
    }
}