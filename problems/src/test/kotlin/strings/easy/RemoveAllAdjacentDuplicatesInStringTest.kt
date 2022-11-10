package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemoveAllAdjacentDuplicatesInStringTest {

    @Test
    fun test1() {
        val s = "leEeetcode"
        val expected = "leEtcode"

        assertEquals(expected, RemoveAllAdjacentDuplicatesInString.removeDuplicates(s))
    }

    @Test
    fun test2() {
        val s = "abbaca"
        val expected = "ca"

        assertEquals(expected, RemoveAllAdjacentDuplicatesInString.removeDuplicates(s))
    }

    @Test
    fun test3() {
        val s = ""
        val expected = ""

        assertEquals(expected, RemoveAllAdjacentDuplicatesInString.removeDuplicates(s))
    }

    @Test
    fun test4() {
        val s = "azxxzy"
        val expected = "ay"

        assertEquals(expected, RemoveAllAdjacentDuplicatesInString.removeDuplicates(s))
    }
}