package linked_lists.medium

import linked_lists.medium.AddTwoPolynomialsRepresentedAsLinkedLists.PolyNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddTwoPolynomialsRepresentedAsLinkedListsTest {
    @Test
    fun test1() {
        val a = PolyNode(1, 1)
        val b = PolyNode(1, 0)
        val expected = PolyNode(1, 1, PolyNode(1, 0))

        assertEquals(expected, AddTwoPolynomialsRepresentedAsLinkedLists.addPoly(a, b))
    }
    
    @Test
    fun test2() {
        val a = PolyNode(2, 2, PolyNode(4, 1, PolyNode(3, 0)))
        val b = PolyNode(3, 2, PolyNode(-4, 1, PolyNode(-1, 0)))
        val expected = PolyNode(5, 2, PolyNode(2, 0))

        assertEquals(expected, AddTwoPolynomialsRepresentedAsLinkedLists.addPoly(a, b))
    }
    
    @Test
    fun test3() {
        val a = PolyNode(1, 2)
        val b = PolyNode(-1, 2)
        val expected = null

        assertEquals(expected, AddTwoPolynomialsRepresentedAsLinkedLists.addPoly(a, b))
    }
}