package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AnalyzeUserWebsiteVisitPatternTest {
    @Test
    fun test1() {
        val username = arrayOf("joe", "joe", "joe", "james", "james", "james", "james", "mary", "mary", "mary")
        val timestamp = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val website = arrayOf("home", "about", "career", "home", "cart", "maps", "home", "home", "about", "career")
        val expected = listOf("home", "about", "career")

        assertEquals(expected, AnalyzeUserWebsiteVisitPattern.mostVisitedPattern(username, timestamp, website))
    }

    @Test
    fun test2() {
        val username = arrayOf("ua", "ua", "ua", "ub", "ub", "ub")
        val timestamp = intArrayOf(1, 2, 3, 4, 5, 6)
        val website = arrayOf("a", "b", "a", "a", "b", "c")
        val expected = listOf("a", "b", "a")

        assertEquals(expected, AnalyzeUserWebsiteVisitPattern.mostVisitedPattern(username, timestamp, website))
    }

    @Test
    fun test3() {
        val username = arrayOf("zkiikgv", "zkiikgv", "zkiikgv", "zkiikgv")
        val timestamp = intArrayOf(436363475, 710406388, 386655081, 797150921)
        val website = arrayOf("wnaaxbfhxp", "mryxsjc", "oz", "wlarkzzqht")
        val expected = listOf("oz", "mryxsjc", "wlarkzzqht")

        assertEquals(expected, AnalyzeUserWebsiteVisitPattern.mostVisitedPattern(username, timestamp, website))
    }
}