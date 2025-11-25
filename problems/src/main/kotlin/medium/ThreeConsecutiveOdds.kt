package medium

/**
 * Given an integer array arr, return true if there are three consecutive odd numbers in the array.
 * Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/three-consecutive-odds/)
 */
object ThreeConsecutiveOdds {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var consec = 0
        for (n in arr) {
            if (n % 2 != 0) {
                if (++consec == 3) return true
            } else {
                consec = 0
            }
        }
        return false
    }
}
