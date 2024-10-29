package design.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DesignAnATMMachineTest {
    @Test
    fun test1() {
        val atm = DesignAnATMMachine.ATM()
        atm.deposit(intArrayOf(0, 0, 1, 2, 1))
        assertArrayEquals(intArrayOf(0, 0, 1, 0, 1), atm.withdraw(600))

        atm.deposit(intArrayOf(0, 1, 0, 1, 1))
        assertArrayEquals(intArrayOf(-1), atm.withdraw(600))
        
        assertArrayEquals(intArrayOf(0, 1, 0, 0, 1), atm.withdraw(550))
    }
}