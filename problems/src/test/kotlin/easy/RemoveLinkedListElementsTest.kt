package easy

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveLinkedListElementsTest {

    @Test
    fun test1() {
        val root = ListBuilder.build(1, 2, 6, 3, 4, 5, 6)
        val `val` = 6
        val expected = ListBuilder.build(1, 2, 3, 4, 5)

        assertEquals(expected, RemoveLinkedListElements.removeElements(root, `val`))
    }

    @Test
    fun test2() {
        val root = ListBuilder.build()
        val `val` = 1
        val expected = ListBuilder.build()

        assertEquals(expected, RemoveLinkedListElements.removeElements(root, `val`))
    }

    @Test
    fun test3() {
        val root = ListBuilder.build(7, 7, 7, 7)
        val `val` = 7
        val expected = ListBuilder.build()

        assertEquals(expected, RemoveLinkedListElements.removeElements(root, `val`))
    }
}