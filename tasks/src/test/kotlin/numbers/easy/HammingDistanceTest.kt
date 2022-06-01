package numbers.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HammingDistanceTest {

    @Test
    fun test1() {
        val x = 4
        val y = 2
        val expected = 2
        assertEquals(expected, HammingDistance.hammingDistance(x, y))
    }

    @Test
    fun test2() {
        val x = 3
        val y = 1
        val expected = 1
        assertEquals(expected, HammingDistance.hammingDistance(x, y))
    }

    @Test
    fun test3() {
        val x = 35
        val y = 35
        val expected = 0
        assertEquals(expected, HammingDistance.hammingDistance(x, y))
    }
}
