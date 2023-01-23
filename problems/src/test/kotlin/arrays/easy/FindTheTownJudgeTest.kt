package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheTownJudgeTest {
    @Test
    fun test1() {
        val n = 2
        val trust = arrayOf(intArrayOf(1, 2))
        val expected = 2

        assertEquals(expected, FindTheTownJudge.findJudge(n, trust))
    }

    @Test
    fun test2() {
        val n = 3
        val trust = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3))
        val expected = 3

        assertEquals(expected, FindTheTownJudge.findJudge(n, trust))
    }

    @Test
    fun test3() {
        val n = 3
        val trust = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(3, 1))
        val expected = -1

        assertEquals(expected, FindTheTownJudge.findJudge(n, trust))
    }
}