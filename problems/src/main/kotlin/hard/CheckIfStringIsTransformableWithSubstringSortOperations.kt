package hard

/**
 * Given two strings s and t, transform string s into string t using the following operation any number of times:
 * * Choose a non-empty substring in s and sort it in place so the characters are in ascending order.
 * * * For example, applying the operation on the underlined substring in "14234" results in "12344".
 *
 * Return true if it is possible to transform s into t. Otherwise, return false.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/basic-calculator/)
 */
object CheckIfStringIsTransformableWithSubstringSortOperations {
    fun isTransformable(s: String, t: String): Boolean {
        val idx = Array(10) { ArrayList<Int>() }
        val pos = IntArray(10)
        for (i in s.indices) {
            idx[s[i] - '0'].add(i)
        }
        for (i in t.indices) {
            val d = t[i] - '0'
            if (pos[d] >= idx[d].size) return false

            for (j in 0 until d) {
                if (pos[j] < idx[j].size && idx[j][pos[j]] < idx[d][pos[d]]) return false
            }
            ++pos[d]
        }
        return true
    }
}
