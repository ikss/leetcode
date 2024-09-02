package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheStudentThatWillReplaceTheChalkTest {
    @Test
    fun test1() {
        val chalk = intArrayOf(5, 1, 5)
        val k = 22
        val expected = 0

        assertEquals(expected, FindTheStudentThatWillReplaceTheChalk.chalkReplacer(chalk, k))
    }
    
    @Test
    fun test2() {
        val chalk = intArrayOf(3, 4, 1, 2)
        val k = 25
        val expected = 1

        assertEquals(expected, FindTheStudentThatWillReplaceTheChalk.chalkReplacer(chalk, k))
    }
}