package arrays.easy

import arrays.easy.FruitsIntoBasketsII.numOfUnplacedFruits
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FruitsIntoBasketsIITest {
    @Test
    fun test1() {
        val fruits = intArrayOf(4, 2, 5)
        val baskets = intArrayOf(3, 5, 4)
        val expected = 1

        assertEquals(expected, numOfUnplacedFruits(fruits, baskets))
    }

    @Test
    fun test2() {
        val fruits = intArrayOf(3, 6, 1)
        val baskets = intArrayOf(6, 4, 7)
        val expected = 0

        assertEquals(expected, numOfUnplacedFruits(fruits, baskets))
    }
}