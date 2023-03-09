package linked_lists.easy

import data_structures.ListBuilder
import data_structures.ListNodeCycled
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LinkedListCycleTest {

    @Test
    fun test1() {
        val node2 = ListNodeCycled(2)
        node2.next = ListNodeCycled(3, ListNodeCycled(4, node2))
        val list = ListNodeCycled(1, node2)

        assertTrue(LinkedListCycle.hasCycle(list))
    }

    @Test
    fun test2() {
        val list = ListBuilder.buildCycled(1, 2, 3, 4)

        assertFalse(LinkedListCycle.hasCycle(list))
    }
}
