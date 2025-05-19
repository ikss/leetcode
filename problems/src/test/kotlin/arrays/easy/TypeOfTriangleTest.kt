package arrays.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TypeOfTriangleTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 3, 3)
        val expected = "equilateral"

        assertEquals(expected, TypeOfTriangle.triangleType(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 4, 5)
        val expected = "scalene"

        assertEquals(expected, TypeOfTriangle.triangleType(nums))
    }

}