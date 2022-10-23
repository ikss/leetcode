package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GuessNumberTest {

    @Test
    fun test1() {
        val guesser = object : GuessNumber() {
            override fun guess(num: Int): Int = 6.compareTo(num)
        }

        assertEquals(6, guesser.guessNumber(10))
    }

    @Test
    fun test2() {
        val guesser = object : GuessNumber() {
            override fun guess(num: Int): Int = 1.compareTo(num)
        }

        assertEquals(1, guesser.guessNumber(1))
    }

    @Test
    fun test3() {
        val guesser = object : GuessNumber() {
            override fun guess(num: Int): Int = 1.compareTo(num)
        }

        assertEquals(1, guesser.guessNumber(2))
    }
}
