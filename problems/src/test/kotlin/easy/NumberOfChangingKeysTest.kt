package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfChangingKeysTest {
    @Test
    fun test1() {
        val s = "aAbBcC"
        val expected = 2

        assertEquals(expected, NumberOfChangingKeys.countKeyChanges(s))
    }

    @Test
    fun test2() {
        val s = "AaAaAaaA"
        val expected = 0

        assertEquals(expected, NumberOfChangingKeys.countKeyChanges(s))
    }
}