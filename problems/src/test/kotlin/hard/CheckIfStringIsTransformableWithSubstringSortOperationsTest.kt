package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfStringIsTransformableWithSubstringSortOperationsTest {
    @Test
    fun test1() {
        val s = "84532"
        val t = "34852"
        val expected = true

        assertEquals(expected, CheckIfStringIsTransformableWithSubstringSortOperations.isTransformable(s, t))
    }

    @Test
    fun test2() {
        val s = "34521"
        val t = "23415"
        val expected = true

        assertEquals(expected, CheckIfStringIsTransformableWithSubstringSortOperations.isTransformable(s, t))
    }

    @Test
    fun test3() {
        val s = "12345"
        val t = "12435"
        val expected = false

        assertEquals(expected, CheckIfStringIsTransformableWithSubstringSortOperations.isTransformable(s, t))
    }
}