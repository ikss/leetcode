package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindLuckyIntegerInArrayTest {
    @Test
    fun test1() {
        val arr = intArrayOf(2, 2, 3, 4)
        val expected = 2

        assertEquals(expected, FindLuckyIntegerInArray.findLucky(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 2, 2, 3, 3, 3)
        val expected = 3

        assertEquals(expected, FindLuckyIntegerInArray.findLucky(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(2, 2, 2, 3, 3)
        val expected = -1

        assertEquals(expected, FindLuckyIntegerInArray.findLucky(arr))
    }
}