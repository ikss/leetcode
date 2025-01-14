package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindThePrefixCommonArrayOfTwoArraysTest {
    @Test
    fun test1() {
        val A = intArrayOf(1, 3, 2, 4)
        val B = intArrayOf(3, 1, 2, 4)
        val expected = intArrayOf(0, 2, 3, 4)

        assertArrayEquals(expected, FindThePrefixCommonArrayOfTwoArrays.findThePrefixCommonArray(A, B))
    }

    @Test
    fun test2() {
        val A = intArrayOf(2, 3, 1)
        val B = intArrayOf(3, 1, 2)
        val expected = intArrayOf(0, 1, 3)

        assertArrayEquals(expected, FindThePrefixCommonArrayOfTwoArrays.findThePrefixCommonArray(A, B))
    }
}