package monthly_challenge.may_2020.week1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

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
