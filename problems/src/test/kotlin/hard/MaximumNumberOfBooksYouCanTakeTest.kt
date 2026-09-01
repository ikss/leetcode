package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfBooksYouCanTakeTest {
    @Test
    fun test1() {
        val books = intArrayOf(8, 5, 2, 7, 9)
        val expected = 19L

        assertEquals(expected, MaximumNumberOfBooksYouCanTake.maximumBooks(books))
    }

    @Test
    fun test2() {
        val books = intArrayOf(7, 0, 3, 4, 5)
        val expected = 12L

        assertEquals(expected, MaximumNumberOfBooksYouCanTake.maximumBooks(books))
    }

    @Test
    fun test3() {
        val books = intArrayOf(8, 2, 3, 7, 3, 4, 0, 1, 4, 3)
        val expected = 13L

        assertEquals(expected, MaximumNumberOfBooksYouCanTake.maximumBooks(books))
    }
}