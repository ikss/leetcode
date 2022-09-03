package numbers.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class NumbersWithSameConsecutiveDifferencesTest {

    @Test
    fun test1() {
        val n = 3
        val k = 7
        val expected = intArrayOf(181, 292, 707, 818, 929)

        assertTrue(expected.contentEquals(NumbersWithSameConsecutiveDifferences.numsSameConsecDiffNaive(n, k)))
    }

    @Test
    fun test2() {
        val n = 2
        val k = 1
        val expected = intArrayOf(10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98)

        assertTrue(expected.contentEquals(NumbersWithSameConsecutiveDifferences.numsSameConsecDiffNaive(n, k)))
    }

    @Test
    fun test3() {
        val n = 2
        val k = 0
        val expected = intArrayOf(11, 22, 33, 44, 55, 66, 77, 88, 99)

        val other = NumbersWithSameConsecutiveDifferences.numsSameConsecDiffNaive(n, k)
        assertTrue(expected.contentEquals(other))
    }
}
