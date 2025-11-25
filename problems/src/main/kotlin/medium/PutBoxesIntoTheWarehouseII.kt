package medium

import java.util.*

/**
 * You are given two arrays of positive integers, boxes and warehouse, representing the heights of some boxes of unit
 * width and the heights of n rooms in a warehouse respectively. The warehouse's rooms are labeled from 0 to n - 1 from
 * left to right where `warehouse[i]` (0-indexed) is the height of the ith room.
 *
 * Boxes are put into the warehouse by the following rules:
 * * Boxes cannot be stacked.
 * * You can rearrange the insertion order of the boxes.
 * * Boxes can be pushed into the warehouse from either side (left or right)
 * * If the height of some room in the warehouse is less than the height of a box,
 * then that box and all other boxes behind it will be stopped before that room.
 *
 * Return the maximum number of boxes you can put into the warehouse.
 *
 * [URL](https://leetcode.com/problems/put-boxes-into-the-warehouse-ii/)
 */
object PutBoxesIntoTheWarehouseII {
    fun maxBoxesInWarehouse(boxes: IntArray, warehouse: IntArray): Int {
        val n = warehouse.size
        val warehouseLeft = IntArray(n) { warehouse[it] }
        val warehouseRight = IntArray(n) { warehouse[it] }

        val map = TreeMap<Int, Int>()
        for (b in boxes) {
            map.merge(b, 1, Int::plus)
        }

        for (i in 1 until n) {
            warehouseLeft[i] = minOf(warehouse[i], warehouseLeft[i - 1])
        }

        for (i in n - 2 downTo 0) {
            warehouseRight[i] = minOf(warehouse[i], warehouseRight[i + 1])
        }

        var result = 0

        for (i in warehouse.indices) {
            val wl = warehouseLeft[i]
            val wr = warehouseRight[i]

            val boxesLeft = map.floorEntry(wl)
            if (boxesLeft == null) {
                val boxesRight = map.floorEntry(wr) ?: continue
                result++
                if (boxesRight.value > 1) {
                    map[boxesRight.key] = boxesRight.value - 1
                } else {
                    map.remove(boxesRight.key)
                }
                continue
            }
            result++
            if (boxesLeft.value > 1) {
                map[boxesLeft.key] = boxesLeft.value - 1
            } else {
                map.remove(boxesLeft.key)
            }
        }

        return result
    }

    fun maxBoxesInWarehouseTwoPointers(boxes: IntArray, warehouse: IntArray): Int {
        boxes.sort()

        var left = 0
        var right = warehouse.size - 1

        var result = 0

        for (i in boxes.size - 1 downTo 0) {
            val box = boxes[i]
            if (warehouse[left] >= box) {
                result++
                left++
            } else if (warehouse[right] >= box) {
                result++
                right--
            }
            if (left > right) break
        }

        return result
    }
}