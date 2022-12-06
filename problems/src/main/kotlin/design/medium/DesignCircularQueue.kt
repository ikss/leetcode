package design.medium

/**
 * Design your implementation of the circular queue. The circular queue is a linear data structure
 * in which the operations are performed based on FIFO (First In First Out) principle and the last position
 * is connected back to the first position to make a circle. It is also called "Ring Buffer".
 *
 * One of the benefits of the circular queue is that we can make use of the spaces in front of the queue.
 * In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space
 * in front of the queue. But using the circular queue, we can use the space to store new values.
 *
 * Implementation the MyCircularQueue class:
 * * MyCircularQueue(k) Initializes the object with the size of the queue to be k.
 * * int Front() Gets the front item from the queue. If the queue is empty, return -1.
 * * int Rear() Gets the last item from the queue. If the queue is empty, return -1.
 * * boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
 * * boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
 * * boolean isEmpty() Checks whether the circular queue is empty or not.
 * * boolean isFull() Checks whether the circular queue is full or not.
 *
 * You must solve the problem without using the built-in queue data structure in your programming language.
 *
 * [URL](https://leetcode.com/problems/design-circular-queue/)
 */
object DesignCircularQueue {
    class MyCircularQueueNode(k: Int) {
        val maxSize = k
        var head: Node? = null
        var tail: Node? = null
        var currSize = 0

        fun enQueue(value: Int): Boolean {
            if (currSize >= maxSize) return false
            val newNode = Node(value, null)

            tail?.let {
                it.next = newNode
            }
            tail = newNode
            if (head == null) {
                head = newNode
            }
            currSize++
            return true
        }

        fun deQueue(): Boolean {
            if (currSize == 0) return false
            head?.let {
                head = it.next
            }
            if (--currSize == 0) {
                tail = null
            }
            return true
        }

        fun Front(): Int {
            val h = head ?: return -1
            return h.value
        }

        fun Rear(): Int {
            val t = tail ?: return -1
            return t.value
        }

        fun isEmpty(): Boolean {
            return currSize == 0
        }

        fun isFull(): Boolean {
            return currSize == maxSize
        }

        data class Node(val value: Int, var next: Node?)
    }

    class MyCircularQueueArray(k: Int) {
        private val data = arrayOfNulls<Int>(k)
        private val size = k
        private var head = 0
        private var tail = 0
        private var count = 0

        fun enQueue(value: Int): Boolean {
            if (this.isFull()) return false
            if (!this.isEmpty()) tail = (tail + 1) % size
            data[tail] = value
            count++
            return true
        }

        fun deQueue(): Boolean {
            if (this.isEmpty()) return false
            data[head] = null
            if (--count != 0) head = (head + 1) % size
            return true
        }

        fun Front(): Int {
            if (this.isEmpty()) return -1
            return data[head]!!
        }

        fun Rear(): Int {
            if (this.isEmpty()) return -1
            return data[tail]!!
        }

        fun isEmpty(): Boolean {
            return count == 0
        }

        fun isFull(): Boolean {
            return count == size
        }
    }
}