package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindUniqueBinaryStringTest {
    @Test
    fun test1() {
        val nums = arrayOf("01", "10")
        val expected = "11"

        assertEquals(expected, FindUniqueBinaryString.findDifferentBinaryString(nums))
    }

    @Test
    fun test2() {
        val nums = arrayOf("00", "01")
        val expected = "10"

        assertEquals(expected, FindUniqueBinaryString.findDifferentBinaryString(nums))
    }

    @Test
    fun test3() {
        val nums = arrayOf("111", "011", "001")
        val expected = "000"

        assertEquals(expected, FindUniqueBinaryString.findDifferentBinaryString(nums))
    }
}