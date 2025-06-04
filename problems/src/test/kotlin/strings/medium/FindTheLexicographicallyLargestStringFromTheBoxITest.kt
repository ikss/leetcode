package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheLexicographicallyLargestStringFromTheBoxITest {
    @Test
    fun test1() {
        val word = "dbca"
        val numFriends = 2
        val expected = "dbc"

        assertEquals(expected, FindTheLexicographicallyLargestStringFromTheBoxI.answerString(word, numFriends))
    }

    @Test
    fun test2() {
        val word = "gggg"
        val numFriends = 4
        val expected = "g"

        assertEquals(expected, FindTheLexicographicallyLargestStringFromTheBoxI.answerString(word, numFriends))
    }

    @Test
    fun test3() {
        val word = "gh"
        val numFriends = 1
        val expected = "gh"

        assertEquals(expected, FindTheLexicographicallyLargestStringFromTheBoxI.answerString(word, numFriends))
    }
}