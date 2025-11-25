package medium

/**
 * You are given two strings s1 and s2, both of length n, consisting of lowercase English letters.
 *
 * You can apply the following operation on any of the two strings any number of times:
 * * Choose any two indices i and j such that i < j and the difference j - i is even,
 * then swap the two characters at those indices in the string.
 *
 * Return true if you can make the strings s1 and s2 equal, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/)
 */
object CheckIfStringsCanBeMadeEqualWithOperationsII {
    fun checkStrings(s1: String, s2: String): Boolean {
        val hashEven = Array(2) { IntArray(26) }
        val hashOdd = Array(2) { IntArray(26) }

        for (i in s1.indices) {
            if (i % 2 == 0) {
                hashEven[0][s1[i] - 'a']++
                hashEven[1][s2[i] - 'a']++
            } else {
                hashOdd[0][s1[i] - 'a']++
                hashOdd[1][s2[i] - 'a']++
            }
        }
        return areSame(hashEven[0], hashEven[1]) && areSame(hashOdd[0], hashOdd[1])
    }

    private fun areSame(arr1: IntArray, arr2: IntArray): Boolean {
        for (i in arr1.indices) {
            if (arr1[i] != arr2[i]) return false
        }

        return true
    }
}