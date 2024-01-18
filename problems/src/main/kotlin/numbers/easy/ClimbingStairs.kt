package numbers.easy

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * [URL](https://leetcode.com/problems/climbing-stairs/)
 */
object ClimbingStairs {
    fun climbStairs(n: Int): Int {
        var prevprev = 0
        var prev = 1

        for (i in 0 until n) {
            val curr = prevprev + prev
            prevprev = prev
            prev = curr
        }

        return prev
    }
}
