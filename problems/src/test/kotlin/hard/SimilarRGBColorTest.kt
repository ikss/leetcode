package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SimilarRGBColorTest {
    @Test
    fun test1() {
        val color = "#09f166"
        val expected = "#11ee66"

        assertEquals(expected, SimilarRGBColor.similarRGB(color))
    }

    @Test
    fun test2() {
        val color = "#4e3fe1"
        val expected = "#5544dd"

        assertEquals(expected, SimilarRGBColor.similarRGB(color))
    }

    @Test
    fun test3() {
        val color = "#1c9e03"
        val expected = "#229900"

        assertEquals(expected, SimilarRGBColor.similarRGB(color))
    }
}