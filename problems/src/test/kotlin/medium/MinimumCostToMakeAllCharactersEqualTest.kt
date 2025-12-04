package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumCostToMakeAllCharactersEqualTest {
    @Test
    fun test1() {
        val s = "0011"
        val expected = 2L

        assertEquals(expected, MinimumCostToMakeAllCharactersEqual.minimumCost(s))
    }

    @Test
    fun test2() {
        val s = "010101"
        val expected = 9L

        assertEquals(expected, MinimumCostToMakeAllCharactersEqual.minimumCost(s))
    }
}