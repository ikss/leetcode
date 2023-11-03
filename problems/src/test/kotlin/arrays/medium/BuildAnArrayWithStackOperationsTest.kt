package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BuildAnArrayWithStackOperationsTest {
    @Test
    fun test1() {
        val target = intArrayOf(1, 3)
        val n = 3
        val expected = listOf("Push", "Push", "Pop", "Push")

        assertEquals(expected, BuildAnArrayWithStackOperations.buildArray(target, n))
    }

    @Test
    fun test2() {
        val target = intArrayOf(1, 2, 3)
        val n = 3
        val expected = listOf("Push", "Push", "Push")

        assertEquals(expected, BuildAnArrayWithStackOperations.buildArray(target, n))
    }

    @Test
    fun test3() {
        val target = intArrayOf(1, 2)
        val n = 4
        val expected = listOf("Push", "Push")

        assertEquals(expected, BuildAnArrayWithStackOperations.buildArray(target, n))
    }
}