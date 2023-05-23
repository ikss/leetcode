package design.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthLargestElementInStreamTest {

    @Test
    fun test1() {
        val kthLargest = KthLargestElementInStream.KthLargest(3, intArrayOf(4, 5, 8, 2))
        assertEquals(4, kthLargest.add(3))   // return 4
        assertEquals(5, kthLargest.add(5))   // return 5
        assertEquals(5, kthLargest.add(10))  // return 5
        assertEquals(8, kthLargest.add(9))   // return 8
        assertEquals(8, kthLargest.add(4))   // return 8
    }
}