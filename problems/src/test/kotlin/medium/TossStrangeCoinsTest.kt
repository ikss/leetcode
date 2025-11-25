package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TossStrangeCoinsTest {
    @Test
    fun test1dpTopDown() {
        val prob = doubleArrayOf(0.4)
        val target = 1
        val expected = 0.40000

        assertEquals(expected, TossStrangeCoins.probabilityOfHeadsDpTopDown(prob, target), 1e-5)
    }

    @Test
    fun test2TopDown() {
        val prob = doubleArrayOf(0.5, 0.5, 0.5, 0.5, 0.5)
        val target = 0
        val expected = 0.03125

        assertEquals(expected, TossStrangeCoins.probabilityOfHeadsDpTopDown(prob, target), 1e-5)
    }
    @Test
    fun test1dpBottomUp() {
        val prob = doubleArrayOf(0.4)
        val target = 1
        val expected = 0.40000

        assertEquals(expected, TossStrangeCoins.probabilityOfHeadsDpBottomUp(prob, target), 1e-5)
    }

    @Test
    fun test2dpBottomUp() {
        val prob = doubleArrayOf(0.5, 0.5, 0.5, 0.5, 0.5)
        val target = 0
        val expected = 0.03125

        assertEquals(expected, TossStrangeCoins.probabilityOfHeadsDpBottomUp(prob, target), 1e-5)
    }
}