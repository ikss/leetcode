package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstUniqueCharacterTest {

    @Test
    fun test1() {
        val s = "leetcode"
        val expected = 0

        assertEquals(expected, FirstUniqueCharacter.firstUniqChar(s))
    }

    @Test
    fun test2() {
        val s = "loveleetcode"
        val expected = 2

        assertEquals(expected, FirstUniqueCharacter.firstUniqChar(s))
    }

    @Test
    fun test3() {
        val s = "aabb"
        val expected = -1

        assertEquals(expected, FirstUniqueCharacter.firstUniqChar(s))
    }
}
