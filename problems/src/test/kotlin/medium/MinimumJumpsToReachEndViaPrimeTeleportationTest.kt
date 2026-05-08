package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumJumpsToReachEndViaPrimeTeleportationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 4, 6)
        val expected = 2

        assertEquals(expected, MinimumJumpsToReachEndViaPrimeTeleportation.minJumps(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 4, 7, 9)
        val expected = 2

        assertEquals(expected, MinimumJumpsToReachEndViaPrimeTeleportation.minJumps(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(4, 6, 5, 8)
        val expected = 3

        assertEquals(expected, MinimumJumpsToReachEndViaPrimeTeleportation.minJumps(nums))
    }
}