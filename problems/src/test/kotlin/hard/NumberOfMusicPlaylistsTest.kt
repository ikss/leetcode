package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfMusicPlaylistsTest {
    @Test
    fun test1dp() {
        val n = 3
        val l = 3
        val k = 1
        val expected = 6

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylistsDp(n, l, k))
    }

    @Test
    fun test2dp() {
        val n = 2
        val l = 3
        val k = 0
        val expected = 6

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylistsDp(n, l, k))
    }

    @Test
    fun test3dp() {
        val n = 2
        val l = 3
        val k = 1
        val expected = 2

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylistsDp(n, l, k))
    }

    @Test
    fun test1recursive() {
        val n = 3
        val l = 3
        val k = 1
        val expected = 6

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylistsRecursive(n, l, k))
    }

    @Test
    fun test2recursive() {
        val n = 2
        val l = 3
        val k = 0
        val expected = 6

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylistsRecursive(n, l, k))
    }

    @Test
    fun test3recursive() {
        val n = 2
        val l = 3
        val k = 1
        val expected = 2

        assertEquals(expected, NumberOfMusicPlaylists.numMusicPlaylistsRecursive(n, l, k))
    }
}