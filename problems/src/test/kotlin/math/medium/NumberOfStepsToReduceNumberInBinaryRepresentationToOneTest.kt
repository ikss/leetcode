package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfStepsToReduceNumberInBinaryRepresentationToOneTest {

    @Test
    fun test1() {
        val s = "1101"
        val expected = 6

        assertEquals(expected, NumberOfStepsToReduceNumberInBinaryRepresentationToOne.numSteps(s))
    }

    @Test
    fun test2() {
        val s = "10"
        val expected = 1

        assertEquals(expected, NumberOfStepsToReduceNumberInBinaryRepresentationToOne.numSteps(s))
    }

    @Test
    fun test3() {
        val s = "1"
        val expected = 0

        assertEquals(expected, NumberOfStepsToReduceNumberInBinaryRepresentationToOne.numSteps(s))
    }

    @Test
    fun test4() {
        val s = "1111110011101010110011100100101110010100101110111010111110110010"
        val expected = 89

        assertEquals(expected, NumberOfStepsToReduceNumberInBinaryRepresentationToOne.numSteps(s))
    }
}