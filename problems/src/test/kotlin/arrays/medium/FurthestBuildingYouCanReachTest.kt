package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FurthestBuildingYouCanReachTest {
    @Test
    fun test1() {
        val heights = intArrayOf(4, 12, 2, 7, 3, 18, 20, 3, 19)
        val bricks = 10
        val ladders = 2
        val expected = 7

        assertEquals(expected, FurthestBuildingYouCanReach.furthestBuilding(heights, bricks, ladders))
    }

    @Test
    fun test2() {
        val heights = intArrayOf(14, 3, 19, 3)
        val bricks = 17
        val ladders = 0
        val expected = 3

        assertEquals(expected, FurthestBuildingYouCanReach.furthestBuilding(heights, bricks, ladders))
    }

}
