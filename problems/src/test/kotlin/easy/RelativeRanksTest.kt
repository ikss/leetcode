package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RelativeRanksTest {
    @Test
    fun test1() {
        val nums = intArrayOf(5, 4, 3, 2, 1)
        val expected = arrayOf("Gold Medal", "Silver Medal", "Bronze Medal", "4", "5")

        assertArrayEquals(expected, RelativeRanks.findRelativeRanks(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(10, 3, 8, 9, 4)
        val expected = arrayOf("Gold Medal", "5", "Bronze Medal", "Silver Medal", "4")

        assertArrayEquals(expected, RelativeRanks.findRelativeRanks(nums))
    }
}