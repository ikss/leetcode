package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDepthBTTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(4, 2, 3, 1)

        assertEquals(3, MaximumDepthBT.maxDepth(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)

        assertEquals(1, MaximumDepthBT.maxDepth(root))
    }
}
