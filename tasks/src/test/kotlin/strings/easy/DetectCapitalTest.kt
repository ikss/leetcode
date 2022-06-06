package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DetectCapitalTest {

    @Test
    fun test1() {
        val s = "USA"
        val expected = true
        assertEquals(expected, DetectCapital.detectCapitalUse(s))
    }

    @Test
    fun test2() {
        val s = "FLaG"
        val expected = false
        assertEquals(expected, DetectCapital.detectCapitalUse(s))
    }

    @Test
    fun test3() {
        val s = "flag"
        val expected = true
        assertEquals(expected, DetectCapital.detectCapitalUse(s))
    }

    @Test
    fun test4() {
        val s = "USa"
        val expected = false
        assertEquals(expected, DetectCapital.detectCapitalUse(s))
    }
}
