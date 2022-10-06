package design.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeMapTest {
    @Test
    fun test1() {
        val timeMap = TimeMap()
        timeMap.set("foo", "bar", 1)
        assertEquals("bar", timeMap.get("foo", 1))
        assertEquals("bar", timeMap.get("foo", 3))

        timeMap.set("foo", "bar2", 4)
        assertEquals("bar2", timeMap.get("foo", 4))
        assertEquals("bar2", timeMap.get("foo", 5))
    }
}