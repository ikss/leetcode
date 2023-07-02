package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FairDistributionOfCookiesTest {
    @Test
    fun test1() {
        val cookies = intArrayOf(8, 15, 10, 20, 8)
        val k = 2
        val expected = 31

        assertEquals(expected, FairDistributionOfCookies.distributeCookies(cookies, k))
    }

    @Test
    fun test2() {
        val cookies = intArrayOf(6, 1, 3, 2, 2, 4, 1, 2)
        val k = 3
        val expected = 7

        assertEquals(expected, FairDistributionOfCookies.distributeCookies(cookies, k))
    }
}