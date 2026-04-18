package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MirrorDistanceOfAnIntegerTest {
    @Test
    fun test1() {
        val n = 25
        val expected = 27

        assertEquals(expected, MirrorDistanceOfAnInteger.mirrorDistance(n))
    }

    @Test
    fun test2() {
        val n = 10
        val expected = 9

        assertEquals(expected, MirrorDistanceOfAnInteger.mirrorDistance(n))
    }

    @Test
    fun test3() {
        val n = 7
        val expected = 0

        assertEquals(expected, MirrorDistanceOfAnInteger.mirrorDistance(n))
    }

    @Test
    fun test4() {
        val n = 203
        val expected = 99

        assertEquals(expected, MirrorDistanceOfAnInteger.mirrorDistance(n))
    }

}