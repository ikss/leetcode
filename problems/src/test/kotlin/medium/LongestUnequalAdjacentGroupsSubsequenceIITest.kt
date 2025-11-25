package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestUnequalAdjacentGroupsSubsequenceIITest {
    @Test
    fun test1() {
        val words = arrayOf("bdb", "aaa", "ada")
        val groups = intArrayOf(2, 1, 3)
        val expected = listOf("aaa", "ada")

        assertEquals(expected, LongestUnequalAdjacentGroupsSubsequenceII.getWordsInLongestSubsequence(words, groups))
    }
    @Test
    fun test2() {
        val words = arrayOf("a","b","c","d")
        val groups = intArrayOf(1,2,3,4)
        val expected = listOf("a","b","c","d")

        assertEquals(expected, LongestUnequalAdjacentGroupsSubsequenceII.getWordsInLongestSubsequence(words, groups))
    }
    
    @Test
    fun test3() {
        val words = arrayOf("bcd","bd","dc","bc","ba","ccd","aba","cdd","add","bab","abd","cc","cdb","dbd","ccb","dda")
        val groups = intArrayOf(9,5,3,11,15,2,11,13,13,16,10,13,8,6,2,16)
        val expected = listOf("bcd","ccd","cdd","cdb","ccb")

        assertEquals(expected, LongestUnequalAdjacentGroupsSubsequenceII.getWordsInLongestSubsequence(words, groups))
    }
}