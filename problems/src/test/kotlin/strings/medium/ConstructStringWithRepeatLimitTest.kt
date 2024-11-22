package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructStringWithRepeatLimitTest {
    @Test
    fun test1TreeMap() {
        val s = "cczazcc"
        val repeatLimit = 3
        val expected = "zzcccac"

        assertEquals(expected, ConstructStringWithRepeatLimit.repeatLimitedStringTreeMap(s, repeatLimit))
    }

    @Test
    fun test2TreeMap() {
        val s = "aababab"
        val repeatLimit = 2
        val expected = "bbabaa"

        assertEquals(expected, ConstructStringWithRepeatLimit.repeatLimitedStringTreeMap(s, repeatLimit))
    }
}