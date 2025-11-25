package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheWinnerOfAnArrayGameTest {
    @Test
    fun test1own() {
        val arr = intArrayOf(2, 1, 3, 5, 4, 6, 7)
        val k = 2
        val expected = 5

        assertEquals(expected, FindTheWinnerOfAnArrayGame.getWinnerOwn(arr, k))
    }

    @Test
    fun test2own() {
        val arr = intArrayOf(3, 2, 1)
        val k = 10
        val expected = 3

        assertEquals(expected, FindTheWinnerOfAnArrayGame.getWinnerOwn(arr, k))
    }

    @Test
    fun test3own() {
        val arr = intArrayOf(1, 11, 22, 33, 44, 55, 66, 77, 88, 99)
        val k = 1000000000
        val expected = 99

        assertEquals(expected, FindTheWinnerOfAnArrayGame.getWinnerOwn(arr, k))
    }
}