package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DetermineWhetherMatrixCanBeObtainedByRotationTest {
    @Test
    fun test1() {
        val mat = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))
        val target = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
        val expected = true

        assertEquals(expected, DetermineWhetherMatrixCanBeObtainedByRotation.findRotation(mat, target))
    }

    @Test
    fun test2() {
        val mat = arrayOf(intArrayOf(0, 1), intArrayOf(1, 1))
        val target = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1))
        val expected = false

        assertEquals(expected, DetermineWhetherMatrixCanBeObtainedByRotation.findRotation(mat, target))
    }

    @Test
    fun test3() {
        val mat = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1))
        val target = arrayOf(intArrayOf(1, 1, 1), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
        val expected = true

        assertEquals(expected, DetermineWhetherMatrixCanBeObtainedByRotation.findRotation(mat, target))
    }
}