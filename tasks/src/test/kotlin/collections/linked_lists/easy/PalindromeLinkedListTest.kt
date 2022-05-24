package collections.linked_lists.easy

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeLinkedListTest {

    @Test
    fun test1() {
        val list = ListNode(1)
        assertTrue(PalindromeLinkedList.isPalindrome(list))
    }

    @Test
    fun test2() {
        val list = ListBuilder.build(1, 2, 3, 4)
        assertFalse(PalindromeLinkedList.isPalindrome(list))
    }

    @Test
    fun test3() {
        val list = ListBuilder.build(1, 2, 3, 4, 3, 2, 1)
        assertTrue(PalindromeLinkedList.isPalindrome(list))
    }
}
