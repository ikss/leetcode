package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddBinaryTest {

    @Test
    fun test1() {
        val a = "11"
        val b = "1"
        val expected = "100"

        assertEquals(expected, AddBinary.addBinary(a, b))
    }

    @Test
    fun test2() {
        val a = "1010"
        val b = "1011"
        val expected = "10101"

        assertEquals(expected, AddBinary.addBinary(a, b))
    }
}