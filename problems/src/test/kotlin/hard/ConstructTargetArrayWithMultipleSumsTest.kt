package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructTargetArrayWithMultipleSumsTest {
    @Test
    fun test1() {
        val target = intArrayOf(9, 3, 5)
        val expected = true

        assertEquals(expected, ConstructTargetArrayWithMultipleSums.isPossible(target))
    }

    @Test
    fun test2() {
        val target = intArrayOf(1, 1, 1, 2)
        val expected = false

        assertEquals(expected, ConstructTargetArrayWithMultipleSums.isPossible(target))
    }

    @Test
    fun test3() {
        val target = intArrayOf(8, 5)
        val expected = true

        assertEquals(expected, ConstructTargetArrayWithMultipleSums.isPossible(target))
    }
}