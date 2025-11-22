package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NestedListWeightSumIITest {
    @Test
    fun test1() {
        val nestedList = listOf(
            NestedInteger(internalList = listOf(NestedInteger(num = 1), NestedInteger(num = 1))),
            NestedInteger(num = 2),
            NestedInteger(internalList = listOf(NestedInteger(num = 1), NestedInteger(num = 1))),
        )
        val expected = 8

        assertEquals(expected, NestedListWeightSumII.depthSumInverse(nestedList))
    }

    @Test
    fun test2() {
        val nestedList = listOf(
            NestedInteger(num = 1),
            NestedInteger(
                internalList = listOf(
                    NestedInteger(num = 4),
                    NestedInteger(internalList = listOf(NestedInteger(num = 6))),
                ),
            ),
        )
        val expected = 17

        assertEquals(expected, NestedListWeightSumII.depthSumInverse(nestedList))
    }
}