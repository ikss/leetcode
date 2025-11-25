package easy

/**
 * Two strings are considered close if you can attain one from the other using the following operations:
 * * Operation 1: Swap any two existing characters.
 * * * For example, abcde -> aecdb
 * * Operation 2: Transform every occurrence of one existing character into another existing character,
 * and do the same with the other character.
 * * * For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
 *
 * You can use the operations on either string as many times as necessary.
 *
 * Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/determine-if-two-strings-are-close/)
 */
object DetermineIfTwoStringsAreClose {
    fun closeStrings(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) {
            return false
        }
        val arr1 = getHash(word1)
        val arr2 = getHash(word2)

        for (i in arr1.indices) {
            if ((arr1[i] == 0 || arr2[i] == 0) && (arr1[i] != arr2[i])) return false
        }
        arr1.sort()
        arr2.sort()
        for (i in arr1.indices) {
            if (arr1[i] != arr2[i]) return false
        }
        return true
    }

    private fun getHash(s: String): IntArray {
        val arr = IntArray(26)

        for (c in s) {
            arr[c - 'a']++
        }

        return arr
    }
}