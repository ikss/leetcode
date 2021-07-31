package strings.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class DetectCapitalTest {

    @Test
    fun test1() {
        val s = "USA"
        val excepted = true
        assertEquals(excepted, DetectCapital.detectCapitalUse(s))
    }

    @Test
    fun test2() {
        val s = "FLaG"
        val excepted = false
        assertEquals(excepted, DetectCapital.detectCapitalUse(s))
    }

    @Test
    fun test3() {
        val s = "flag"
        val excepted = true
        assertEquals(excepted, DetectCapital.detectCapitalUse(s))
    }

    @Test
    fun test4() {
        val s = "USa"
        val excepted = false
        assertEquals(excepted, DetectCapital.detectCapitalUse(s))
    }
}
