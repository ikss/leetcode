package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FruitIntoBasketsIIITest {
    @Test
    fun test1() {
        val fruits = intArrayOf(4, 2, 5)
        val baskets = intArrayOf(3, 5, 4)
        val expected = 1

        assertEquals(expected, FruitIntoBasketsIII.numOfUnplacedFruits(fruits, baskets))
    }

    @Test
    fun test2() {
        val fruits = intArrayOf(3, 6, 1)
        val baskets = intArrayOf(6, 4, 7)
        val expected = 0

        assertEquals(expected, FruitIntoBasketsIII.numOfUnplacedFruits(fruits, baskets))
    }
}