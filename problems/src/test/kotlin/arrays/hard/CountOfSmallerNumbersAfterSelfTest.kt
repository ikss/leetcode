package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountOfSmallerNumbersAfterSelfTest {

    @Test
    fun test1() {
        val nums = intArrayOf(-1)
        val expected = listOf(0)

        assertEquals(expected, CountOfSmallerNumbersAfterSelf.countSmaller(nums))
    }

    @Test
    fun test2() {
        val ratings = intArrayOf(-1, -1)
        val expected = listOf(0, 0)

        assertEquals(expected, CountOfSmallerNumbersAfterSelf.countSmaller(ratings))
    }

    @Test
    fun test3() {
        val ratings = intArrayOf(5, 2, 6, 1)
        val expected = listOf(2, 1, 1, 0)

        assertEquals(expected, CountOfSmallerNumbersAfterSelf.countSmaller(ratings))
    }
}
