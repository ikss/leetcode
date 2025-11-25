package hard

import kotlin.math.max
import kotlin.math.min

/**
 * You are given a string s and an integer k. Your task is to find the maximum difference between the frequency
 * of two characters, `freq[a] - freq[b]`, in a substring subs of s, such that:
 *
 * subs has a size of at least k.
 * Character a has an odd frequency in subs.
 * Character b has an even frequency in subs.
 * Return the maximum difference.
 *
 * Note that subs can contain more than 2 distinct characters.
 *
 * [URL](https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-ii/)
 */
object MaximumDifferenceBetweenEvenAndOddFrequencyII {

    fun maxDifference(s: String, k: Int): Int {
        val n = s.length
        var ans = Int.MIN_VALUE
        var a = '0'
        while (a <= '4') {
            var b = '0'
            while (b <= '4') {
                if (a == b) {
                    ++b
                    continue
                }
                val best = IntArray(4) { Int.MAX_VALUE }
                var cntA = 0
                var cntB = 0
                var prevA = 0
                var prevB = 0
                var left = -1

                for (right in 0..<n) {
                    cntA += if (s[right] == a) 1 else 0
                    cntB += if (s[right] == b) 1 else 0

                    while (right - left >= k && cntB - prevB >= 2) {
                        val leftStatus = getStatus(prevA, prevB)
                        best[leftStatus] = min(
                            best[leftStatus],
                            prevA - prevB
                        )
                        ++left
                        prevA += if (s.get(left) == a) 1 else 0
                        prevB += if (s.get(left) == b) 1 else 0
                    }

                    val rightStatus = getStatus(cntA, cntB)
                    if (best[rightStatus xor 2] != Int.MAX_VALUE) {
                        ans = max(
                            ans,
                            cntA - cntB - best[rightStatus xor 2]
                        )
                    }
                }
                ++b
            }
            ++a
        }
        return ans
    }

    private fun getStatus(cntA: Int, cntB: Int): Int = ((cntA and 1) shl 1) or (cntB and 1)
}
