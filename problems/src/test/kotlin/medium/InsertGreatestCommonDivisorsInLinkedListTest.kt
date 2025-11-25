package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InsertGreatestCommonDivisorsInLinkedListTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(18, 6, 10, 3)
        val expected = ListBuilder.build(18, 6, 6, 2, 10, 1, 3)
        
        assertEquals(expected, InsertGreatestCommonDivisorsInLinkedList.insertGreatestCommonDivisors(head))
    }
    
    @Test
    fun test2() {
        val head = ListBuilder.build(7)
        val expected = ListBuilder.build(7)
        
        assertEquals(expected, InsertGreatestCommonDivisorsInLinkedList.insertGreatestCommonDivisors(head))
    }
}