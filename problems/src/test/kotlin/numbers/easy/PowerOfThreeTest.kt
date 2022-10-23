package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class PowerOfThreeTest {

    @Test
    fun test1loop() {
        val number = 45
        val expected = false

        assertEquals(expected, PowerOfThree.isPowerOfThreeLoop(number))
    }

    @Test
    fun test2loop() {
        val number = 9
        val expected = true

        assertEquals(expected, PowerOfThree.isPowerOfThreeLoop(number))
    }

    @Test
    fun test3loop() {
        val number = 0
        val expected = false

        assertEquals(expected, PowerOfThree.isPowerOfThreeLoop(number))
    }

    @Test
    fun test4loop() {
        val number = 27
        val expected = true

        assertEquals(expected, PowerOfThree.isPowerOfThreeLoop(number))
    }

    @Test
    fun test1math() {
        val number = 45
        val expected = false

        assertEquals(expected, PowerOfThree.isPowerOfThreeMath(number))
    }

    @Test
    fun test2math() {
        val number = 9
        val expected = true

        assertEquals(expected, PowerOfThree.isPowerOfThreeMath(number))
    }

    @Test
    fun test3math() {
        val number = 0
        val expected = false

        assertEquals(expected, PowerOfThree.isPowerOfThreeMath(number))
    }

    @Test
    fun test4math() {
        val number = 27
        val expected = true

        assertEquals(expected, PowerOfThree.isPowerOfThreeMath(number))
    }
}
