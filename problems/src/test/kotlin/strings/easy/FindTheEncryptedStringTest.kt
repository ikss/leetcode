package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheEncryptedStringTest {
    @Test
    fun test1() {
        val s = "dart"
        val k = 3
        val expected = "tdar"

        assertEquals(expected, FindTheEncryptedString.getEncryptedString(s, k))
    }

    @Test
    fun test2() {
        val s = "aaa"
        val k = 1
        val expected = "aaa"

        assertEquals(expected, FindTheEncryptedString.getEncryptedString(s, k))
    }
}