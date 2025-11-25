package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDeletions3PassToMakeStringBalancedTest {
    @Test
    fun test1ThreePass() {
        val s = "aababbab"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeStringBalanced.minimumDeletionsThreePass(s))
    }

    @Test
    fun test2ThreePass() {
        val s = "bbaaaaabb"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeStringBalanced.minimumDeletionsThreePass(s))
    }

    @Test
    fun test1Dp1() {
        val s = "aababbab"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeStringBalanced.minimumDeletionsDp1D(s))
    }

    @Test
    fun test2Dp1D() {
        val s = "bbaaaaabb"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeStringBalanced.minimumDeletionsDp1D(s))
    }

    @Test
    fun test1Dp() {
        val s = "aababbab"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeStringBalanced.minimumDeletionsDp(s))
    }

    @Test
    fun test2Dp() {
        val s = "bbaaaaabb"
        val expected = 2

        assertEquals(expected, MinimumDeletionsToMakeStringBalanced.minimumDeletionsDp(s))
    }
}