package strings.easy

/**
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 *
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 *
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 *
 * [URL](https://leetcode.com/problems/rotate-string/)
 */
object RotateString {
    fun rotateString(s: String, goal: String): Boolean {
        if (s == goal) return true
        if (s.length != goal.length) return false
        val double = s + s

        return double.contains(goal)
    }
}