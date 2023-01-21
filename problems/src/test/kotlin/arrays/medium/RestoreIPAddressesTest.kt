package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RestoreIPAddressesTest {
    @Test
    fun test1() {
        val s = "25525511135"
        val expected = listOf("255.255.11.135", "255.255.111.35")

        assertEquals(expected, RestoreIPAddresses.restoreIpAddresses(s))
    }

    @Test
    fun test2() {
        val s = "0000"
        val expected = listOf("0.0.0.0")

        assertEquals(expected, RestoreIPAddresses.restoreIpAddresses(s))
    }

    @Test
    fun test3() {
        val s = "101023"
        val expected = listOf("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3")

        assertEquals(expected, RestoreIPAddresses.restoreIpAddresses(s))
    }
}