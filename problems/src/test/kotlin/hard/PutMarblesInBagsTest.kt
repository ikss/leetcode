package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PutMarblesInBagsTest {
    @Test
    fun test1() {
        val weights = intArrayOf(1, 3, 5, 1)
        val k = 2
        val expected = 4L

        assertEquals(expected, PutMarblesInBags.putMarbles(weights, k))
    }

    @Test
    fun test2() {
        val weights = intArrayOf(1, 3)
        val k = 2
        val expected = 0L

        assertEquals(expected, PutMarblesInBags.putMarbles(weights, k))
    }
}