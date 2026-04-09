package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class XORAfterRangeMultiplicationQueriesIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 1)
        val queries = arrayOf(intArrayOf(0, 2, 1, 4))
        val expected = 4

        assertEquals(expected, XORAfterRangeMultiplicationQueriesII.xorAfterQueries(nums, queries))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 1, 5, 4)
        val queries = arrayOf(intArrayOf(1, 4, 2, 3), intArrayOf(0, 2, 1, 2))
        val expected = 31

        assertEquals(expected, XORAfterRangeMultiplicationQueriesII.xorAfterQueries(nums, queries))
    }
}