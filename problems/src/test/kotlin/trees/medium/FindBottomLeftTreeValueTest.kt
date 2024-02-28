package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindBottomLeftTreeValueTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(2, 1, 3)!!
        val expected = 1

        assertEquals(expected, FindBottomLeftTreeValue.findBottomLeftValue(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 3, 4, null, 5, 6, null, null, 7)!!
        val expected = 7

        assertEquals(expected, FindBottomLeftTreeValue.findBottomLeftValue(root))
    }
}