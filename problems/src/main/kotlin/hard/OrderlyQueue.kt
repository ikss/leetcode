package hard

/**
 * You are given a string s and an integer k. You can choose one of the first k letters of s and append it
 * at the end of the string...
 *
 * Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.
 *
 * [URL](https://leetcode.com/problems/orderly-queue/)
 */
object OrderlyQueue {
    fun orderlyQueue(s: String, k: Int): String {
        return if (k == 1) {
            var ans: String = s
            for (i in s.indices) {
                val temp = s.substring(i) + s.substring(0, i)
                if (temp < ans) {
                    ans = temp
                }
            }
            ans
        } else {
            val chars = s.toCharArray()
            chars.sort()
            String(chars)
        }
    }
}
