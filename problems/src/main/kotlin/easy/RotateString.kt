package easy

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

    fun rotateStringOptimized(s: String, goal: String): Boolean {
        val n = s.length
        if (n != goal.length) return false

        var i1 = 0
        var i2 = 0

        while (i1 < n * 2) {
            if (s[i1 % n] == goal[i2]) {
                i2++
                if (i2 == n) return true
            } else {
                i1 -= i2
                i2 = 0
            }
            i1++
        }
        return false
    }

}