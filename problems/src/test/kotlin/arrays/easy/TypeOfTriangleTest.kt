package arrays.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TypeOfTriangleTest {
    @Test
    fun test1Set() {
        val nums = intArrayOf(3, 3, 3)
        val expected = "equilateral"

        assertEquals(expected, TypeOfTriangle.triangleTypeSet(nums))
    }

    @Test
    fun test2Set() {
        val nums = intArrayOf(3, 4, 5)
        val expected = "scalene"

        assertEquals(expected, TypeOfTriangle.triangleTypeSet(nums))
    }

    @Test
    fun test1Sort() {
        val nums = intArrayOf(3, 3, 3)
        val expected = "equilateral"

        assertEquals(expected, TypeOfTriangle.triangleTypeSort(nums))
    }

    @Test
    fun test2Sort() {
        val nums = intArrayOf(3, 4, 5)
        val expected = "scalene"

        assertEquals(expected, TypeOfTriangle.triangleTypeSort(nums))
    }

}