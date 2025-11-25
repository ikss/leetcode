package medium

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PermutationInStringTest {

    @Test
    fun test1() {
        assertTrue(PermutationInString.checkInclusion("ab", "eidbaooo"))
    }

    @Test
    fun test2() {
        assertFalse(PermutationInString.checkInclusion("ab", "eidboaoo"))
    }
}
