package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistributeCandiesAmongChildrenIITest {
    @Test
    fun test1() {
        val candies = 5
        val k = 2
        val expected = 3L

        assertEquals(expected, DistributeCandiesAmongChildrenII.distributeCandies(candies, k))
    }

    @Test
    fun test2() {
        val candies = 3
        val k = 3
        val expected = 10L

        assertEquals(expected, DistributeCandiesAmongChildrenII.distributeCandies(candies, k))
    }
}