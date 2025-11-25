package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CherryPickupIITest {
    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(3, 1, 1),
            intArrayOf(2, 5, 1),
            intArrayOf(1, 5, 5),
            intArrayOf(2, 1, 1),
        )
        val expected = 24

        assertEquals(expected, CherryPickupII.cherryPickup(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1, 0, 0, 0, 0, 0, 1),
            intArrayOf(2, 0, 0, 0, 0, 3, 0),
            intArrayOf(2, 0, 9, 0, 0, 0, 0),
            intArrayOf(0, 3, 0, 5, 4, 0, 0),
            intArrayOf(1, 0, 2, 3, 0, 0, 6),
        )
        val expected = 28

        assertEquals(expected, CherryPickupII.cherryPickup(grid))
    }
}