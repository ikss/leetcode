package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheCountOfGoodIntegersTest {
    @Test
    fun test1() {
        val n = 3
        val k = 5
        val expected = 27L

        assertEquals(expected, FindTheCountOfGoodIntegers.countGoodIntegers(n, k))
    }

    @Test
    fun test2() {
        val n = 1
        val k = 4
        val expected = 2L

        assertEquals(expected, FindTheCountOfGoodIntegers.countGoodIntegers(n, k))
    }

    @Test
    fun test3() {
        val n = 5
        val k = 6
        val expected = 2468L

        assertEquals(expected, FindTheCountOfGoodIntegers.countGoodIntegers(n, k))
    }
}