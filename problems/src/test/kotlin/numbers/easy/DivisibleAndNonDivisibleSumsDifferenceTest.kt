package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivisibleAndNonDivisibleSumsDifferenceTest {
    @Test
    fun test1() {
        val n = 10
        val m = 3
        val expected = 19

        assertEquals(expected, DivisibleAndNonDivisibleSumsDifference.differenceOfSums(n, m))
    }

    @Test
    fun test2() {
        val n = 5
        val m = 6
        val expected = 15

        assertEquals(expected, DivisibleAndNonDivisibleSumsDifference.differenceOfSums(n, m))
    }
}