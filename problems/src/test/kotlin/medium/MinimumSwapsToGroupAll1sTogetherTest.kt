package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumSwapsToGroupAll1sTogetherTest {
    @Test
    fun test1() {
        val data = intArrayOf(1, 0, 1, 0, 1)
        val expected = 1

        assertEquals(expected, MinimumSwapsToGroupAll1sTogether.minSwaps(data))
    }

    @Test
    fun test2() {
        val data = intArrayOf(0, 0, 0, 1, 0)
        val expected = 0

        assertEquals(expected, MinimumSwapsToGroupAll1sTogether.minSwaps(data))
    }

    @Test
    fun test3() {
        val data = intArrayOf(1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1)
        val expected = 3

        assertEquals(expected, MinimumSwapsToGroupAll1sTogether.minSwaps(data))
    }
}