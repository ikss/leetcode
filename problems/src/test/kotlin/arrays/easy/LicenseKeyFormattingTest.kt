package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LicenseKeyFormattingTest {
    @Test
    fun test1() {
        val s = "5F3Z-2e-9-w"
        val k = 4
        val expected = "5F3Z-2E9W"

        assertEquals(expected, LicenseKeyFormatting.licenseKeyFormatting(s, k))
    }

    @Test
    fun test2() {
        val s = "2-5g-3-J"
        val k = 2
        val expected = "2-5G-3J"

        assertEquals(expected, LicenseKeyFormatting.licenseKeyFormatting(s, k))
    }
}