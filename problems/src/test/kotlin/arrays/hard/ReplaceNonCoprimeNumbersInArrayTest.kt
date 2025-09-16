package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReplaceNonCoprimeNumbersInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(6, 4, 3, 2, 7, 6, 2)
        val expected = listOf(12, 7, 6)

        assertEquals(expected, ReplaceNonCoprimeNumbersInArray.replaceNonCoprimes(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 1, 1, 3, 3, 3)
        val expected = listOf(2, 1, 1, 3)

        assertEquals(expected, ReplaceNonCoprimeNumbersInArray.replaceNonCoprimes(nums))
    }
}