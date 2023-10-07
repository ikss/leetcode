package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BuildArrayWhereYouCanFindTheMaximumExactlyKComparisonsTest {
    @Test
    fun test1() {
        val n = 2
        val m = 3
        val k = 1
        val expected = 6

        assertEquals(expected, BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n, m, k))
    }

    @Test
    fun test2() {
        val n = 5
        val m = 2
        val k = 3
        val expected = 0

        assertEquals(expected, BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n, m, k))
    }

    @Test
    fun test3() {
        val n = 9
        val m = 1
        val k = 1
        val expected = 1

        assertEquals(expected, BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n, m, k))
    }
}