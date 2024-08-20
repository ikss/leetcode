package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PutBoxesIntoTheWarehouseIITest {
    @Test
    fun test1() {
        val boxes = intArrayOf(1, 2, 2, 3, 4)
        val warehouse = intArrayOf(3, 4, 1, 2)
        val expected = 4

        assertEquals(expected, PutBoxesIntoTheWarehouseII.maxBoxesInWarehouse(boxes, warehouse))
    }

    @Test
    fun test2() {
        val boxes = intArrayOf(3, 5, 5, 2)
        val warehouse = intArrayOf(2, 1, 3, 4, 5)
        val expected = 3

        assertEquals(expected, PutBoxesIntoTheWarehouseII.maxBoxesInWarehouse(boxes, warehouse))
    }

    @Test
    fun test1TwoPointers() {
        val boxes = intArrayOf(1, 2, 2, 3, 4)
        val warehouse = intArrayOf(3, 4, 1, 2)
        val expected = 4

        assertEquals(expected, PutBoxesIntoTheWarehouseII.maxBoxesInWarehouseTwoPointers(boxes, warehouse))
    }

    @Test
    fun test2TwoPointers() {
        val boxes = intArrayOf(3, 5, 5, 2)
        val warehouse = intArrayOf(2, 1, 3, 4, 5)
        val expected = 3

        assertEquals(expected, PutBoxesIntoTheWarehouseII.maxBoxesInWarehouseTwoPointers(boxes, warehouse))
    }
}