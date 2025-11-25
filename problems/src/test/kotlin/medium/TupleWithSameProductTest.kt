package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TupleWithSameProductTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 3, 4, 6)
        val expected = 8

        assertEquals(expected, TupleWithSameProduct.tupleSameProduct(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 4, 5, 10)
        val expected = 16

        assertEquals(expected, TupleWithSameProduct.tupleSameProduct(nums))
    }
}