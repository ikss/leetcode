package design.medium

/**
 * Design an algorithm that accepts a stream of integers and retrieves the product of the last k integers of the stream.
 *
 * Implement the ProductOfNumbers class:
 * * ProductOfNumbers() Initializes the object with an empty stream.
 * * void add(int num) Appends the integer num to the stream.
 * * int getProduct(int k) Returns the product of the last k numbers in the current list.
 *
 * You can assume that always the current list has at least k numbers.
 * The test cases are generated so that, at any time, the product of any contiguous sequence of numbers
 * will fit into a single 32-bit integer without overflowing.
 *
 * [URL](https://leetcode.com/problems/product-of-the-last-k-numbers/)
 */
object ProductOfTheLastKNumbers {
    class ProductOfNumbers {
        private var queue = ArrayList<Int>()

        fun add(num: Int) {
            if (num == 0) {
                queue = ArrayList()
                return
            }
            if (queue.isEmpty()) {
                queue.add(num)
            } else {
                queue.add(queue.last() * num)
            }
        }

        fun getProduct(k: Int): Int {
            if (k > queue.size) return 0
            val last = if (k == queue.size) 1 else queue[queue.size - k - 1]
            return queue.last() / last
        }
    }
}