package data_structures.other_data_structures.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConvertSortedArrayToBSTTest {

    @Test
    fun test1() {
        val array = intArrayOf(-10, -3, 0, 5, 9)
        val expected = TreeBuilder.build(listOf(0, -10, 5, null, -3, null, 9))

        assertEquals(expected, ConvertSortedArrayToBST.sortedArrayToBST(array))
    }

    @Test
    fun test2() {
        val array = intArrayOf(1, 3)
        val expected = TreeBuilder.build(listOf(1, null, 3))

        assertEquals(expected, ConvertSortedArrayToBST.sortedArrayToBST(array))
    }
}
