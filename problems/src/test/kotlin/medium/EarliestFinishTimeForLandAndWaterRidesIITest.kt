package medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EarliestFinishTimeForLandAndWaterRidesIITest {
    @Test
    fun test1() {
        val landStartTime = intArrayOf(2,8)
        val landDuration = intArrayOf(4,1)
        val waterStartTime = intArrayOf(6)
        val waterDuration = intArrayOf(3)
        val expected = 9

        assertEquals(expected, EarliestFinishTimeForLandAndWaterRidesII.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration))
    }

    @Test
    fun test2() {
        val landStartTime = intArrayOf(5)
        val landDuration = intArrayOf(3)
        val waterStartTime = intArrayOf(1)
        val waterDuration = intArrayOf(10)
        val expected = 14

        assertEquals(expected, EarliestFinishTimeForLandAndWaterRidesII.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration))
    }
}