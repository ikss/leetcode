package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivisibleAndNonDivisibleSumsDifferenceTest {
    @Test
    fun test1BruteForce() {
        val n = 10
        val m = 3
        val expected = 19

        assertEquals(expected, DivisibleAndNonDivisibleSumsDifference.differenceOfSumsBruteForce(n, m))
    }

    @Test
    fun test2BruteForce() {
        val n = 5
        val m = 6
        val expected = 15

        assertEquals(expected, DivisibleAndNonDivisibleSumsDifference.differenceOfSumsBruteForce(n, m))
    }

    @Test
    fun test1Math() {
        val n = 10
        val m = 3
        val expected = 19

        assertEquals(expected, DivisibleAndNonDivisibleSumsDifference.differenceOfSumsMath(n, m))
    }

    @Test
    fun test2Math() {
        val n = 5
        val m = 6
        val expected = 15

        assertEquals(expected, DivisibleAndNonDivisibleSumsDifference.differenceOfSumsMath(n, m))
    }
}