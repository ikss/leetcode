package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IPtoCIDRTest {
    @Test
    fun test1() {
        val ip = "255.0.0.7"
        val n = 10
        val expected = listOf("255.0.0.7/32", "255.0.0.8/29", "255.0.0.16/32")

        assertEquals(expected, IPtoCIDR.ipToCIDR(ip, n))
    }

    @Test
    fun test2() {
        val ip = "117.145.102.62"
        val n = 8
        val expected = listOf("117.145.102.62/31", "117.145.102.64/30", "117.145.102.68/31")

        assertEquals(expected, IPtoCIDR.ipToCIDR(ip, n))
    }

    @Test
    fun test3() {
        val ip = "0.0.0.0"
        val n = 1
        val expected = listOf("0.0.0.0/32")

        assertEquals(expected, IPtoCIDR.ipToCIDR(ip, n))
    }
}