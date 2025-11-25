package medium

/**
 * You are given a string s of lowercase English letters and a 2D integer array shifts where
 * `shifts[i] = [starti, endi, directioni]`. For every i, shift the characters in s from the index starti to the index
 * endi (inclusive) forward if directioni = 1, or shift the characters backward if directioni = 0.
 *
 * Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that 'z'
 * becomes 'a'). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet
 * (wrapping around so that 'a' becomes 'z').
 *
 * Return the final string after all such shifts to s are applied.
 *
 * [URL](https://leetcode.com/problems/shifting-letters-ii/)
 */
object ShiftingLettersII {
    fun shiftingLetters(s: String, shifts: Array<IntArray>): String {
        val finalShifts = IntArray(s.length + 1)

        for (shift in shifts) {
            val delta = if (shift[2] == 1) 1 else -1
            finalShifts[shift[0]] += delta
            finalShifts[shift[1] + 1] -= delta
        }

        val result = StringBuilder(s.length)
        var currShifts = 0
        for (i in s.indices) {
            currShifts += finalShifts[i]
            var c = s[i] - 'a'
            val shift = currShifts % 26
            c += shift
            if (c < 0) {
                c += 26
            } else if (c >= 26) {
                c -= 26
            }
            result.append('a' + c)
        }

        return result.toString()
    }
}
