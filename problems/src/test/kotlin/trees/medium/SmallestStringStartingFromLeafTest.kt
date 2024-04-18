package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestStringStartingFromLeafTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(0, 1, 2, 3, 4, 3, 4)!!
        val expected = "dba"

        assertEquals(expected, SmallestStringStartingFromLeaf.smallestFromLeaf(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(25, 1, 3, 1, 3, 0, 2)!!
        val expected = "adz"

        assertEquals(expected, SmallestStringStartingFromLeaf.smallestFromLeaf(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(2, 2, 1, null, 1, 0, null, 0)!!
        val expected = "abc"

        assertEquals(expected, SmallestStringStartingFromLeaf.smallestFromLeaf(root))
    }
}