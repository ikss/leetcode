package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DivideStringIntoGroupsOfSizeKTest {
    @Test
    fun test1() {
        val s = "abcdefghi"
        val k = 3
        val fill = 'x'
        val expected = arrayOf("abc", "def", "ghi")

        assertArrayEquals(expected, DivideStringIntoGroupsOfSizeK.divideString(s, k, fill))
    }

    @Test
    fun test2() {
        val s = "abcdefghij"
        val k = 3
        val fill = 'x'
        val expected = arrayOf("abc", "def", "ghi", "jxx")

        assertArrayEquals(expected, DivideStringIntoGroupsOfSizeK.divideString(s, k, fill))
    }
}