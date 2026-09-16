package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSetsOfKNonOverlappingLineSegmentsTest {
    @Test
    fun test1() {
        val n = 4
        val k = 2
        val expected = 5

        assertEquals(expected, NumberOfSetsOfKNonOverlappingLineSegments.numberOfSets(n, k))
    }

    @Test
    fun test2() {
        val n = 3
        val k = 1
        val expected = 3

        assertEquals(expected, NumberOfSetsOfKNonOverlappingLineSegments.numberOfSets(n, k))
    }

    @Test
    fun test3() {
        val n = 30
        val k = 7
        val expected = 796297179

        assertEquals(expected, NumberOfSetsOfKNonOverlappingLineSegments.numberOfSets(n, k))
    }
}