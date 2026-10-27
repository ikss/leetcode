package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CreateGridWithExactlyOnePathTest {
    @Test
    fun test1() {
        val m = 2
        val n = 3
        val expected = arrayOf(".##", "...")

        assertArrayEquals(expected, CreateGridWithExactlyOnePath.createGrid(m, n))
    }

    @Test
    fun test2() {
        val m = 3
        val n = 3
        val expected = arrayOf(".##", ".##", "...")

        assertArrayEquals(expected, CreateGridWithExactlyOnePath.createGrid(m, n))
    }

    @Test
    fun test3() {
        val m = 1
        val n = 4
        val expected = arrayOf("....")

        assertArrayEquals(expected, CreateGridWithExactlyOnePath.createGrid(m, n))
    }
}