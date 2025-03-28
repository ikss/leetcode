package design.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstUniqueNumberTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 5)
        val firstUnique = FirstUniqueNumber.FirstUnique(nums)

        assertEquals(2, firstUnique.showFirstUnique())  // return 2
        firstUnique.add(5)                              // the queue is now [2,3,5,5]
        assertEquals(2, firstUnique.showFirstUnique())  // return 2
        firstUnique.add(2)                              // the queue is now [2,3,5,5,2]
        assertEquals(3, firstUnique.showFirstUnique())  // return 3
        firstUnique.add(3)                              // the queue is now [2,3,5,5,2,3]
        assertEquals(-1, firstUnique.showFirstUnique()) // return -1
    }
    
    @Test
    fun test2() {
        val nums = intArrayOf(7, 7, 7, 7, 7, 7)
        val firstUnique = FirstUniqueNumber.FirstUnique(nums)

        assertEquals(-1, firstUnique.showFirstUnique()) // return -1
        firstUnique.add(7)                              // the queue is now [7,7,7,7,7,7,7]
        firstUnique.add(3)                              // the queue is now [7,7,7,7,7,7,7,3]
        firstUnique.add(3)                              // the queue is now [7,7,7,7,7,7,7,3,3]
        firstUnique.add(7)                              // the queue is now [7,7,7,7,7,7,7,3,3,7]
        firstUnique.add(17)                             // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
        assertEquals(17, firstUnique.showFirstUnique()) // return 17
    }
    
    @Test
    fun test3() {
        val nums = intArrayOf(809)
        val firstUnique = FirstUniqueNumber.FirstUnique(nums)

        assertEquals(809, firstUnique.showFirstUnique()) // return 809
        firstUnique.add(809)                            // the queue is now [809,809]
        assertEquals(-1, firstUnique.showFirstUnique()) // return -1
    }
    
}