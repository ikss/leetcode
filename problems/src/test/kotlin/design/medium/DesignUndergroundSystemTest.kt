package design.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignUndergroundSystemTest {
    @Test
    fun test1() {
        val undergroundSystem = DesignUndergroundSystem.UndergroundSystem()
        undergroundSystem.checkIn(45, "Leyton", 3)
        undergroundSystem.checkIn(32, "Paradise", 8)
        undergroundSystem.checkIn(27, "Leyton", 10)
        // Customer 45 "Leyton" -> "Waterloo" in 15-3 = 12
        undergroundSystem.checkOut(45, "Waterloo", 15)

        // Customer 27 "Leyton" -> "Waterloo" in 20-10 = 10
        undergroundSystem.checkOut(27, "Waterloo", 20)

        // Customer 32 "Paradise" -> "Cambridge" in 22-8 = 14
        undergroundSystem.checkOut(32, "Cambridge", 22)

        // return 14.00000. One trip "Paradise" -> "Cambridge", (14) / 1 = 14
        assertEquals(14.0, undergroundSystem.getAverageTime("Paradise", "Cambridge"), 0.00001)

        // return 11.00000. Two trips "Leyton" -> "Waterloo", (10 + 12) / 2 = 11
        assertEquals(11.0, undergroundSystem.getAverageTime("Leyton", "Waterloo"), 0.00001)

        undergroundSystem.checkIn(10, "Leyton", 24)

        // return 11.00000
        assertEquals(11.0, undergroundSystem.getAverageTime("Leyton", "Waterloo"), 0.00001)

        // Customer 10 "Leyton" -> "Waterloo" in 38-24 = 14
        undergroundSystem.checkOut(10, "Waterloo", 38)

        // return 12.00000. Three trips "Leyton" -> "Waterloo", (10 + 12 + 14) / 3 = 12
        assertEquals(12.0, undergroundSystem.getAverageTime("Leyton", "Waterloo"), 0.00001)

    }
}