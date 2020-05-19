package week3

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PermutationsTest {

    @Test
    fun test1() {
        assertTrue(Permutation.checkInclusion("ab", "eidbaooo"))
    }

    @Test
    fun test2() {
        assertFalse(Permutation.checkInclusion("ab", "eidboaoo"))
    }
}
