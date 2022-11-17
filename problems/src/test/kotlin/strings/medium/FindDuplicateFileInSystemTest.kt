package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindDuplicateFileInSystemTest {

    @Test
    fun test1() {
        val paths = arrayOf(
            "root/a 1.txt(abcd) 2.txt(efgh)",
            "root/c 3.txt(abcd)",
            "root/c/d 4.txt(efgh)",
            "root 4.txt(efgh)",
        )
        val expected = listOf(
            listOf("root/a/1.txt", "root/c/3.txt"),
            listOf("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"),
        )

        assertEquals(expected, FindDuplicateFileInSystem.findDuplicate(paths))
    }

    @Test
    fun test2() {
        val paths = arrayOf(
            "root/a 1.txt(abcd) 2.txt(efgh)",
            "root/c 3.txt(abcd)",
            "root/c/d 4.txt(efgh)",
        )
        val expected = listOf(
            listOf("root/a/1.txt", "root/c/3.txt"),
            listOf("root/a/2.txt", "root/c/d/4.txt"),
        )

        assertEquals(expected, FindDuplicateFileInSystem.findDuplicate(paths))
    }
}