package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToConvertStringIITest {
    @Test
    fun test1() {
        val source = "abcd"
        val target = "acbe"
        val original = arrayOf("a", "b", "c", "c", "e", "d")
        val changed = arrayOf("b", "c", "b", "e", "b", "e")
        val cost = intArrayOf(2, 5, 5, 1, 2, 20)
        val expected = 28L

        assertEquals(expected, MinimumCostToConvertStringII.minimumCost(source, target, original, changed, cost))
    }

    @Test
    fun test2() {
        val source = "abcdefgh"
        val target = "acdeeghh"
        val original = arrayOf("bcd", "fgh", "thh")
        val changed = arrayOf("cde", "thh", "ghh")
        val cost = intArrayOf(1, 3, 5)
        val expected = 9L

        assertEquals(expected, MinimumCostToConvertStringII.minimumCost(source, target, original, changed, cost))
    }
}