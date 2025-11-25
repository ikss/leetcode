package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReorderedPowerOf2Test {

    @Test
    fun test1() {
        val n = 1
        val expected = true

        assertEquals(expected, ReorderedPowerOf2.reorderedPowerOf2(n))
    }

    @Test
    fun test2() {
        val n = 10
        val expected = false

        assertEquals(expected, ReorderedPowerOf2.reorderedPowerOf2(n))
    }

    @Test
    fun test3() {
        val n = 46
        val expected = true

        assertEquals(expected, ReorderedPowerOf2.reorderedPowerOf2(n))
    }

    @Test
    fun test4() {
        val n = 125
        val expected = true

        assertEquals(expected, ReorderedPowerOf2.reorderedPowerOf2(n))
    }
}
