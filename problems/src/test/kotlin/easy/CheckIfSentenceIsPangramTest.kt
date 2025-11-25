package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfSentenceIsPangramTest {

    @Test
    fun test1() {
        val key = "thequickbrownfoxjumpsoverthelazydog"
        val expected = true

        assertEquals(expected, CheckIfSentenceIsPangram.checkIfPangram(key))
    }

    @Test
    fun test2() {
        val key = "leetcode"
        val expected = false

        assertEquals(expected, CheckIfSentenceIsPangram.checkIfPangram(key))
    }
}