package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemovingMinimumNumberOfMagicBeansTest {
    @Test
    fun test1() {
        val input = intArrayOf(4, 1, 6, 5)
        val expected = 4L

        assertEquals(expected, RemovingMinimumNumberOfMagicBeans.minimumRemoval(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(2, 10, 3, 2)
        val expected = 7L

        assertEquals(expected, RemovingMinimumNumberOfMagicBeans.minimumRemoval(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(5, 5, 5, 5, 5)
        val expected = 0L

        assertEquals(expected, RemovingMinimumNumberOfMagicBeans.minimumRemoval(input))
    }
}