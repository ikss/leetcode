package data_structures.arrays.easy

import java.util.*

/**
 * You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes,
 * where `boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]`:
 *
 *  * numberOfBoxesi is the number of boxes of type i.
 *  * numberOfUnitsPerBoxi is the number of units in each box of the type i.
 *
 * You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck.
 * You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
 *
 * Return the maximum total number of units that can be put on the truck.
 *
 * [URL](https://leetcode.com/problems/maximum-units-on-a-truck/)
 *
 */
object MaximumUnitsOnTruck {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        boxTypes.sortByDescending { it[1] }
        var result = 0
        var tempSize = truckSize
        for (i in boxTypes.indices) {
            val (boxes, units) = boxTypes[i]
            val tempCount = minOf(tempSize, boxes)
            result += tempCount * units
            tempSize -= tempCount
            if (tempSize == 0) break
        }
        return result
    }
}
