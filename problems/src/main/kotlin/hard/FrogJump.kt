package hard

/**
 * A frog is crossing a river. The river is divided into some number of units, and at each unit, there may or may not exist a stone. The frog can jump on a stone, but it must not jump into the water.
 *
 * Given a list of stones' positions (in units) in sorted ascending order, determine if the frog can cross the river by landing on the last stone. Initially, the frog is on the first stone and assumes the first jump must be 1 unit.
 *
 * If the frog's last jump was k units, its next jump must be either k - 1, k, or k + 1 units. The frog can only jump in the forward direction.
 *
 * [URL](https://leetcode.com/problems/closest-subsequence-sum/)
 */
object FrogJump {

    fun canCross(stones: IntArray): Boolean {
        val mark = HashMap<Int, Int>()
        val dp = Array(2001) { BooleanArray(2001) }
        val n = stones.size
        // Mark stones in the map to identify if such stone exists or not.
        for (i in 0 until n) {
            mark[stones[i]] = i
        }
        dp[0][0] = true
        for (index in 0 until n) {
            for (prevJump in 0..n) {
                // If stone exists, mark the value with position and jump as 1.
                if (dp[index][prevJump]) {
                    if (mark.containsKey(stones[index] + prevJump)) {
                        dp[mark[stones[index] + prevJump]!!][prevJump] = true
                    }
                    if (mark.containsKey(stones[index] + prevJump + 1)) {
                        dp[mark[stones[index] + prevJump + 1]!!][prevJump + 1] = true
                    }
                    if (mark.containsKey(stones[index] + prevJump - 1)) {
                        dp[mark[stones[index] + prevJump - 1]!!][prevJump - 1] = true
                    }
                }
            }
        }

        // If any value with index as n - 1 is true, return true.
        for (index in 0..n) {
            if (dp[n - 1][index]) {
                return true
            }
        }
        return false
    }
}
