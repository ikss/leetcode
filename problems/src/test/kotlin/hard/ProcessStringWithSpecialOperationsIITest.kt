package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProcessStringWithSpecialOperationsIITest {
    @Test
    fun test1() {
        val s = "a#b%*"
        val k = 1L
        val expected = 'a'

        assertEquals(expected, ProcessStringWithSpecialOperationsII.processStr(s, k))
    }

    @Test
    fun test2() {
        val s = "cd%#*#"
        val k = 3L
        val expected = 'd'

        assertEquals(expected, ProcessStringWithSpecialOperationsII.processStr(s, k))
    }

    @Test
    fun test3() {
        val s = "z*#"
        val k = 0L
        val expected = '.'

        assertEquals(expected, ProcessStringWithSpecialOperationsII.processStr(s, k))
    }
}