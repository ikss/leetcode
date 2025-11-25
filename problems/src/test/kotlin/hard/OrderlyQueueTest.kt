package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OrderlyQueueTest {

    @Test
    fun test1() {
        val s = "cba"
        val k = 1
        val expected = "acb"

        assertEquals(expected, OrderlyQueue.orderlyQueue(s, k))
    }

    @Test
    fun test2() {
        val s = "baaca"
        val k = 3
        val expected = "aaabc"

        assertEquals(expected, OrderlyQueue.orderlyQueue(s, k))
    }
}