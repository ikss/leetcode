package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SumOfDistancesInTreeTest {

    @Test
    fun test1() {
        val n = 6
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(2, 4), intArrayOf(2, 5))
        val expected = intArrayOf(8, 12, 6, 10, 10, 10)

        assertArrayEquals(expected, SumOfDistancesInTree.sumOfDistancesInTree(n, edges))
    }

    @Test
    fun test2() {
        val n = 1
        val edges = emptyArray<IntArray>()
        val expected = intArrayOf(0)

        assertArrayEquals(expected, SumOfDistancesInTree.sumOfDistancesInTree(n, edges))
    }

    @Test
    fun test3() {
        val n = 2
        val edges = arrayOf(intArrayOf(0, 1))
        val expected = intArrayOf(1, 1)

        assertArrayEquals(expected, SumOfDistancesInTree.sumOfDistancesInTree(n, edges))
    }
}