package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CompareVersionNumbersTest {
    @Test
    fun test1() {
        val version1 = "1.01"
        val version2 = "1.001"
        val expected = 0

        assertEquals(expected, CompareVersionNumbers.compareVersion(version1, version2))
    }

    @Test
    fun test2() {
        val version1 = "1.0"
        val version2 = "1.0.0"
        val expected = 0

        assertEquals(expected, CompareVersionNumbers.compareVersion(version1, version2))
    }

    @Test
    fun test3() {
        val version1 = "0.1"
        val version2 = "1.1"
        val expected = -1

        assertEquals(expected, CompareVersionNumbers.compareVersion(version1, version2))
    }

    @Test
    fun test4() {
        val version1 = "1.0.1"
        val version2 = "1"
        val expected = 1

        assertEquals(expected, CompareVersionNumbers.compareVersion(version1, version2))
    }

    @Test
    fun test5() {
        val version1 = "1.1"
        val version2 = "1.10"
        val expected = -1

        assertEquals(expected, CompareVersionNumbers.compareVersion(version1, version2))
    }
}