package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CrawlerLogFolderTest {

    @Test
    fun test1() {
        val logs = arrayOf("d1/", "d2/", "../", "d21/", "./")
        val expected = 2

        assertEquals(expected, CrawlerLogFolder.minOperations(logs))
    }

    @Test
    fun test2() {
        val logs = arrayOf("d1/", "d2/", "./", "d3/", "../", "d31/")
        val expected = 3

        assertEquals(expected, CrawlerLogFolder.minOperations(logs))
    }

    @Test
    fun test3() {
        val logs = arrayOf("d1/", "../", "../", "../")
        val expected = 0

        assertEquals(expected, CrawlerLogFolder.minOperations(logs))
    }
}