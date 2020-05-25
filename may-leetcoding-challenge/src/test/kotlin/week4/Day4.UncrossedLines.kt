package week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

object UncrossedLinesTest {

    @Test
    fun test1() {
        val arrA = intArrayOf(1, 4, 2)
        val arrB = intArrayOf(1, 2, 4)
        assertEquals(2, UncrossedLines.maxUncrossedLines(arrA, arrB))
    }

    @Test
    fun test2() {
        val arrA = intArrayOf(2, 5, 1, 2, 5)
        val arrB = intArrayOf(10, 5, 2, 1, 5, 2)
        assertEquals(3, UncrossedLines.maxUncrossedLines(arrA, arrB))
    }

    @Test
    fun test3() {
        val arrA = intArrayOf(1, 3, 7, 1, 7, 5)
        val arrB = intArrayOf(1, 9, 2, 5, 1)
        assertEquals(2, UncrossedLines.maxUncrossedLines(arrA, arrB))
    }
}
