package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheStringWithLCPTest {
    @Test
    fun test1() {
        val lcp = arrayOf(
            intArrayOf(4, 0, 2, 0),
            intArrayOf(0, 3, 0, 1),
            intArrayOf(2, 0, 2, 0),
            intArrayOf(0, 1, 0, 1),
        )
        val expected = "abab"

        assertEquals(expected, FindTheStringWithLCP.findTheString(lcp))
    }

    @Test
    fun test2() {
        val lcp = arrayOf(
            intArrayOf(4, 3, 2, 1),
            intArrayOf(3, 3, 2, 1),
            intArrayOf(2, 2, 2, 1),
            intArrayOf(1, 1, 1, 1),
        )
        val expected = "aaaa"

        assertEquals(expected, FindTheStringWithLCP.findTheString(lcp))
    }

    @Test
    fun test3() {
        val lcp = arrayOf(
            intArrayOf(4, 3, 2, 1),
            intArrayOf(3, 3, 2, 1),
            intArrayOf(2, 2, 2, 1),
            intArrayOf(1, 1, 1, 3),
        )
        val expected = ""

        assertEquals(expected, FindTheStringWithLCP.findTheString(lcp))
    }
}