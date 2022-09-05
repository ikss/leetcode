package data_structures.other_data_structures.medium

import data_structures.NaryTreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NaryTreeLevelOrderTraversalTest {

    @Test
    fun test1() {
        val root = NaryTreeNode(
            1, listOf(
                NaryTreeNode(3, listOf(NaryTreeNode(5), NaryTreeNode(6))),
                NaryTreeNode(2),
                NaryTreeNode(4),
            )
        )
        val expected = listOf(listOf(1), listOf(3, 2, 4), listOf(5, 6))

        assertEquals(expected, NaryTreeLevelOrderTraversal.levelOrder(root))
    }

    @Test
    fun test2() {
        val root = NaryTreeNode(
            1, listOf(
                NaryTreeNode(2),
                NaryTreeNode(
                    3, listOf(
                        NaryTreeNode(6),
                        NaryTreeNode(7, listOf(NaryTreeNode(11, listOf(NaryTreeNode(14))))),
                    )
                ),
                NaryTreeNode(4, listOf(NaryTreeNode(8, listOf(NaryTreeNode(12))))),
                NaryTreeNode(5, listOf(NaryTreeNode(9, listOf(NaryTreeNode(13))), NaryTreeNode(10))),
            )
        )
        val expected = listOf(listOf(1), listOf(2, 3, 4, 5), listOf(6, 7, 8, 9, 10), listOf(11, 12, 13), listOf(14))

        assertEquals(expected, NaryTreeLevelOrderTraversal.levelOrder(root))
    }
}
