package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfMusicPlaylistsTest {
    @Test
    fun test1() {
        val n = 3
        val l = 3
        val k = 1
        val expected = 6

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylists(n, l, k))
    }

    @Test
    fun test2() {
        val n = 2
        val l = 3
        val k = 0
        val expected = 6

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylists(n, l, k))
    }

    @Test
    fun test3() {
        val n = 2
        val l = 3
        val k = 1
        val expected = 2

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylists(n, l, k))
    }
}