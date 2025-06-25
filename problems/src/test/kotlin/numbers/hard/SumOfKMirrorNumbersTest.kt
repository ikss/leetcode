package numbers.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfKMirrorNumbersTest {

    @Test
    fun test1() {
        val k = 2
        val n = 5
        val expected = 25L

        assertEquals(expected, SumOfKMirrorNumbers.kMirror(k, n))
    }

    @Test
    fun test2() {
        val k = 3
        val n = 7
        val expected = 499L

        assertEquals(expected, SumOfKMirrorNumbers.kMirror(k, n))
    }

    @Test
    fun test3() {
        val k = 7
        val n = 17
        val expected = 20379000L

        assertEquals(expected, SumOfKMirrorNumbers.kMirror(k, n))
    }

    @Test
    fun test1HardCoded() {
        val k = 2
        val n = 5
        val expected = 25L

        assertEquals(expected, SumOfKMirrorNumbers.kMirrorHardCoded(k, n))
    }

    @Test
    fun test2HardCoded() {
        val k = 3
        val n = 7
        val expected = 499L

        assertEquals(expected, SumOfKMirrorNumbers.kMirrorHardCoded(k, n))
    }

    @Test
    fun test3HardCoded() {
        val k = 7
        val n = 17
        val expected = 20379000L

        assertEquals(expected, SumOfKMirrorNumbers.kMirrorHardCoded(k, n))
    }
}
