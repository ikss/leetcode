package design.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignSearchAutocompleteSystemTest {
    @Test
    fun test1() {
        val obj = DesignSearchAutocompleteSystem.AutocompleteSystem(
            arrayOf("i love you", "island", "ironman", "i love leetcode"),
            intArrayOf(5, 3, 2, 2),
        )
        assertEquals(listOf("i love you", "island", "i love leetcode"), obj.input('i'))
        assertEquals(listOf("i love you", "i love leetcode"), obj.input(' '))
        assertEquals(emptyList<String>(), obj.input('a'))
        assertEquals(emptyList<String>(), obj.input('#'))
    }

    @Test
    fun test2() {
        val obj = DesignSearchAutocompleteSystem.AutocompleteSystem(
            arrayOf("i love you", "island", "ironman", "i love leetcode"),
            intArrayOf(5, 3, 2, 2),
        )
        assertEquals(listOf("i love you", "island", "i love leetcode"), obj.input('i'))
        assertEquals(listOf("i love you", "i love leetcode"), obj.input(' '))
        assertEquals(emptyList<String>(), obj.input('a'))
        assertEquals(emptyList<String>(), obj.input('#'))
        assertEquals(listOf("i love you", "island", "i love leetcode"), obj.input('i'))
        assertEquals(listOf("i love you", "i love leetcode", "i a"), obj.input(' '))
        assertEquals(listOf("i a"), obj.input('a'))
        assertEquals(emptyList<String>(), obj.input('#'))
        assertEquals(listOf("i love you", "island", "i a"), obj.input('i'))
        assertEquals(listOf("i love you", "i a", "i love leetcode"), obj.input(' '))
        assertEquals(listOf("i a"), obj.input('a'))
        assertEquals(emptyList<String>(), obj.input('#'))
    }
}