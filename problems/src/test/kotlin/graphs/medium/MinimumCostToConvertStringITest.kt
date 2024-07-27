package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToConvertStringITest {
    @Test
    fun test1() {
        val source = "abcd"
        val target = "acbe"
        val original = charArrayOf('a', 'b', 'c', 'c', 'e', 'd')
        val changed = charArrayOf('b', 'c', 'b', 'e', 'b', 'e')
        val cost = intArrayOf(2, 5, 5, 1, 2, 20)
        val expected = 28L

        assertEquals(expected, MinimumCostToConvertStringI.minimumCost(source, target, original, changed, cost))
    }

    @Test
    fun test2() {
        val source = "aaaa"
        val target = "bbbb"
        val original = charArrayOf('a', 'c')
        val changed = charArrayOf('c', 'b')
        val cost = intArrayOf(1, 2)
        val expected = 12L

        assertEquals(expected, MinimumCostToConvertStringI.minimumCost(source, target, original, changed, cost))
    }

    @Test
    fun test3() {
        val source = "abcd"
        val target = "abce"
        val original = charArrayOf('a')
        val changed = charArrayOf('e')
        val cost = intArrayOf(10000)
        val expected = -1L

        assertEquals(expected, MinimumCostToConvertStringI.minimumCost(source, target, original, changed, cost))
    }
}