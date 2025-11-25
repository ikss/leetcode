package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindMinimumOperationsToMakeAllElementsDivisibleByThreeTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 3

        assertEquals(expected, FindMinimumOperationsToMakeAllElementsDivisibleByThree.minimumOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 6, 9)
        val expected = 0

        assertEquals(expected, FindMinimumOperationsToMakeAllElementsDivisibleByThree.minimumOperations(nums))
    }
}