package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CanMakeArithmeticProgressionFromSequenceTest {
    @Test
    fun test1() {
        val arr = intArrayOf(3, 5, 1)
        val expected = true

        assertEquals(expected, CanMakeArithmeticProgressionFromSequence.canMakeArithmeticProgression(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 2, 4)
        val expected = false

        assertEquals(expected, CanMakeArithmeticProgressionFromSequence.canMakeArithmeticProgression(arr))
    }
}