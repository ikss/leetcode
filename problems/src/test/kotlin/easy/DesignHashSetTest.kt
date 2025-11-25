package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignHashSetTest {
    @Test
    fun test1() {
        val myHashSet = DesignHashSet.MyHashSet()
        myHashSet.add(1) // set = [1]
        myHashSet.add(2) // set = [1, 2]
        assertEquals(true, myHashSet.contains(1)) // return True
        assertEquals(false, myHashSet.contains(3)) // return False, (not found)
        myHashSet.add(2) // set = [1, 2]
        assertEquals(true, myHashSet.contains(2)) // return True
        myHashSet.remove(2) // set = [1]
        assertEquals(false, myHashSet.contains(2)) // return False, (already removed)
    }
}