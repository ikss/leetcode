package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestAbsoluteFilePathTest {
    @Test
    fun test1() {
        val input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
        val expected = 20

        assertEquals(expected, LongestAbsoluteFilePath.lengthLongestPath(input))
    }
    
    @Test
    fun test2() {
        val input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
        val expected = 32

        assertEquals(expected, LongestAbsoluteFilePath.lengthLongestPath(input))
    }
}