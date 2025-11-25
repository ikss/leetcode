package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ImplementQueueUsingStacksTest {

    @Test
    fun test1() {
        val myQueue = ImplementQueueUsingStacks.MyQueue()
        myQueue.push(1)                             // queue is: [1]
        myQueue.push(2)                             // queue is: [1, 2] (leftmost is front of the queue)
        assertEquals(1, myQueue.peek())       // return 1
        assertEquals(1, myQueue.pop())        // return 1, queue is [2]
        assertEquals(false, myQueue.empty())  // return false
    }
}