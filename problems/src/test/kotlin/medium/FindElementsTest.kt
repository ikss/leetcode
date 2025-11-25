package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindElementsTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(-1, null, -1)
        val findElements = FindElements(root)

        assertEquals(false, findElements.find(1))
        assertEquals(true, findElements.find(2))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(-1, -1, -1, -1, -1)
        val findElements = FindElements(root)

        assertEquals(true, findElements.find(1))
        assertEquals(true, findElements.find(3))
        assertEquals(false, findElements.find(5))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(-1, null, -1, -1, null, -1)
        val findElements = FindElements(root)

        assertEquals(true, findElements.find(2))
        assertEquals(false, findElements.find(3))
        assertEquals(false, findElements.find(4))
        assertEquals(true, findElements.find(5))
    }
}