package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignFileSystemTest {
    @Test
    fun test1() {
        val fileSystem = DesignFileSystem.FileSystem()
        assertEquals(true, fileSystem.createPath("/a", 1))
        assertEquals(1, fileSystem.get("/a"))
    }

    @Test
    fun test2() {
        val fileSystem = DesignFileSystem.FileSystem()
        assertEquals(true, fileSystem.createPath("/leet", 1))
        assertEquals(true, fileSystem.createPath("/leet/code", 2))
        assertEquals(2, fileSystem.get("/leet/code"))
        assertEquals(false, fileSystem.createPath("/c/d", 1))
        assertEquals(-1, fileSystem.get("/c"))
    }
}