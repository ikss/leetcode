package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveSubFoldersFromTheFilesystemTest {
    @Test
    fun test1() {
        val input = arrayOf("/a", "/a/b", "/c/d", "/c/d/e", "/c/f")
        val expected = listOf("/a", "/c/d", "/c/f")

        assertEquals(expected, RemoveSubFoldersFromTheFilesystem.removeSubfolders(input))
    }

    @Test
    fun test2() {
        val input = arrayOf("/a", "/a/b/c", "/a/b/d")
        val expected = listOf("/a")

        assertEquals(expected, RemoveSubFoldersFromTheFilesystem.removeSubfolders(input))
    }

    @Test
    fun test3() {
        val input = arrayOf("/a/b/c", "/a/b/ca", "/a/b/d")
        val expected = listOf("/a/b/c", "/a/b/ca", "/a/b/d")

        assertEquals(expected, RemoveSubFoldersFromTheFilesystem.removeSubfolders(input))
    }
}