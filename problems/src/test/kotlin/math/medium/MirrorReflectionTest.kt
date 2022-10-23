package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MirrorReflectionTest {

    @Test
    fun test1() {
        val p = 2
        val q = 1
        val expected = 2

        assertEquals(expected, MirrorReflection.mirrorReflection(p, q))
    }

    @Test
    fun test2() {
        val p = 3
        val q = 1
        val expected = 1

        assertEquals(expected, MirrorReflection.mirrorReflection(p, q))
    }

    @Test
    fun test3() {
        val p = 10
        val q = 0
        val expected = 0

        assertEquals(expected, MirrorReflection.mirrorReflection(p, q))
    }
}
