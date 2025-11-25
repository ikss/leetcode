package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfStringsCanBeMadeEqualWithOperationsIITest {
    @Test
    fun test1() {
        val s1 = "abcdba"
        val s2 = "cabdab"
        val expected = true

        assertEquals(expected, CheckIfStringsCanBeMadeEqualWithOperationsII.checkStrings(s1, s2))
    }

    @Test
    fun test2() {
        val s1 = "abe"
        val s2 = "bea"
        val expected = false

        assertEquals(expected, CheckIfStringsCanBeMadeEqualWithOperationsII.checkStrings(s1, s2))
    }
}