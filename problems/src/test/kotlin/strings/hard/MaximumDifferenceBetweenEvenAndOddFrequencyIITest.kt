package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDifferenceBetweenEvenAndOddFrequencyIITest {
    @Test
    fun test1() {
        val s = "12233"
        val k = 4
        val expected = -1

        assertEquals(expected, MaximumDifferenceBetweenEvenAndOddFrequencyII.maxDifference(s, k))
    }

    @Test
    fun test2() {
        val s = "1122211"
        val k = 3
        val expected = 1

        assertEquals(expected, MaximumDifferenceBetweenEvenAndOddFrequencyII.maxDifference(s, k))
    }
}