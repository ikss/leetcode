package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheKthLuckyNumberTest {
    @Test
    fun test1generate() {
        val k = 4
        val expected = "47"

        assertEquals(expected, FindTheKthLuckyNumber.kthLuckyNumberGenerate(k))
    }

    @Test
    fun test2generate() {
        val k = 10
        val expected = "477"

        assertEquals(expected, FindTheKthLuckyNumber.kthLuckyNumberGenerate(k))
    }

    @Test
    fun test3generate() {
        val k = 1000
        val expected = "777747447"

        assertEquals(expected, FindTheKthLuckyNumber.kthLuckyNumberGenerate(k))
    }

    @Test
    fun test1bitManipulation() {
        val k = 4
        val expected = "47"

        assertEquals(expected, FindTheKthLuckyNumber.kthLuckyNumberBitManipulation(k))
    }

    @Test
    fun test2bitManipulation() {
        val k = 10
        val expected = "477"

        assertEquals(expected, FindTheKthLuckyNumber.kthLuckyNumberBitManipulation(k))
    }

    @Test
    fun test3bitManipulation() {
        val k = 1000
        val expected = "777747447"

        assertEquals(expected, FindTheKthLuckyNumber.kthLuckyNumberBitManipulation(k))
    }
}