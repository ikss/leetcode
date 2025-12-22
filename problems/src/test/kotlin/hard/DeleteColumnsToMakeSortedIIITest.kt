package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteColumnsToMakeSortedIIITest {
    @Test
    fun test1() {
        val strs = arrayOf("babca", "bbazb")
        val expected = 3

        assertEquals(expected, DeleteColumnsToMakeSortedIII.minDeletionSize(strs))
    }

    @Test
    fun test2() {
        val strs = arrayOf("edcba")
        val expected = 4

        assertEquals(expected, DeleteColumnsToMakeSortedIII.minDeletionSize(strs))
    }

    @Test
    fun test3() {
        val strs = arrayOf("ghi", "def", "abc")
        val expected = 0

        assertEquals(expected, DeleteColumnsToMakeSortedIII.minDeletionSize(strs))
    }
}