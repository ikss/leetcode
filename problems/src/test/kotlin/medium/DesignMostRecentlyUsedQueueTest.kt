package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignMostRecentlyUsedQueueTest {
    @Test
    fun testDesignMostRecentlyUsedQueue() {
        val queue = DesignMostRecentlyUsedQueue.MRUQueue(8)

        assertEquals(3, queue.fetch(3))
        assertEquals(6, queue.fetch(5))
        assertEquals(2, queue.fetch(2))
        assertEquals(2, queue.fetch(8))
    }
}