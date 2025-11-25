package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AliceAndBobPlayingFlowerGameTest {
    @Test
    fun test1() {
        val n = 3
        val m = 2
        val expected = 3L

        assertEquals(expected, AliceAndBobPlayingFlowerGame.flowerGame(n, m))
    }

    @Test
    fun test2() {
        val n = 1
        val m = 1
        val expected = 0L

        assertEquals(expected, AliceAndBobPlayingFlowerGame.flowerGame(n, m))
    }
}