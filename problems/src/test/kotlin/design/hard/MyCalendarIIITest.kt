package design.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MyCalendarIIITest {
    @Test
    fun test1naive() {
        val myCalendarThree = MyCalendarIII.MyCalendarIIINaive()
        assertEquals(1, myCalendarThree.book(10, 20))
        assertEquals(1, myCalendarThree.book(50, 60))
        assertEquals(2, myCalendarThree.book(10, 40))
        assertEquals(3, myCalendarThree.book(5, 15))
        assertEquals(3, myCalendarThree.book(5, 10))
        assertEquals(3, myCalendarThree.book(25, 55))
    }

    @Test
    fun test1balancedMap() {
        val myCalendarThree = MyCalendarIII.MyCalendarIIIBalancedTree()
        assertEquals(1, myCalendarThree.book(10, 20))
        assertEquals(1, myCalendarThree.book(50, 60))
        assertEquals(2, myCalendarThree.book(10, 40))
        assertEquals(3, myCalendarThree.book(5, 15))
        assertEquals(3, myCalendarThree.book(5, 10))
        assertEquals(3, myCalendarThree.book(25, 55))
    }
}