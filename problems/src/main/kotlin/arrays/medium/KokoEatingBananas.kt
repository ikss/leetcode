package arrays.medium

/**
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 *
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and
 * eats k bananas from that pile. If the pile has less than k bananas,
 * she eats all of them instead and will not eat any more bananas during this hour.
 *
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 *
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 * [URL](https://leetcode.com/problems/koko-eating-bananas/)
 */
object KokoEatingBananas {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = Math.ceil(piles.sum().toDouble() / h).toInt()
        var right = piles.max()

        while (left < right) {
            val mid = left + (right - left) / 2
            if (hasEnoughTime(mid, piles, h)) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return left
    }

    private fun hasEnoughTime(speed: Int, piles: IntArray, h: Int): Boolean {
        var total = 0
        val speed = speed.toDouble()
        for (p in piles) {
            total += Math.ceil(p / speed).toInt()
            if (total > h) break
        }
        return total <= h
    }
}
