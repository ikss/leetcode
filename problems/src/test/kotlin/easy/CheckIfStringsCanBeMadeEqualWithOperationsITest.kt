package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfStringsCanBeMadeEqualWithOperationsITest {
    @Test
    fun test1() {
        val s1 = "abcd"
        val s2 = "cdab"
        val expected = true

        assertEquals(expected, CheckIfStringsCanBeMadeEqualWithOperationsI.canBeEqual(s1, s2))
    }

    @Test
    fun test2() {
        val s1 = "abcd"
        val s2 = "dacb"
        val expected = false

        assertEquals(expected, CheckIfStringsCanBeMadeEqualWithOperationsI.canBeEqual(s1, s2))
    }

}