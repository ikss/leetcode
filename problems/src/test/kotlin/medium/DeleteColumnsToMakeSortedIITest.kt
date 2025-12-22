package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteColumnsToMakeSortedIITest {
    @Test
    fun test1() {
        val strs = arrayOf("ca", "bb", "ac")
        val expected = 1

        assertEquals(expected, DeleteColumnsToMakeSortedII.minDeletionSize(strs))
    }

    @Test
    fun test2() {
        val strs = arrayOf("xc", "yb", "za")
        val expected = 0

        assertEquals(expected, DeleteColumnsToMakeSortedII.minDeletionSize(strs))
    }

    @Test
    fun test3() {
        val strs = arrayOf("zyx", "wvu", "tsr")
        val expected = 3

        assertEquals(expected, DeleteColumnsToMakeSortedII.minDeletionSize(strs))
    }
}