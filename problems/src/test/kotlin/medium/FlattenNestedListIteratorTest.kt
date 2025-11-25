package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlattenNestedListIteratorTest {
    @Test
    fun test1() {
        val nestedList = FlattenNestedListIterator.NestedInteger()
        nestedList.add(FlattenNestedListIterator.NestedInteger(listOf(1, 1)))
        nestedList.add(FlattenNestedListIterator.NestedInteger(2))
        nestedList.add(FlattenNestedListIterator.NestedInteger(listOf(1, 1)))

        val expected = listOf(1, 1, 2, 1, 1)
        val actual = FlattenNestedListIterator.NestedIteratorCopy(listOf(nestedList)).iterator().asSequence().toList()

        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val nestedList = FlattenNestedListIterator.NestedInteger()
        nestedList.add(FlattenNestedListIterator.NestedInteger(1))
        val nestedInteger = FlattenNestedListIterator.NestedInteger(listOf(4))
        nestedInteger.add(FlattenNestedListIterator.NestedInteger(6))
        nestedList.add(nestedInteger)

        val expected = listOf(1, 4, 6)
        val actual = FlattenNestedListIterator.NestedIteratorCopy(listOf(nestedList)).iterator().asSequence().toList()

        assertEquals(expected, actual)
    }
}