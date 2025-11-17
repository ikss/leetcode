package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfAll1sAreAtLeastLengthKPlacesAwayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 0, 0, 0, 1, 0, 0, 1)
        val k = 2
        val expected = true

        assertEquals(expected, CheckIfAll1sAreAtLeastLengthKPlacesAway.kLengthApart(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 0, 0, 1, 0, 1)
        val k = 2
        val expected = false

        assertEquals(expected, CheckIfAll1sAreAtLeastLengthKPlacesAway.kLengthApart(nums, k))
    }
}