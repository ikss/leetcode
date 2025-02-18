package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructSmallestNumberFromDIStringTest {
    @Test
    fun test1() {
        val input = "IIIDIDDD"
        val expected = "123549876"

        assertEquals(expected, ConstructSmallestNumberFromDIString.smallestNumber(input))
    }

    @Test
    fun test2() {
        val input = "DDD"
        val expected = "4321"

        assertEquals(expected, ConstructSmallestNumberFromDIString.smallestNumber(input))
    }
}