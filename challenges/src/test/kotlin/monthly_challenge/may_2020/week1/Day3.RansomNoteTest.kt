package monthly_challenge.may_2020.week1

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RansomNoteTest {

    @Test
    fun test1() {
        assertFalse(RansomNote.canConstruct("a", "b"))
    }

    @Test
    fun test2() {
        assertFalse(RansomNote.canConstruct("aa", "ab"))
    }

    @Test
    fun test3() {
        assertTrue(RansomNote.canConstruct("aa", "aab"))
    }

    @Test
    fun test4() {
        assertTrue(RansomNote.canConstruct("", "aab"))
    }
}
