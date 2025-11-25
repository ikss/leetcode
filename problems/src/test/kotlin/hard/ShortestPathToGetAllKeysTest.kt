package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestPathToGetAllKeysTest {
    @Test
    fun test1() {
        val grid = arrayOf("@.a..", "###.#", "b.A.B")
        val expected = 8

        assertEquals(expected, ShortestPathToGetAllKeys.shortestPathAllKeys(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf("@..aA", "..B#.", "....b")
        val expected = 6

        assertEquals(expected, ShortestPathToGetAllKeys.shortestPathAllKeys(grid))
    }

    @Test
    fun test3() {
        val grid = arrayOf("@Aa")
        val expected = -1

        assertEquals(expected, ShortestPathToGetAllKeys.shortestPathAllKeys(grid))
    }

    @Test
    fun test4() {
        val grid = arrayOf(".@aA")
        val expected = 1

        assertEquals(expected, ShortestPathToGetAllKeys.shortestPathAllKeys(grid))
    }
}