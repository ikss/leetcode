package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxChunksToMakeSortedIITest {
    @Test
    fun test1hashTrack() {
        val arr = intArrayOf(5, 4, 3, 2, 1)
        val expected = 1

        assertEquals(expected, MaxChunksToMakeSortedII.maxChunksToSortedHashTrack(arr))
    }

    @Test
    fun test2hashTrack() {
        val arr = intArrayOf(2, 1, 3, 4, 4)
        val expected = 4

        assertEquals(expected, MaxChunksToMakeSortedII.maxChunksToSortedHashTrack(arr))
    }

    @Test
    fun test1MinOfRight() {
        val arr = intArrayOf(5, 4, 3, 2, 1)
        val expected = 1

        assertEquals(expected, MaxChunksToMakeSortedII.maxChunksToSortedMinOfRight(arr))
    }

    @Test
    fun test2MinOfRight() {
        val arr = intArrayOf(2, 1, 3, 4, 4)
        val expected = 4

        assertEquals(expected, MaxChunksToMakeSortedII.maxChunksToSortedMinOfRight(arr))
    }
}