package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindSumOfArrayProductOfMagicalSequencesTest {
    @Test
    fun test1() {
        val m = 5
        val k = 5
        val nums = intArrayOf(1, 10, 100, 10000, 1000000)
        val expected = 991600007

        assertEquals(expected, FindSumOfArrayProductOfMagicalSequences.magicalSum(m, k, nums))
    }

    @Test
    fun test2() {
        val m = 2
        val k = 2
        val nums = intArrayOf(5, 4, 3, 2, 1)
        val expected = 170

        assertEquals(expected, FindSumOfArrayProductOfMagicalSequences.magicalSum(m, k, nums))
    }

    @Test
    fun test3() {
        val m = 1
        val k = 1
        val nums = intArrayOf(28)
        val expected = 28

        assertEquals(expected, FindSumOfArrayProductOfMagicalSequences.magicalSum(m, k, nums))
    }
}