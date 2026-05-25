package medium

/**
 * You are given a 0-indexed binary string s and two integers minJump and maxJump.
 * In the beginning, you are standing at index 0, which is equal to '0'.
 * You can move from index i to index j if the following conditions are fulfilled:
 * * i + minJump <= j <= min(i + maxJump, s.length - 1), and
 * * `s[j] == '0'`.
 *
 * Return true if you can reach index s.length - 1 in s, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/jump-game-vii/)
 */
object JumpGameVII {
    fun canReach(s: String, minJump: Int, maxJump: Int): Boolean {
        val n = s.length
        val f = IntArray(n)
        val prefixSum = IntArray(n)
        f[0] = 1

        // since we start dynamic programming from i=minJump, we need to precompute the prefix sums for the part [0, minJump)
        for (i in 0..<minJump) {
            prefixSum[i] = 1
        }
        for (i in minJump..<n) {
            val left = i - maxJump
            val right = i - minJump
            if (s[i] == '0') {
                val total = prefixSum[right] - (if (left <= 0) 0 else prefixSum[left - 1])
                f[i] = if (total != 0) 1 else 0
            }
            prefixSum[i] = prefixSum[i - 1] + f[i]
        }
        return f[n - 1] == 1
    }
}
