package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignLogStorageSystemTest {
    @Test
    fun test1() {
        val logStorageSystem = DesignLogStorageSystem.LogSystem()
        logStorageSystem.put(1, "2017:01:01:23:59:59")
        logStorageSystem.put(2, "2017:01:02:23:59:59")
        logStorageSystem.put(3, "2017:01:03:23:59:59")
        assertEquals(listOf(1, 2, 3), logStorageSystem.retrieve("2017:01:01:23:00:00", "2017:01:03:23:00:00", "Hour"))
    }
}