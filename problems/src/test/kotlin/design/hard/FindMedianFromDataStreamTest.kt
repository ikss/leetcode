package design.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMedianFromDataStreamTest {
    @Test
    fun test1() {
        val medianFinder = FindMedianFromDataStream.MedianFinder()
        medianFinder.addNum(1)                              // arr = [1]
        medianFinder.addNum(2)                              // arr = [1, 2]
        assertEquals(1.5, medianFinder.findMedian())    // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3)                              // arr[1, 2, 3]
        assertEquals(2.0, medianFinder.findMedian())    // return 2.0
    }
}