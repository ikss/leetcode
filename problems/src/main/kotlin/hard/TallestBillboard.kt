package hard

/**
 * You are installing a billboard and want it to have the largest height.
 * The billboard will have two steel supports, one on each side. Each steel support must be an equal height.
 *
 * You are given a collection of rods that can be welded together. For example, if you have rods of lengths 1, 2, and 3,
 * you can weld them together to make a support of length 6.
 *
 * Return the largest possible height of your billboard installation. If you cannot support the billboard, return 0.
 *
 * [URL](https://leetcode.com/problems/tallest-billboard/)
 */
object TallestBillboard {
    fun tallestBillboard(rods: IntArray): Int {
        var dp = HashMap<Int, Int>()
        dp[0] = 0

        for (r in rods) {
            val newDp = HashMap<Int, Int>(dp)

            for ((diff, taller) in dp) {
                val shorter = taller - diff

                val newTaller = newDp.getOrDefault(diff + r, 0)
                newDp[diff + r] = maxOf(newTaller, taller + r)

                val newDiff = Math.abs(shorter + r - taller)
                val newTaller2 = maxOf(shorter + r, taller)

                newDp[newDiff] = maxOf(newTaller2, newDp.getOrDefault(newDiff, 0))
            }
            dp = newDp
        }

        return dp[0]!!
    }
}
