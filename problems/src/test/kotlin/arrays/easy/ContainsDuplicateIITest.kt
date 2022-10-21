package arrays.easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ContainsDuplicateIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 1)
        val k = 3

        assertTrue(ContainsDuplicateII.containsNearbyDuplicate(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 0, 1, 1)
        val k = 1

        assertTrue(ContainsDuplicateII.containsNearbyDuplicate(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3, 1, 2, 3)
        val k = 2

        assertFalse(ContainsDuplicateII.containsNearbyDuplicate(nums, k))
    }
}