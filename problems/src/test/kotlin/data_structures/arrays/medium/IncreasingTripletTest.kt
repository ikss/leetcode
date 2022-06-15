package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IncreasingTripletTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5)

        assertTrue(IncreasingTriplet.increasingTriplet(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 4, 3, 2, 1)

        assertFalse(IncreasingTriplet.increasingTriplet(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 1, 5, 0, 4, 6)

        assertTrue(IncreasingTriplet.increasingTriplet(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, 3)

        assertTrue(IncreasingTriplet.increasingTriplet(nums))
    }
}
