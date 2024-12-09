package arrays.medium

/**
 * You are given an integer array ribbons, where `ribbons[i]` represents the length of the ith ribbon, and an integer k.
 * You may cut any of the ribbons into any number of segments of positive integer lengths, or perform no cuts at all.
 * *For example, if you have a ribbon of length 4, you can:
 * * * Keep the ribbon of length 4,
 * * * Cut it into one ribbon of length 3 and one ribbon of length 1,
 * * * Cut it into two ribbons of length 2,
 * * * Cut it into one ribbon of length 2 and two ribbons of length 1, or
 * * * Cut it into four ribbons of length 1.
 *
 * Your task is to determine the maximum length of ribbon, x, that allows you to cut at least k ribbons,
 * each of length x. You can discard any leftover ribbon from the cuts.
 * If it is impossible to cut k ribbons of the same length, return 0.
 *
 * [URL](https://leetcode.com/problems/cutting-ribbons/)
 */
object CuttingRibbons {
    fun maxLength(ribbons: IntArray, k: Int): Int {
        var min = 0
        var max = ribbons.max()

        while (min < max) {
            val mid = min + (max - min + 1) / 2

            if (canCut(mid, ribbons, k)) {
                min = mid
            } else {
                max = mid - 1
            }
        }

        return min
    }

    private fun canCut(target: Int, ribbons: IntArray, k: Int): Boolean {
        var count = 0
        for (r in ribbons) {
            count += r / target
            if (count >= k) return true
        }
        return false
    }
}
