package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDifficultyOfJobScheduleTest {

    @Test
    fun test1() {
        val jobDifficulty = intArrayOf(6, 5, 4, 3, 2, 1)
        val d = 2
        val expected = 7

        assertEquals(expected, MinimumDifficultyOfJobSchedule.minDifficulty(jobDifficulty, d))
    }

    @Test
    fun test2() {
        val jobDifficulty = intArrayOf(9, 9, 9)
        val d = 4
        val expected = -1

        assertEquals(expected, MinimumDifficultyOfJobSchedule.minDifficulty(jobDifficulty, d))
    }

    @Test
    fun test3() {
        val jobDifficulty = intArrayOf(1, 1, 1)
        val d = 3
        val expected = 3

        assertEquals(expected, MinimumDifficultyOfJobSchedule.minDifficulty(jobDifficulty, d))
    }
}