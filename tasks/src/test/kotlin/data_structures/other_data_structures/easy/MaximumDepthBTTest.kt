package data_structures.other_data_structures.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDepthBTTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(listOf(4, 2, 3, 1))

        assertEquals(3, MaximumDepthBT.maxDepth(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(listOf(1))

        assertEquals(1, MaximumDepthBT.maxDepth(root))
    }
}
