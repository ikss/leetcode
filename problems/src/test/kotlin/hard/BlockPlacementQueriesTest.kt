package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BlockPlacementQueriesTest {
    @Test
    fun test1() {
        val queries = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3, 3),
            intArrayOf(2, 3, 1),
            intArrayOf(2, 2, 2),
        )
        val expected = listOf(false, true, true)

        assertEquals(expected, BlockPlacementQueries.getResults(queries))
    }

    @Test
    fun test2() {
        val queries = arrayOf(
            intArrayOf(1, 7),
            intArrayOf(2, 7, 6),
            intArrayOf(1, 2),
            intArrayOf(2, 7, 5),
            intArrayOf(2, 7, 6),
        )
        val expected = listOf(true, true, false)

        assertEquals(expected, BlockPlacementQueries.getResults(queries))
    }
}