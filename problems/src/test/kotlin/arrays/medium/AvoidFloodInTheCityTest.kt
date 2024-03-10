package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class AvoidFloodInTheCityTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 0, 0, 2, 1)
        val expected = intArrayOf(-1, -1, 2, 1, -1, -1)

        assertArrayEquals(expected, AvoidFloodInTheCity.avoidFlood(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(-1, -1, -1, -1)

        assertArrayEquals(expected, AvoidFloodInTheCity.avoidFlood(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(69, 0, 0, 68)
        val expected = intArrayOf(-1, 1, 1, -1)

        assertArrayEquals(expected, AvoidFloodInTheCity.avoidFlood(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(69, 0, 0, 0, 69)
        val expected = intArrayOf(-1, 69, 1, 1, -1)

        assertArrayEquals(expected, AvoidFloodInTheCity.avoidFlood(nums))
    }

    @Test
    fun test5() {
        val nums = intArrayOf(0, 1, 1)
        val expected = intArrayOf()

        assertArrayEquals(expected, AvoidFloodInTheCity.avoidFlood(nums))
    }
}
