package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NumberOfFlowersInFullBloomTest {
    @Test
    fun test1() {
        val flowers = arrayOf(intArrayOf(1, 6), intArrayOf(3, 7), intArrayOf(9, 12), intArrayOf(4, 13))
        val people = intArrayOf(2, 3, 7, 11)
        val expected = intArrayOf(1, 2, 2, 2)

        assertArrayEquals(expected, NumberOfFlowersInFullBloom.fullBloomFlowers(flowers, people))
    }

    @Test
    fun test2() {
        val flowers = arrayOf(intArrayOf(1, 10), intArrayOf(3, 3))
        val people = intArrayOf(3, 3, 2)
        val expected = intArrayOf(2, 2, 1)

        assertArrayEquals(expected, NumberOfFlowersInFullBloom.fullBloomFlowers(flowers, people))
    }
}