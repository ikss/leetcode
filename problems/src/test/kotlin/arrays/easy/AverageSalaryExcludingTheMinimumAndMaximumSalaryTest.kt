package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {
    @Test
    fun test1() {
        val salary = intArrayOf(4000, 3000, 1000, 2000)
        val expected = 2500.00000

        assertEquals(expected, AverageSalaryExcludingTheMinimumAndMaximumSalary.average(salary), 1E-5)
    }

    @Test
    fun test2() {
        val salary = intArrayOf(1000, 2000, 3000)
        val expected = 2000.00000

        assertEquals(expected, AverageSalaryExcludingTheMinimumAndMaximumSalary.average(salary), 1E-5)
    }
}