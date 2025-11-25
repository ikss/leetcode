package easy

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 *
 * [URL](https://leetcode.com/problems/can-place-flowers/)
 */
object CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0

        for (i in flowerbed.indices) {
            if (flowerbed[i] == 1) continue
            val prev = i == 0 || flowerbed[i - 1] == 0
            val next = i == flowerbed.size - 1 || flowerbed[i + 1] == 0

            if (prev && next) {
                flowerbed[i] = 1
                count++
            }
            if (count >= n) return true
        }

        return count >= n
    }
}
