package graphs.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GreatestCommonDivisorTraversalTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 6)
        val expected = true

        assertEquals(expected, GreatestCommonDivisorTraversal.canTraverseAllPairs(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 9, 5)
        val expected = false

        assertEquals(expected, GreatestCommonDivisorTraversal.canTraverseAllPairs(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(4, 3, 12, 8)
        val expected = true

        assertEquals(expected, GreatestCommonDivisorTraversal.canTraverseAllPairs(nums))
    }
}