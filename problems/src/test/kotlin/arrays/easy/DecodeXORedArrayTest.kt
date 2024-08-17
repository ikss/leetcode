package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DecodeXORedArrayTest {
    @Test
    fun test1() {
        val encoded = intArrayOf(1, 2, 3)
        val first = 1
        val expected = intArrayOf(1, 0, 2, 1)

        assertArrayEquals(expected, DecodeXORedArray.decode(encoded, first))
    }
    
    @Test
    fun test2() {
        val encoded = intArrayOf(6, 2, 7, 3)
        val first = 4
        val expected = intArrayOf(4, 2, 0, 7, 4)

        assertArrayEquals(expected, DecodeXORedArray.decode(encoded, first))
    }
}