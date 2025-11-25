package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountAllValidPickupAndDeliveryOptionsTest {
    @Test
    fun test1() {
        val n = 1
        val expected = 1

        assertEquals(expected, CountAllValidPickupAndDeliveryOptions.countOrders(n))
    }

    @Test
    fun test2() {
        val n = 2
        val expected = 6

        assertEquals(expected, CountAllValidPickupAndDeliveryOptions.countOrders(n))
    }

    @Test
    fun test3() {
        val n = 8
        val expected = 729647433

        assertEquals(expected, CountAllValidPickupAndDeliveryOptions.countOrders(n))
    }
}