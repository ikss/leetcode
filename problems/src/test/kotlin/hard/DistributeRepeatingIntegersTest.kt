package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistributeRepeatingIntegersTest {

    @Test
    fun test1backtrack() {
        val nums = intArrayOf(1, 2, 3, 4)
        val quantity = intArrayOf(2)
        val expected = false

        assertEquals(expected, DistributeRepeatingIntegers.canDistributeBacktrack(nums, quantity))
    }

    @Test
    fun test2backtrack() {
        val nums = intArrayOf(1, 2, 3, 3)
        val quantity = intArrayOf(2)
        val expected = true

        assertEquals(expected, DistributeRepeatingIntegers.canDistributeBacktrack(nums, quantity))
    }

    @Test
    fun test3backtrack() {
        val nums = intArrayOf(1, 1, 2, 2)
        val quantity = intArrayOf(2, 2)
        val expected = true

        assertEquals(expected, DistributeRepeatingIntegers.canDistributeBacktrack(nums, quantity))
    }
}
