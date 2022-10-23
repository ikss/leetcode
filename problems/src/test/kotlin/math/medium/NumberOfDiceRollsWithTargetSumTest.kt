package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class NumberOfDiceRollsWithTargetSumTest {

    @Test
    fun test1recursive() {
        val n = 1
        val k = 6
        val target = 3
        val expected = 1

        assertEquals(expected, NumberOfDiceRollsWithTargetSum.numRollsToTargetRecursive(n, k, target))
    }

    @Test
    fun test2recursive() {
        val n = 2
        val k = 6
        val target = 7
        val expected = 6

        assertEquals(expected, NumberOfDiceRollsWithTargetSum.numRollsToTargetRecursive(n, k, target))
    }

    @Test
    fun test3recursive() {
        val n = 30
        val k = 30
        val target = 500
        val expected = 222616187

        assertEquals(expected, NumberOfDiceRollsWithTargetSum.numRollsToTargetRecursive(n, k, target))
    }

    @Test
    fun test1dp() {
        val n = 1
        val k = 6
        val target = 3
        val expected = 1

        assertEquals(expected, NumberOfDiceRollsWithTargetSum.numRollsToTargetDp(n, k, target))
    }

    @Test
    fun test2dp() {
        val n = 2
        val k = 6
        val target = 7
        val expected = 6

        assertEquals(expected, NumberOfDiceRollsWithTargetSum.numRollsToTargetDp(n, k, target))
    }

    @Test
    fun test3dp() {
        val n = 30
        val k = 30
        val target = 500
        val expected = 222616187

        assertEquals(expected, NumberOfDiceRollsWithTargetSum.numRollsToTargetDp(n, k, target))
    }
}
