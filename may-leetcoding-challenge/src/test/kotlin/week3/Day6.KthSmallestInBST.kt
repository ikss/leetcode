package week3

import org.junit.jupiter.api.Test
import week3.KthSmallestInBST.TreeNode
import kotlin.test.assertEquals

class KthSmallestInBSTTest {

    @Test
    fun test1() {
        val root = TreeNode(3).apply {
            left = TreeNode(1).apply {
                right = TreeNode(2)
            }
            right = TreeNode(4)
        }
        assertEquals(1, KthSmallestInBST.kthSmallest(root, 1))
    }

    @Test
    fun test2() {
        val root = TreeNode(5).apply {
            left = TreeNode(3).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(1)
                }
                right = TreeNode(4)
            }
            right = TreeNode(6)
        }
        assertEquals(3, KthSmallestInBST.kthSmallest(root, 3))
    }
}
