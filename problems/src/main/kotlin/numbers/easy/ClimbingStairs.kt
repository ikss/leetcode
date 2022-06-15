package numbers.easy

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * [URL](https://leetcode.com/problems/climbing-stairs/)
 */
object ClimbingStairs {
    fun climbStairs(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1
        if (n == 2) return 2

        var prevprev = 1
        var prev = 2
        var result = 0
        for (i in 3..n) {
            result = prev + prevprev
            prevprev = prev
            prev = result
        }
        return result
    }
}
