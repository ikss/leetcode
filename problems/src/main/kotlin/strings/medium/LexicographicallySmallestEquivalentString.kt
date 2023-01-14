package strings.medium

/**
 * You are given two strings of the same length s1 and s2 and a string baseStr.
 *
 * We say `s1[i]` and `s2[i]` are equivalent characters.
 * * For example, if s1 = "abc" and s2 = "cde", then we have 'a' == 'c', 'b' == 'd', and 'c' == 'e'.
 *
 * Equivalent characters follow the usual rules of any equivalence relation:
 * * __Reflexivity:__ 'a' == 'a'.
 * * __Symmetry:__ 'a' == 'b' implies 'b' == 'a'.
 * * __Transitivity:__ 'a' == 'b' and 'b' == 'c' implies 'a' == 'c'.
 * For example, given the equivalency information from s1 = "abc" and s2 = "cde", "acd" and "aab" are equivalent
 * strings of baseStr = "eed", and "aab" is the lexicographically smallest equivalent string of baseStr.
 *
 * Return the lexicographically smallest equivalent string of baseStr by using the equivalency information
 * from s1 and s2.
 *
 * [URL](https://leetcode.com/problems/lexicographically-smallest-equivalent-string/)
 */
object LexicographicallySmallestEquivalentString {
    var representative = IntArray(26)

    fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String {
        representative = IntArray(26)
        // Make each character representative of itself.
        for (i in 0..25) {
            representative[i] = i
        }

        // Perform union merge for all the edges.
        for (i in s1.indices) {
            performUnion(s1[i] - 'a', s2[i] - 'a')
        }
        val ans = StringBuilder()
        // Create the answer string with final mappings.
        for (c in baseStr) {
            ans.append((find(c - 'a') + 'a'.toInt()).toChar())
        }
        return ans.toString()
    }

    // Returns the root representative of the component.
    private fun find(x: Int): Int {
        return if (representative[x] == x) {
            x
        } else {
            find(representative[x]).also { representative[x] = it }
        }
    }

    // Perform union if x and y aren't in the same component.
    private fun performUnion(x: Int, y: Int) {
        var x = x
        var y = y
        x = find(x)
        y = find(y)
        if (x == y) {
            return
        }

        // Make the smaller character representative.
        if (x < y) {
            representative[y] = x
        } else {
            representative[x] = y
        }
    }
}
