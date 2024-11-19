package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ExclusiveTimeOfFunctionsTest {

    @Test
    fun test1() {
        val n = 2
        val logs = listOf("0:start:0", "1:start:2", "1:end:5", "0:end:6")
        val expected = intArrayOf(3, 4)

        assertArrayEquals(expected, ExclusiveTimeOfFunctions.exclusiveTime(n, logs))
    }

    @Test
    fun test2() {
        val n = 1
        val logs = listOf("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7")
        val expected = intArrayOf(8)

        assertArrayEquals(expected, ExclusiveTimeOfFunctions.exclusiveTime(n, logs))
    }

    @Test
    fun test3() {
        val n = 2
        val logs = listOf("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7")
        val expected = intArrayOf(7, 1)

        assertArrayEquals(expected, ExclusiveTimeOfFunctions.exclusiveTime(n, logs))
    }
}