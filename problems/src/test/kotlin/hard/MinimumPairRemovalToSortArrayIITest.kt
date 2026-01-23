package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumPairRemovalToSortArrayIITest {

    @Test
    fun test1() {
        val nums = intArrayOf(5, 2, 3, 1)
        val expected = 2

        assertEquals(expected, MinimumPairRemovalToSortArrayII.minimumPairRemoval(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 2)
        val expected = 0

        assertEquals(expected, MinimumPairRemovalToSortArrayII.minimumPairRemoval(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 2, -1, 3, -2, 2, 1, 1, 1, 0, -1)
        val expected = 9

        assertEquals(expected, MinimumPairRemovalToSortArrayII.minimumPairRemoval(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(3, -3, -2, 2, 2, 0, 3, 0, 1, 0, 3, -2)
        val expected = 11

        assertEquals(expected, MinimumPairRemovalToSortArrayII.minimumPairRemoval(nums))
    }
}