package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MaximumCoinsHeroesCanCollectTest {
    @Test
    fun test1() {
        val heroes = intArrayOf(1, 4, 2)
        val monsters = intArrayOf(1, 1, 5, 2, 3)
        val coins = intArrayOf(2, 3, 4, 5, 6)
        val expected = longArrayOf(5, 16, 10)

        assertArrayEquals(expected, MaximumCoinsHeroesCanCollect.maximumCoins(heroes, monsters, coins))
    }

    @Test
    fun test2() {
        val heroes = intArrayOf(5)
        val monsters = intArrayOf(2, 3, 1, 2)
        val coins = intArrayOf(10, 6, 5, 2)
        val expected = longArrayOf(23)

        assertArrayEquals(expected, MaximumCoinsHeroesCanCollect.maximumCoins(heroes, monsters, coins))
    }

    @Test
    fun test3() {
        val heroes = intArrayOf(4, 4)
        val monsters = intArrayOf(5, 7, 8)
        val coins = intArrayOf(1, 1, 1)
        val expected = longArrayOf(0, 0)

        assertArrayEquals(expected, MaximumCoinsHeroesCanCollect.maximumCoins(heroes, monsters, coins))
    }
}