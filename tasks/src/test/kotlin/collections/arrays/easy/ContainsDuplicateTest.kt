package collections.arrays.easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ContainsDuplicateTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 1)
        assertTrue(ContainsDuplicate.containsDuplicate(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4)
        assertFalse(ContainsDuplicate.containsDuplicate(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        assertTrue(ContainsDuplicate.containsDuplicate(nums))
    }
}
