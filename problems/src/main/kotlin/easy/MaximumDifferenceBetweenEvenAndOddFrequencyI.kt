package easy

/**
 * You are given a string s consisting of lowercase English letters.
 *
 * Your task is to find the maximum difference diff = freq(a1) - freq(a2) between the frequency of characters a1 and a2 in the string such that:
 * * a1 has an odd frequency in the string.
 * * a2 has an even frequency in the string.
 *
 * Return this maximum difference.
 *
 * [URL](https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/)
 */
object MaximumDifferenceBetweenEvenAndOddFrequencyI {
    fun maxDifference(s: String): Int {
        val freqs = IntArray(26)
        for (c in s) {
            freqs[c - 'a']++
        }

        var maxOdd = 0
        var minEven = s.length
        for (fr in freqs) {
            if (fr == 0) continue
            if (fr % 2 == 0) {
                minEven = minOf(minEven, fr)
            } else {
                maxOdd = maxOf(maxOdd, fr)
            }
        }

        return maxOdd - minEven
    }
}
