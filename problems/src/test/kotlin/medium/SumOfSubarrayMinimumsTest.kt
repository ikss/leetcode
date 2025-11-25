package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfSubarrayMinimumsTest {

    @Test
    fun test1naive() {
        val arr = intArrayOf(3, 1, 2, 4)
        val expected = 17

        assertEquals(expected, SumOfSubarrayMinimums.sumSubarrayMinsNaive(arr))
    }

    @Test
    fun test2naive() {
        val arr = intArrayOf(11, 81, 94, 43, 3)
        val expected = 444

        assertEquals(expected, SumOfSubarrayMinimums.sumSubarrayMinsNaive(arr))
    }

    @Test
    fun test1monotonicStack() {
        val arr = intArrayOf(3, 1, 2, 4)
        val expected = 17

        assertEquals(expected, SumOfSubarrayMinimums.sumSubarrayMinsMonotonicStack(arr))
    }

    @Test
    fun test2monotonicStack() {
        val arr = intArrayOf(11, 81, 94, 43, 3)
        val expected = 444

        assertEquals(expected, SumOfSubarrayMinimums.sumSubarrayMinsMonotonicStack(arr))
    }

    @Test
    fun test1dp() {
        val arr = intArrayOf(3, 1, 2, 4)
        val expected = 17

        assertEquals(expected, SumOfSubarrayMinimums.sumSubarrayMinsDp(arr))
    }

    @Test
    fun test2dp() {
        val arr = intArrayOf(11, 81, 94, 43, 3)
        val expected = 444

        assertEquals(expected, SumOfSubarrayMinimums.sumSubarrayMinsDp(arr))
    }
}