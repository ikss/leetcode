package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PowerOfThreeTest {

    @Test
    fun test1() {
        val number = 45
        val expected = false
        assertEquals(expected, PowerOfThree.isPowerOfThree(number))
    }

    @Test
    fun test2() {
        val number = 9
        val expected = true
        assertEquals(expected, PowerOfThree.isPowerOfThree(number))
    }

    @Test
    fun test3() {
        val number = 0
        val expected = false
        assertEquals(expected, PowerOfThree.isPowerOfThree(number))
    }

    @Test
    fun test4() {
        val number = 27
        val expected = true
        assertEquals(expected, PowerOfThree.isPowerOfThree(number))
    }
}
