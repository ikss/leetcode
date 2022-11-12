package design.hard

import java.util.*

/**
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value,
 * and the median is the mean of the two middle values.
 *
 * For example, for `arr = [2,3,4]`, the median is 3.
 * For example, for `arr = [2,3]`, the median is (2 + 3) / 2 = 2.5.
 * Implement the MedianFinder class:
 *
 * MedianFinder() initializes the MedianFinder object.
 * void addNum(int num) adds the integer num from the data stream to the data structure.
 * double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/find-median-from-data-stream/)
 */
object FindMedianFromDataStream {
    class MedianFinder {
        private val small = PriorityQueue<Int> { o1, o2 -> o2 - o1 }
        private val large = PriorityQueue<Int>()

        fun addNum(num: Int) {
            large.add(num)
            small.add(large.poll())
            if (large.size < small.size) {
                large.add(small.poll())
            }
        }

        fun findMedian(): Double {
            return when {
                large.size > small.size -> large.peek().toDouble()
                else -> (large.peek() + small.peek()) / 2.0
            }
        }
    }
}