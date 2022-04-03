package strings.easy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstUniqueCharacterTest {

    @Test
    fun test1() {
        val s = "leetcode"
        val excepted = 0
        assertEquals(excepted, FirstUniqueCharacter.firstUniqChar(s))
    }

    @Test
    fun test2() {
        val s = "loveleetcode"
        val excepted = 2
        assertEquals(excepted, FirstUniqueCharacter.firstUniqChar(s))
    }

    @Test
    fun test3() {
        val s = "aabb"
        val excepted = -1
        assertEquals(excepted, FirstUniqueCharacter.firstUniqChar(s))
    }
}
