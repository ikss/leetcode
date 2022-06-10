package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountAndSayTest {

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
}
