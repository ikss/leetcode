package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SetIntersectionSizeAtLeastTwoTest {
    @Test
    fun test1() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(3, 7), intArrayOf(8, 9))
        val expected = 5

        assertEquals(expected, SetIntersectionSizeAtLeastTwo.intersectionSizeTwo(intervals))
    }

    @Test
    fun test2() {
        val intervals = arrayOf(intArrayOf(1, 3), intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 5))
        val expected = 3

        assertEquals(expected, SetIntersectionSizeAtLeastTwo.intersectionSizeTwo(intervals))
    }

    @Test
    fun test3() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(2, 4), intArrayOf(4, 5))
        val expected = 5

        assertEquals(expected, SetIntersectionSizeAtLeastTwo.intersectionSizeTwo(intervals))
    }
}