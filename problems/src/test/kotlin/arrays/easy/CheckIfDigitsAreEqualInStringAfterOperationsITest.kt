package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfDigitsAreEqualInStringAfterOperationsITest {
    @Test
    fun test1() {
        val s = "3902"
        val expected = true

        assertEquals(expected, CheckIfDigitsAreEqualInStringAfterOperationsI.hasSameDigits(s))
    }

    @Test
    fun test2() {
        val s = "34789"
        val expected = false

        assertEquals(expected, CheckIfDigitsAreEqualInStringAfterOperationsI.hasSameDigits(s))
    }
}