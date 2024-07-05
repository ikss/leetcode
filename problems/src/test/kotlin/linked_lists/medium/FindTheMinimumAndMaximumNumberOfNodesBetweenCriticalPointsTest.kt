package linked_lists.medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPointsTest {
    @Test
    fun test1() {
        val head = ListBuilder.build(3, 1)
        val expected = intArrayOf(-1, -1)
        val actual = FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.nodesBetweenCriticalPoints(head)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        val head = ListBuilder.build(5, 3, 1, 2, 5, 1, 2)
        val expected = intArrayOf(1, 3)
        val actual = FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.nodesBetweenCriticalPoints(head)

        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        val head = ListBuilder.build(1, 3, 2, 2, 3, 2, 2, 2, 7)
        val expected = intArrayOf(3, 3)
        val actual = FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints.nodesBetweenCriticalPoints(head)

        assertArrayEquals(expected, actual)
    }
}