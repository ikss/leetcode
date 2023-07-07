package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeTheConfusionOfAnExamTest {
    @Test
    fun test1slidingWindow() {
        val answerKey = "TTFF"
        val k = 2
        val expected = 4

        assertEquals(expected, MaximizeTheConfusionOfAnExam.maxConsecutiveAnswersSlidingWindow(answerKey, k))
    }

    @Test
    fun test2slidingWindow() {
        val answerKey = "TFFT"
        val k = 1
        val expected = 3

        assertEquals(expected, MaximizeTheConfusionOfAnExam.maxConsecutiveAnswersSlidingWindow(answerKey, k))
    }

    @Test
    fun test3slidingWindow() {
        val answerKey = "TTFTTFTT"
        val k = 1
        val expected = 5

        assertEquals(expected, MaximizeTheConfusionOfAnExam.maxConsecutiveAnswersSlidingWindow(answerKey, k))
    }

    @Test
    fun test1priorityQueue() {
        val answerKey = "TTFF"
        val k = 2
        val expected = 4

        assertEquals(expected, MaximizeTheConfusionOfAnExam.maxConsecutiveAnswersPQ(answerKey, k))
    }

    @Test
    fun test2priorityQueue() {
        val answerKey = "TFFT"
        val k = 1
        val expected = 3

        assertEquals(expected, MaximizeTheConfusionOfAnExam.maxConsecutiveAnswersPQ(answerKey, k))
    }

    @Test
    fun test3priorityQueue() {
        val answerKey = "TTFTTFTT"
        val k = 1
        val expected = 5

        assertEquals(expected, MaximizeTheConfusionOfAnExam.maxConsecutiveAnswersPQ(answerKey, k))
    }
}