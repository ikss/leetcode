package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DesignCircularQueueTest {

    @Test
    fun test1node() {
        val queue = DesignCircularQueue.MyCircularQueueNode(3)
        assertTrue(queue.enQueue(1))
        assertTrue(queue.enQueue(2))
        assertTrue(queue.enQueue(3))
        assertFalse(queue.enQueue(4))
        assertEquals(3, queue.rear())
        assertTrue(queue.isFull())
        assertTrue(queue.deQueue())
        assertTrue(queue.enQueue(4))
        assertEquals(4, queue.rear())
    }

    @Test
    fun test1array() {
        val queue = DesignCircularQueue.MyCircularQueueArray(3)
        assertTrue(queue.enQueue(1))
        assertTrue(queue.enQueue(2))
        assertTrue(queue.enQueue(3))
        assertFalse(queue.enQueue(4))
        assertEquals(3, queue.Rear())
        assertTrue(queue.isFull())
        assertTrue(queue.deQueue())
        assertTrue(queue.enQueue(4))
        assertEquals(4, queue.Rear())
    }
}