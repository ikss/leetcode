package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TransformedArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, -2, 1, 1)
        val expected = intArrayOf(1, 1, 1, 3)

        assertArrayEquals(expected, TransformedArray.constructTransformedArray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, 4, -1)
        val expected = intArrayOf(-1, -1, 4)

        assertArrayEquals(expected, TransformedArray.constructTransformedArray(nums))
    }
}