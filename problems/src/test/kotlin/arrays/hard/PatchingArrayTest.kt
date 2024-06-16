package arrays.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PatchingArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3)
        val n = 6
        val expected = 1

        assertEquals(expected, PatchingArray.minPatches(nums, n))
    }
    
    @Test
    fun test2() {
        val nums = intArrayOf(1, 5, 10)
        val n = 20
        val expected = 2

        assertEquals(expected, PatchingArray.minPatches(nums, n))
    }
    
    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 2)
        val n = 5
        val expected = 0

        assertEquals(expected, PatchingArray.minPatches(nums, n))
    }
}