package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWaysToStayInTheSamePlaceAfterSomeStepsTest {
    @Test
    fun test1() {
        val steps = 3
        val arrLen = 2
        val expected = 4

        assertEquals(expected, NumberOfWaysToStayInTheSamePlaceAfterSomeSteps.numWays(steps, arrLen))
    }

    @Test
    fun test2() {
        val steps = 2
        val arrLen = 4
        val expected = 2

        assertEquals(expected, NumberOfWaysToStayInTheSamePlaceAfterSomeSteps.numWays(steps, arrLen))
    }

    @Test
    fun test3() {
        val steps = 4
        val arrLen = 2
        val expected = 8

        assertEquals(expected, NumberOfWaysToStayInTheSamePlaceAfterSomeSteps.numWays(steps, arrLen))
    }

    @Test
    fun test1spaceOptimized() {
        val steps = 3
        val arrLen = 2
        val expected = 4

        assertEquals(expected, NumberOfWaysToStayInTheSamePlaceAfterSomeSteps.numWaysSpaceOptimized(steps, arrLen))
    }

    @Test
    fun test2spaceOptimized() {
        val steps = 2
        val arrLen = 4
        val expected = 2

        assertEquals(expected, NumberOfWaysToStayInTheSamePlaceAfterSomeSteps.numWaysSpaceOptimized(steps, arrLen))
    }

    @Test
    fun test3spaceOptimized() {
        val steps = 4
        val arrLen = 2
        val expected = 8

        assertEquals(expected, NumberOfWaysToStayInTheSamePlaceAfterSomeSteps.numWaysSpaceOptimized(steps, arrLen))
    }
}