package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MostProfitablePathInTreeTest {
    @Test
    fun test1() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(3, 4)
        )
        val bob = 3
        val amount = intArrayOf(-2, 4, 2, -4, 6)
        val expected = 6

        assertEquals(expected, MostProfitablePathInTree.mostProfitablePath(edges, bob, amount))
    }

    @Test
    fun test2() {
        val edges = arrayOf(
            intArrayOf(0, 1),
        )
        val bob = 1
        val amount = intArrayOf(-7280, 2350)
        val expected = -7280

        assertEquals(expected, MostProfitablePathInTree.mostProfitablePath(edges, bob, amount))
    }

    @Test
    fun test3() {
        val edges = arrayOf(
            intArrayOf(0, 2),
            intArrayOf(0, 5),
            intArrayOf(1, 3),
            intArrayOf(1, 5),
            intArrayOf(2, 4),
        )
        val bob = 4
        val amount = intArrayOf(5018, 8388, 6224, 3466, 3808, 3456)
        val expected = 20328

        assertEquals(expected, MostProfitablePathInTree.mostProfitablePath(edges, bob, amount))
    }
}