package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountAndSayTest {

    @Test
    fun test1() {
        val n = 1
        val expected = "1"

        assertEquals(expected, CountAndSay.countAndSay(n))
    }

    @Test
    fun test2() {
        val n = 4
        val expected = "1211"

        assertEquals(expected, CountAndSay.countAndSay(n))
    }

    @Test
    fun test3() {
        val n = 11
        val expected = "11131221133112132113212221"

        assertEquals(expected, CountAndSay.countAndSay(n))
    }


    @Test
    fun test1twoHelpers() {
        val n = 1
        val expected = "1"

        assertEquals(expected, CountAndSay.countAndSayTwoHelpers(n))
    }

    @Test
    fun test2twoHelpers() {
        val n = 4
        val expected = "1211"

        assertEquals(expected, CountAndSay.countAndSayTwoHelpers(n))
    }

    @Test
    fun test3twoHelpers() {
        val n = 11
        val expected = "11131221133112132113212221"

        assertEquals(expected, CountAndSay.countAndSayTwoHelpers(n))
    }
}
