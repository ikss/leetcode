package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWaysToDivideLongCorridorTest {
    @Test
    fun test1() {
        val corridor = "SSPPSPS"
        val expected = 3

        assertEquals(expected, NumberOfWaysToDivideLongCorridor.numberOfWays(corridor))
    }

    @Test
    fun test2() {
        val corridor = "PPSPSP"
        val expected = 1

        assertEquals(expected, NumberOfWaysToDivideLongCorridor.numberOfWays(corridor))
    }

    @Test
    fun test3() {
        val corridor = "S"
        val expected = 0

        assertEquals(expected, NumberOfWaysToDivideLongCorridor.numberOfWays(corridor))
    }
}