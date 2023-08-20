package graphs.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortItemsByGroupsRespectingDependenciesTest {
    @Test
    fun test1() {
        val n = 8
        val m = 2
        val group = intArrayOf(-1, -1, 1, 0, 0, 1, 0, -1)
        val beforeItems = listOf(
            emptyList(),
            listOf(6),
            listOf(5),
            listOf(6),
            listOf(3, 6),
            emptyList(),
            emptyList(),
            emptyList()
        )
        val expected = intArrayOf(7, 0, 5, 2, 6, 3, 4, 1)

        assertArrayEquals(expected, SortItemsByGroupsRespectingDependencies.sortItems(n, m, group, beforeItems))
    }

    @Test
    fun test2() {
        val n = 8
        val m = 2
        val group = intArrayOf(-1, -1, 1, 0, 0, 1, 0, -1)
        val beforeItems = listOf(
            emptyList(),
            listOf(6),
            listOf(5),
            listOf(6),
            listOf(3),
            emptyList(),
            listOf(4),
            emptyList()
        )
        val expected = intArrayOf()

        assertArrayEquals(expected, SortItemsByGroupsRespectingDependencies.sortItems(n, m, group, beforeItems))
    }
}