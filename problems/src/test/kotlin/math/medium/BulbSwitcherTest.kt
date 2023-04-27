package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BulbSwitcherTest {

    @Test
    fun test1() {
        val n = 3
        val expected = 1

        assertEquals(expected, BulbSwitcher.bulbSwitch(n))
    }

    @Test
    fun test2() {
        val n = 0
        val expected = 0

        assertEquals(expected, BulbSwitcher.bulbSwitch(n))
    }

    @Test
    fun test3() {
        val n = 1
        val expected = 1

        assertEquals(expected, BulbSwitcher.bulbSwitch(n))
    }
}