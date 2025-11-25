package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class StampingTheSequenceTest {

    @Test
    fun test1() {
        val stamp = "abc"
        val target = "ababc"
        val expected = intArrayOf(1, 0, 2)

        assertArrayEquals(expected, StampingTheSequence.movesToStamp(stamp, target))
    }

    @Test
    fun test2() {
        val stamp = "abca"
        val target = "aabcaca"
        val expected = intArrayOf(2, 3, 0, 1)

        assertArrayEquals(expected, StampingTheSequence.movesToStamp(stamp, target))
    }
}
