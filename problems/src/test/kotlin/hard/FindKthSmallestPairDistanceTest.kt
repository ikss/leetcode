package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindKthSmallestPairDistanceTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 0)
        val k = 1
        val expected = 0

        assertEquals(expected, FindKthSmallestPairDistance.smallestDistancePair(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1)
        val k = 2
        val expected = 0

        assertEquals(expected, FindKthSmallestPairDistance.smallestDistancePair(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 6, 1)
        val k = 3
        val expected = 5

        assertEquals(expected, FindKthSmallestPairDistance.smallestDistancePair(nums, k))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(62, 100, 4)
        val k = 2
        val expected = 58

        assertEquals(expected, FindKthSmallestPairDistance.smallestDistancePair(nums, k))
    }
}