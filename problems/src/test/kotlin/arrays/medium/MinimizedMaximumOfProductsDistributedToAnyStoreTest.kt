package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizedMaximumOfProductsDistributedToAnyStoreTest {
    @Test
    fun test1() {
        val n = 6
        val quantities = intArrayOf(11, 6)
        val expected = 3

        assertEquals(expected, MinimizedMaximumOfProductsDistributedToAnyStore.minimizedMaximum(n, quantities))
    }

    @Test
    fun test2() {
        val n = 7
        val quantities = intArrayOf(15, 10, 10)
        val expected = 5

        assertEquals(expected, MinimizedMaximumOfProductsDistributedToAnyStore.minimizedMaximum(n, quantities))
    }

}