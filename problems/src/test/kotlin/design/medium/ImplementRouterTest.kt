package design.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ImplementRouterTest {
    @Test
    fun test1() {
        val router = ImplementRouter.Router(3)
        assertEquals(true, router.addPacket(1, 4, 90))
        assertEquals(true, router.addPacket(2, 5, 90))
        assertEquals(false, router.addPacket(1, 4, 90))
        assertEquals(true, router.addPacket(3, 5, 95))
        assertEquals(true, router.addPacket(4, 5, 105))
        assertArrayEquals(intArrayOf(2, 5, 90), router.forwardPacket())
        assertEquals(true, router.addPacket(5, 2, 110))
        assertEquals(1, router.getCount(5, 100, 110))
    }
}