package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveMethodsFromProjectTest {
    @Test
    fun test1() {
        val n = 4
        val k = 1
        val invocations = arrayOf(intArrayOf(1, 2), intArrayOf(0, 1), intArrayOf(3, 2))
        val expected = listOf(0, 1, 2, 3)

        assertEquals(expected, RemoveMethodsFromProject.remainingMethods(n, k, invocations))
    }

    @Test
    fun test2() {
        val n = 5
        val k = 0
        val invocations = arrayOf(intArrayOf(1, 2), intArrayOf(0, 2), intArrayOf(0, 1), intArrayOf(3, 4))
        val expected = listOf(3, 4)

        assertEquals(expected, RemoveMethodsFromProject.remainingMethods(n, k, invocations))
    }

    @Test
    fun test3() {
        val n = 3
        val k = 2
        val invocations = arrayOf(intArrayOf(1, 2), intArrayOf(0, 1), intArrayOf(2, 0))
        val expected = listOf<Int>()

        assertEquals(expected, RemoveMethodsFromProject.remainingMethods(n, k, invocations))
    }
}