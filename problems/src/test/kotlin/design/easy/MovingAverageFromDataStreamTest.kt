package design.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MovingAverageFromDataStreamTest {
    @Test
    fun test1() {
        val movingAverage = MovingAverageFromDataStream.MovingAverage(3)
        assertEquals(1.0, movingAverage.next(1), 0.0001) // return 1.0 = 1 / 1

        assertEquals(5.5, movingAverage.next(10), 0.0001) // return 5.5 = (1 + 10) / 2

        assertEquals(4.6666, movingAverage.next(3), 0.0001) // return 4.66667 = (1 + 10 + 3) / 3

        assertEquals(6.0, movingAverage.next(5), 0.0001) // return 6.0 = (10 + 3 + 5) / 3
    }
}