package week1

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class FirstUniqueCharacterInStringTest {

    @Test
    fun test1() {
        assertEquals(0, FirstUniqueCharacterInString.firstUniqChar("leetcode"))
    }

    @Test
    fun test2() {
        assertEquals(2, FirstUniqueCharacterInString.firstUniqChar("loveleetcode"))
    }
}
