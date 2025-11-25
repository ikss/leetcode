package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SeatManagerTest {
    @Test
    fun test1() {
        // Initializes a SeatManager with 5 seats.
        val seatManager: SeatManager.SeatManager = SeatManager.SeatManager(5)

        // All seats are available, so return the lowest numbered seat, which is 1.
        assertEquals(1, seatManager.reserve())

        // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        assertEquals(2, seatManager.reserve())

        // Unreserve seat 2, so now the available seats are [2,3,4,5].
        seatManager.unreserve(2)

        // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        assertEquals(2, seatManager.reserve())

        // The available seats are [3,4,5], so return the lowest of them, which is 3.
        assertEquals(3, seatManager.reserve())

        // The available seats are [4,5], so return the lowest of them, which is 4.
        assertEquals(4, seatManager.reserve())

        // The only available seat is seat 5, so return 5.
        assertEquals(5, seatManager.reserve())

        // Unreserve seat 5, so now the available seats are [5].
        seatManager.unreserve(5)
    }
}