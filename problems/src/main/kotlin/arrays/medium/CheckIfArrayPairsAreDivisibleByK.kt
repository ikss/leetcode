package arrays.medium

/**
 * Given an array of integers arr of even length n and an integer k.
 *
 * We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
 *
 * Return true If you can find a way to do that or false otherwise.
 *
 * [URL](https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/)
 */
object CheckIfArrayPairsAreDivisibleByK {
    fun canArrange(arr: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()
        var sum = 0L

        for (n in arr) {
            sum += n
            val div = ((n % k) + k) % k
            map.merge(div, 1, Int::plus)
        }

        if (sum % k != 0L) return false

        for ((div, count) in map) {
            if (div == 0) {
                if (count % 2 != 0) return false
                continue
            }
            val inv = map[k - div] ?: return false

            if (count != inv) return false
        }


        return true
    }
}
