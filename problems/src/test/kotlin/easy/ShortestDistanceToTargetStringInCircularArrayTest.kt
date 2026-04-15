package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestDistanceToTargetStringInCircularArrayTest {
    @Test
    fun test1() {
        val words = arrayOf("hello", "i", "am", "leetcode", "hello")
        val target = "hello"
        val startIndex = 1
        val expected = 1

        assertEquals(expected, ShortestDistanceToTargetStringInCircularArray.closestTarget(words, target, startIndex))
    }

    @Test
    fun test2() {
        val words = arrayOf("a", "b", "leetcode")
        val target = "leetcode"
        val startIndex = 0
        val expected = 1

        assertEquals(expected, ShortestDistanceToTargetStringInCircularArray.closestTarget(words, target, startIndex))
    }

    @Test
    fun test3() {
        val words = arrayOf("i", "eat", "leetcode")
        val target = "ate"
        val startIndex = 0
        val expected = -1

        assertEquals(expected, ShortestDistanceToTargetStringInCircularArray.closestTarget(words, target, startIndex))
    }
}