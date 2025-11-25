package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortArrayByParityIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 2, 5, 7)
        val expected = intArrayOf(4, 5, 2, 7)

        assertArrayEquals(expected, SortArrayByParityII.sortArrayByParityII(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3)
        val expected = intArrayOf(2, 3)

        assertArrayEquals(expected, SortArrayByParityII.sortArrayByParityII(nums))
    }
}