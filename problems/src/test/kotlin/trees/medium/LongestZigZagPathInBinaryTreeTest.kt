package trees.medium

import data_structures.TreeBuilder
import data_structures.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestZigZagPathInBinaryTreeTest {
    @Test
    fun test1mine() {
        val root = TreeNode(1).apply {
            right = TreeNode(1).apply {
                left = TreeNode(1)
                right = TreeNode(1).apply {
                    left = TreeNode(0).apply {
                        right = TreeNode(0).apply {
                            right = TreeNode(0)
                        }
                    }
                    right = TreeNode(1)
                }
            }
        }
        val expected = 3

        assertEquals(expected, LongestZigZagPathInBinaryTree.longestZigZagMine(root))
    }

    @Test
    fun test2mine() {
        val root = TreeNode(1).apply {
            left = TreeNode(1).apply {
                right = TreeNode(1).apply {
                    left = TreeNode(0).apply {
                        right = TreeNode(0)
                    }
                    right = TreeNode(1)
                }
            }
            right = TreeNode(1)
        }
        val expected = 4

        assertEquals(expected, LongestZigZagPathInBinaryTree.longestZigZagMine(root))
    }

    @Test
    fun tes3mine() {
        val root = TreeBuilder.build(1)
        val expected = 0

        assertEquals(expected, LongestZigZagPathInBinaryTree.longestZigZagMine(root))
    }

    @Test
    fun test1editorial() {
        val root = TreeNode(1).apply {
            right = TreeNode(1).apply {
                left = TreeNode(1)
                right = TreeNode(1).apply {
                    left = TreeNode(0).apply {
                        right = TreeNode(0).apply {
                            right = TreeNode(0)
                        }
                    }
                    right = TreeNode(1)
                }
            }
        }
        val expected = 3

        assertEquals(expected, LongestZigZagPathInBinaryTree.longestZigZagEditorial(root))
    }

    @Test
    fun test2editorial() {
        val root = TreeNode(1).apply {
            left = TreeNode(1).apply {
                right = TreeNode(1).apply {
                    left = TreeNode(0).apply {
                        right = TreeNode(0)
                    }
                    right = TreeNode(1)
                }
            }
            right = TreeNode(1)
        }
        val expected = 4

        assertEquals(expected, LongestZigZagPathInBinaryTree.longestZigZagEditorial(root))
    }

    @Test
    fun tes3editorial() {
        val root = TreeBuilder.build(1)
        val expected = 0

        assertEquals(expected, LongestZigZagPathInBinaryTree.longestZigZagEditorial(root))

    }
}