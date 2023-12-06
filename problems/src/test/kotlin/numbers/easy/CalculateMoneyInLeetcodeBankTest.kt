package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculateMoneyInLeetcodeBankTest {
    @Test
    fun test1() {
        val n = 4
        val expected = 10

        assertEquals(expected, CalculateMoneyInLeetcodeBank.totalMoney(n))
    }

    @Test
    fun test2() {
        val n = 10
        val expected = 37

        assertEquals(expected, CalculateMoneyInLeetcodeBank.totalMoney(n))
    }

    @Test
    fun test3() {
        val n = 20
        val expected = 96

        assertEquals(expected, CalculateMoneyInLeetcodeBank.totalMoney(n))
    }
}