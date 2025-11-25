package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RotatingTheBoxTest {
    @Test
    fun test1() {
        val box = arrayOf(
            charArrayOf('#', '.', '#'),
        )
        val expected = arrayOf(
            charArrayOf('.'),
            charArrayOf('#'),
            charArrayOf('#'),
        )

        assertArrayEquals(expected, RotatingTheBox.rotateTheBox(box))
    }

    @Test
    fun test2() {
        val box = arrayOf(
            charArrayOf('#', '.', '*', '.'),
            charArrayOf('#', '#', '*', '.'),
        )
        val expected = arrayOf(
            charArrayOf('#', '.'),
            charArrayOf('#', '#'),
            charArrayOf('*', '*'),
            charArrayOf('.', '.'),
        )

        assertArrayEquals(expected, RotatingTheBox.rotateTheBox(box))
    }

    @Test
    fun test3() {
        val box = arrayOf(
            charArrayOf('#', '#', '*', '.', '*', '.'),
            charArrayOf('#', '#', '#', '*', '.', '.'),
            charArrayOf('#', '#', '#', '.', '#', '.'),
        )
        val expected = arrayOf(
            charArrayOf('.', '#', '#'),
            charArrayOf('.', '#', '#'),
            charArrayOf('#', '#', '*'),
            charArrayOf('#', '*', '.'),
            charArrayOf('#', '.', '*'),
            charArrayOf('#', '.', '.'),
        )

        assertArrayEquals(expected, RotatingTheBox.rotateTheBox(box))
    }
}