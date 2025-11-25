package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AlienDictionaryTest {
    @Test
    fun test1() {
        val words = arrayOf("wrt", "wrf", "er", "ett", "rftt")
        val expected = "wertf"

        assertEquals(expected, AlienDictionary.alienOrder(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("z", "x")
        val expected = "zx"

        assertEquals(expected, AlienDictionary.alienOrder(words))
    }

    @Test
    fun test3() {
        val words = arrayOf("z", "x", "z")
        val expected = ""

        assertEquals(expected, AlienDictionary.alienOrder(words))
    }
}