package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JumpGameIVTest {

    @Test
    fun test1() {
        val arr = intArrayOf(100, -23, -23, 404, 100, 23, 23, 23, 3, 404)
        val expected = 3

        assertEquals(expected, JumpGameIV.minJumps(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(7)
        val expected = 0

        assertEquals(expected, JumpGameIV.minJumps(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(7, 6, 9, 6, 9, 6, 9, 7)
        val expected = 1

        assertEquals(expected, JumpGameIV.minJumps(arr))
    }
}