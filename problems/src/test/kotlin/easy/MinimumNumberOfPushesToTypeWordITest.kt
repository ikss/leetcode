package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfPushesToTypeWordITest {
    @Test
    fun test1Simulation() {
        val word = "abcde"
        val expected = 5

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushesSimulation(word))
    }

    @Test
    fun test2Simulation() {
        val word = "xycdefghij"
        val expected = 12

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushesSimulation(word))
    }

    @Test
    fun test3Simulation() {
        val word = ""
        val expected = 0

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushesSimulation(word))
    }

    @Test
    fun test1Math() {
        val word = "abcde"
        val expected = 5

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushesMath(word))
    }

    @Test
    fun test2Math() {
        val word = "xycdefghij"
        val expected = 12

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushesMath(word))
    }

    @Test
    fun test3Math() {
        val word = ""
        val expected = 0

        assertEquals(expected, MinimumNumberOfPushesToTypeWordI.minimumPushesMath(word))
    }
}