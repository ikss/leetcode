package strings.hard

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class StampingTheSequenceTest {

    @Test
    fun test1() {
        val stamp = "abc"
        val target = "ababc"
        val expected = intArrayOf(1, 0, 2)

        assertTrue(expected.contentEquals(StampingTheSequence.movesToStamp(stamp, target)))
    }

    @Test
    fun test2() {
        val stamp = "abca"
        val target = "aabcaca"
        val expected = intArrayOf(2, 3, 0, 1)

        assertTrue(expected.contentEquals(StampingTheSequence.movesToStamp(stamp, target)))
    }
}
