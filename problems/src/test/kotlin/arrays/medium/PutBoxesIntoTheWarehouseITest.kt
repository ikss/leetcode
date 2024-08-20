package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PutBoxesIntoTheWarehouseITest {
    @Test
    fun test1() {
        val boxes = intArrayOf(4, 3, 4, 1)
        val warehouse = intArrayOf(5, 3, 3, 4, 1)
        val expected = 3

        assertEquals(expected, PutBoxesIntoTheWarehouseI.maxBoxesInWarehouse(boxes, warehouse))
    }

    @Test
    fun test2() {
        val boxes = intArrayOf(1, 2, 2, 3, 4)
        val warehouse = intArrayOf(3, 4, 1, 2)
        val expected = 3

        assertEquals(expected, PutBoxesIntoTheWarehouseI.maxBoxesInWarehouse(boxes, warehouse))
    }

    @Test
    fun test3() {
        val boxes = intArrayOf(1, 2, 3)
        val warehouse = intArrayOf(1, 2, 3, 4)
        val expected = 1

        assertEquals(expected, PutBoxesIntoTheWarehouseI.maxBoxesInWarehouse(boxes, warehouse))
    }
}