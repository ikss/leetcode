package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfDifferentIntegersInStringTest {
    @Test
    fun test1() {
        val word = "a123bc34d8ef34"
        val expected = 3

        assertEquals(expected, NumberOfDifferentIntegersInString.numDifferentIntegers(word))
    }
    
    @Test
    fun test2() {
        val word = "leet1234code234"
        val expected = 2

        assertEquals(expected, NumberOfDifferentIntegersInString.numDifferentIntegers(word))
    }
    
    @Test
    fun test3() {
        val word = "a1b01c001"
        val expected = 1

        assertEquals(expected, NumberOfDifferentIntegersInString.numDifferentIntegers(word))
    }
}