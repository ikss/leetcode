package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TimeBasedKeyValueStorageTest {
    @Test
    fun test1() {
        val timeBasedKeyValueStorage = TimeBasedKeyValueStorage()
        timeBasedKeyValueStorage.set("foo", "bar", 1)
        assertEquals("bar", timeBasedKeyValueStorage.get("foo", 1))
        assertEquals("bar", timeBasedKeyValueStorage.get("foo", 3))

        timeBasedKeyValueStorage.set("foo", "bar2", 4)
        assertEquals("bar2", timeBasedKeyValueStorage.get("foo", 4))
        assertEquals("bar2", timeBasedKeyValueStorage.get("foo", 5))
    }
}