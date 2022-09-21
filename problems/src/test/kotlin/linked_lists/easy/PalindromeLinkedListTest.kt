package linked_lists.easy

import data_structures.ListBuilder
import data_structures.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PalindromeLinkedListTest {

    @Test
    fun test1() {
        val list = ListNode(1)
        val expected = true

        assertEquals(expected, PalindromeLinkedList.isPalindrome(list))
    }

    @Test
    fun test2() {
        val list = ListBuilder.build(1, 2, 3, 4)
        val expected = false

        assertEquals(expected, PalindromeLinkedList.isPalindrome(list))
    }

    @Test
    fun test3() {
        val list = ListBuilder.build(1, 2, 3, 4, 3, 2, 1)
        val expected = true

        assertEquals(expected, PalindromeLinkedList.isPalindrome(list))
    }
}
