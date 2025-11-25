package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class ImplementStackUsingQueuesTest {
    @Test
    fun test1() {
        val stack = ImplementStackUsingQueues.MyStack()
        stack.push(1)
        stack.push(2)
        assertEquals(2, stack.top())
        assertEquals(2, stack.pop())
        assertFalse(stack.empty())
    }
}