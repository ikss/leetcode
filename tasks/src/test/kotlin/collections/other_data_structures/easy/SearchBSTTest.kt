package collections.other_data_structures.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SearchBSTTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(listOf(4, 2, 7, 1, 3))
        val expected = TreeBuilder.build(listOf(2, 1, 3))

        assertEquals(expected, SearchBST.searchBST(root, 2))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(listOf(4, 2, 7, 1, 3))

        assertEquals(null, SearchBST.searchBST(root, 5))
    }
}
