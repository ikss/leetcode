package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GroupAnagramsTest {

    @Test
    fun test1() {
        val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        val expected = listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat"), listOf("bat"))

        assertEquals(expected, GroupAnagrams.groupAnagrams(strs))
    }

    @Test
    fun test2() {
        val strs = arrayOf("")
        val expected = listOf(listOf(""))

        assertEquals(expected, GroupAnagrams.groupAnagrams(strs))
    }

    @Test
    fun test3() {
        val strs = arrayOf("a")
        val expected = listOf(listOf("a"))

        assertEquals(expected, GroupAnagrams.groupAnagrams(strs))
    }
}
