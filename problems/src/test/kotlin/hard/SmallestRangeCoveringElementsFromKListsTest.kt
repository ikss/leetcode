package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SmallestRangeCoveringElementsFromKListsTest {
    @Test
    fun test1() {
        val nums = listOf(
            listOf(4, 10, 15, 24, 26),
            listOf(0, 9, 12, 20),
            listOf(5, 18, 22, 30),
        )
        val expected = intArrayOf(20, 24)

        assertArrayEquals(expected, SmallestRangeCoveringElementsFromKLists.smallestRange(nums))
    }

    @Test
    fun test2() {
        val nums = listOf(
            listOf(1, 2, 3),
            listOf(1, 2, 3),
            listOf(1, 2, 3),
        )
        val expected = intArrayOf(1, 1)

        assertArrayEquals(expected, SmallestRangeCoveringElementsFromKLists.smallestRange(nums))
    }
}