package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteDuplicateFoldersInSystemTest {
    @Test
    fun test1() {
        val paths = listOf(listOf("a"), listOf("c"), listOf("d"), listOf("a", "b"), listOf("c", "b"), listOf("d", "a"))
        val expected = listOf(listOf("d"), listOf("d", "a"))

        assertEquals(expected, DeleteDuplicateFoldersInSystem.deleteDuplicateFolder(paths))
    }

    @Test
    fun test2() {
        val paths = listOf(
            listOf("a"),
            listOf("c"),
            listOf("a", "b"),
            listOf("c", "b"),
            listOf("a", "b", "x"),
            listOf("a", "b", "x", "y"),
            listOf("w"),
            listOf("w", "y"),
        )
        val expected = listOf(listOf("a"), listOf("a", "b"), listOf("c"), listOf("c", "b"))

        assertEquals(expected, DeleteDuplicateFoldersInSystem.deleteDuplicateFolder(paths))
    }

    @Test
    fun test3() {
        val paths = listOf(listOf("a", "b"), listOf("c", "d"), listOf("c"), listOf("a"))
        val expected = listOf(listOf("a"), listOf("a", "b"), listOf("c"), listOf("c", "d"))

        assertEquals(expected, DeleteDuplicateFoldersInSystem.deleteDuplicateFolder(paths))
    }
}