package hard

/**
 * Given an array of integers arr and an integer d. In one step you can jump from index i to index:
 * * i + x where: i + x < arr.length and  0 < x <= d.
 * * i - x where: i - x >= 0 and  0 < x <= d.
 *
 * In addition, you can only jump from index i to index j if `arr[i] > arr[j]` and `arr[i] > arr[k]` for all indices k
 * between i and j (More formally min(i, j) < k < max(i, j)).
 *
 * You can choose any index of the array and start jumping. Return the maximum number of indices you can visit.
 *
 * Notice that you can not jump outside of the array at any time.
 *
 * [URL](https://leetcode.com/problems/jump-game-v/)
 */
object JumpGameV {
    fun maxJumps(arr: IntArray, d: Int): Int {
        val dp = IntArray(arr.size) { -1 }
        for (i in arr.indices) {
            dfs(arr, i, d, dp)
        }

        return dp.max()
    }

    private fun dfs(arr: IntArray, ind: Int, d: Int, dp: IntArray) {
        if (dp[ind] != -1) return

        dp[ind] = 1
        for (i in ind - 1 downTo 0) {
            if (ind - i > d || arr[ind] <= arr[i]) break
            dfs(arr, i, d, dp)
            dp[ind] = maxOf(dp[ind], dp[i] + 1)
        }
        for (i in ind + 1 until arr.size) {
            if (i - ind > d || arr[ind] <= arr[i]) break
            dfs(arr, i, d, dp)
            dp[ind] = maxOf(dp[ind], dp[i] + 1)
        }
    }
}
