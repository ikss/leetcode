package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumAbsoluteDistanceBetweenMirrorPairsTest {

    @Test
    fun test1() {
        val nums = intArrayOf(12, 21, 45, 33, 54)
        val expected = 1

        assertEquals(expected, MinimumAbsoluteDistanceBetweenMirrorPairs.minMirrorPairDistance(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(120, 21)
        val expected = 1

        assertEquals(expected, MinimumAbsoluteDistanceBetweenMirrorPairs.minMirrorPairDistance(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(21, 120)
        val expected = -1

        assertEquals(expected, MinimumAbsoluteDistanceBetweenMirrorPairs.minMirrorPairDistance(nums))
    }

}