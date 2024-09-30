package design.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignStackWithIncrementOperationTest {
    @Test
    fun test1() {
        val stack = DesignStackWithIncrementOperation.CustomStack(3)
        stack.push(1)
        stack.push(2)
        assertEquals(2, stack.pop())
        
        stack.push(2)
        stack.push(3)
        stack.push(4)
        stack.increment(5, 100)
        stack.increment(2, 100)
        assertEquals(103, stack.pop())
        assertEquals(202, stack.pop())
        assertEquals(201, stack.pop())
        assertEquals(-1, stack.pop())
    }
}