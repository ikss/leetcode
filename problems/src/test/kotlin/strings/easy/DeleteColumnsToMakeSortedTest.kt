package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DeleteColumnsToMakeSortedTest {

    @Test
    fun test1() {
        val strs = arrayOf("cba", "daf", "ghi")
        val expected = 1

        assertEquals(expected, DeleteColumnsToMakeSorted.minDeletionSize(strs))
    }

    @Test
    fun test2() {
        val strs = arrayOf("a", "b")
        val expected = 0

        assertEquals(expected, DeleteColumnsToMakeSorted.minDeletionSize(strs))
    }

    @Test
    fun test3() {
        val strs = arrayOf("zyx", "wvu", "tsr")
        val expected = 3

        assertEquals(expected, DeleteColumnsToMakeSorted.minDeletionSize(strs))
    }
}