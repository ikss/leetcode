package easy

/**
 * You are given a string s containing lowercase English letters, and a matrix shift,
 * where `shift[i] = [directioni, amounti]`:
 * * directioni can be 0 (for left shift) or 1 (for right shift).
 * * amounti is the amount by which string s is to be shifted.
 * * A left shift by 1 means remove the first character of s and append it to the end.
 * * Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
 *
 * Return the final string after all operations.
 *
 * [URL](https://leetcode.com/problems/perform-string-shifts/)
 */
object PerformStringShifts {
    fun stringShift(s: String, shift: Array<IntArray>): String {
        var start = 0
        for ((dir, amount) in shift) {
            if (dir == 0) {
                start += amount
            } else {
                start -= amount
            }
        }
        start %= s.length
        if (start < 0) start += s.length

        return s.substring(start) + s.substring(0, start)
    }
}
