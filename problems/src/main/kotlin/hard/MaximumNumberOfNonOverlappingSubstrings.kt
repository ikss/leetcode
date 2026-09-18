package hard

/**
 * Given a string s of lowercase letters, you need to find the maximum number of non-empty
 * substrings of s that meet the following conditions:
 * 1. The substrings do not overlap, that is for any two substrings `s[i..j] and s[x..y]`, either j < x or i > y is true.
 * 2. A substring that contains a certain character c must also contain all occurrences of c.
 * 
 * Find the maximum number of substrings that meet the above conditions.
 * If there are multiple solutions with the same number of substrings, return the one with minimum total length.
 * It can be shown that there exists a unique solution of minimum total length.
 *
 * Notice that you can return the substrings in any order.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-non-overlapping-substrings/)
 */
object MaximumNumberOfNonOverlappingSubstrings {

    fun maxNumOfSubstrings(s: String): MutableList<String> {
        val states = Array(26) {
            State(-1, -1)
        }
        // Preprocess the left and right endpoints.
        for ((i, element) in s.withIndex()) {
            val charIdx = element - 'a'
            val state = states[charIdx]
            if (state.left == -1) {
                state.left = i
            }
            state.right = i
        }
        for (state in states) {

            if (state.left != -1) {
                var j = state.left
                while (j <= state.right) {
                    val charIdx = s[j] - 'a'
                    val otherState = states[charIdx]
                    if (state.left <= otherState.left && otherState.right <= state.right) {
                        ++j
                        continue
                    }
                    state.left = minOf(state.left, otherState.left)
                    state.right = maxOf(state.right, otherState.right)
                    j = state.left
                    ++j
                }
            }
        }

        // Greedily select intervals.
        states.sort()
        val result = ArrayList<String>()
        var end = -1
        for ((left, right) in states) {
            if (left == -1) {
                continue
            }
            if (end == -1 || left > end) {
                end = right
                result.add(s.substring(left, right + 1))
            }
        }
        return result
    }

    data class State(var left: Int, var right: Int) : Comparable<State> {
        override fun compareTo(other: State): Int {
            if (right == other.right) {
                return other.left - left
            }
            return right - other.right
        }
    }
}
