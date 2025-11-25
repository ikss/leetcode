package easy

/**
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 * [URL](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)
 */
object CheckIfTwoStringArraysAreEquivalent {
    fun arrayStringsAreEqualIndices(word1: Array<String>, word2: Array<String>): Boolean {
        var k = 0
        var l = 0
        var sum1 = 0
        var sum2 = 0
        for (i in word1.indices) {
            sum1 += word1[i].length
            for (j in word1[i].indices) {
                if (l == word2[k].length) {
                    k++
                    l = 0
                }
                if (k == word2.size) return false
                if (l == 0) sum2 += word2[k].length
                if (word1[i][j] != word2[k][l]) return false
                l++
            }
        }
        if (k != word2.size - 1 || l != word2[k].length) return false
        return sum1 == sum2
    }

    fun arrayStringsAreEqualJoin(word1: Array<String>, word2: Array<String>): Boolean {
        return word1.joinToString("") == word2.joinToString("")
    }
}