package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindChampionIITest {
    @Test
    fun test1() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        val expected = 0

        assertEquals(expected, FindChampionII.findChampion(n, edges))
    }
    
    @Test
    fun test2() {
        val n = 4
        val edges = arrayOf(intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(1, 2))
        val expected = -1

        assertEquals(expected, FindChampionII.findChampion(n, edges))
    }

    @Test
    fun test3() {
        val n = 1
        val edges = arrayOf<IntArray>()
        val expected = 0

        assertEquals(expected, FindChampionII.findChampion(n, edges))
    }
}