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

    @Test
    fun test2() {
        val movingAverage = MovingAverageFromDataStream.MovingAverage(3)
        assertEquals(Int.MAX_VALUE.toDouble(), movingAverage.next(Int.MAX_VALUE), 0.0001)

        assertEquals(Int.MAX_VALUE.toDouble(), movingAverage.next(Int.MAX_VALUE), 0.0001)
    }

    @Test
    fun test3() {
        val max = 10e5.toInt()
        val movingAverage = MovingAverageFromDataStream.MovingAverage(max + 1)
        assertEquals(max.toDouble(), movingAverage.next(max), 0.0001)

        for (i in 1 until max) {
            movingAverage.next(1)
        }

        assertEquals(2.0, movingAverage.next(1), 0.0001)
    }

    @Test
    fun test1WithoutOverflow() {
        val movingAverage = MovingAverageFromDataStream.MovingAverageWithoutOverflow(3)
        assertEquals(1.0, movingAverage.next(1), 0.0001) // return 1.0 = 1 / 1

        assertEquals(5.5, movingAverage.next(10), 0.0001) // return 5.5 = (1 + 10) / 2

        assertEquals(4.6666, movingAverage.next(3), 0.0001) // return 4.66667 = (1 + 10 + 3) / 3

        assertEquals(6.0, movingAverage.next(5), 0.0001) // return 6.0 = (10 + 3 + 5) / 3
    }

    @Test
    fun test2WithoutOverflow() {
        val movingAverage = MovingAverageFromDataStream.MovingAverageWithoutOverflow(3)
        assertEquals(Int.MAX_VALUE.toDouble(), movingAverage.next(Int.MAX_VALUE), 0.0001)

        assertEquals(Int.MAX_VALUE.toDouble(), movingAverage.next(Int.MAX_VALUE), 0.0001)
    }

    @Test
    fun test3WithoutOverflow() {
        val max = 10e5.toInt()
        val movingAverage = MovingAverageFromDataStream.MovingAverageWithoutOverflow(max + 1)
        assertEquals(max.toDouble(), movingAverage.next(max), 0.0001)

        for (i in 1 until max) {
            movingAverage.next(1)
        }

        assertEquals(2.0, movingAverage.next(1), 0.0001)
    }
}