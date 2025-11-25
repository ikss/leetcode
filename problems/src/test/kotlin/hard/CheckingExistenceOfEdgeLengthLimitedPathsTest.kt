package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CheckingExistenceOfEdgeLengthLimitedPathsTest {

    @Test
    fun test1() {
        val n = 3
        val edgeList = arrayOf(intArrayOf(0, 1, 2), intArrayOf(1, 2, 4), intArrayOf(2, 0, 8), intArrayOf(1, 0, 16))
        val queries = arrayOf(intArrayOf(0, 1, 2), intArrayOf(0, 2, 5))
        val expected = booleanArrayOf(false, true)

        val actual = CheckingExistenceOfEdgeLengthLimitedPaths.distanceLimitedPathsExist(n, edgeList, queries)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        val n = 5
        val edgeList = arrayOf(intArrayOf(0, 1, 10), intArrayOf(1, 2, 5), intArrayOf(2, 3, 9), intArrayOf(3, 4, 13))
        val queries = arrayOf(intArrayOf(0, 4, 14), intArrayOf(1, 4, 13))
        val expected = booleanArrayOf(true, false)

        val actual = CheckingExistenceOfEdgeLengthLimitedPaths.distanceLimitedPathsExist(n, edgeList, queries)
        assertArrayEquals(expected, actual)
    }
}