package design.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class `AllO(1)DataStructureTest` {
    @Test
    fun test() {
        val allOne = `AllO(1)DataStructure`.AllOne()
        allOne.inc("hello")
        allOne.inc("hello")
        assertEquals("hello", allOne.getMaxKey())
        assertEquals("hello", allOne.getMinKey())
        
        allOne.inc("leet")
        assertEquals("hello", allOne.getMaxKey())
        assertEquals("leet", allOne.getMinKey())
    }
}