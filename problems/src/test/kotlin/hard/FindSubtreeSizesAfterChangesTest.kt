package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindSubtreeSizesAfterChangesTest {
    @Test
    fun test1() {
        val parent = intArrayOf(-1, 0, 0, 1, 1, 1)
        val s = "abaabc"
        val expected = intArrayOf(6, 3, 1, 1, 1, 1)

        assertArrayEquals(expected, FindSubtreeSizesAfterChanges.findSubtreeSizes(parent, s))
    }

    @Test
    fun test2() {
        val parent = intArrayOf(-1, 0, 4, 0, 1)
        val s = "abbba"
        val expected = intArrayOf(5, 2, 1, 1, 1)

        assertArrayEquals(expected, FindSubtreeSizesAfterChanges.findSubtreeSizes(parent, s))
    }
}