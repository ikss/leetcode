package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindTheOriginalArrayOfPrefixXorTest {
    @Test
    fun test1() {
        val pref = intArrayOf(5, 2, 0, 3, 1)
        val expected = intArrayOf(5, 7, 2, 3, 2)

        assertArrayEquals(expected, FindTheOriginalArrayOfPrefixXor.findArray(pref))
    }

    @Test
    fun test2() {
        val pref = intArrayOf(13)
        val expected = intArrayOf(13)

        assertArrayEquals(expected, FindTheOriginalArrayOfPrefixXor.findArray(pref))
    }
}