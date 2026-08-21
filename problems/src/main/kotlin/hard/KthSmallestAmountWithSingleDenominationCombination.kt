package hard

/**
 * You are given three integers n, m and k. Consider the following algorithm to find the maximum element
 * of an array of positive integers:
 *
 *
 * You should build the array arr which has the following properties:
 * * arr has exactly n integers.
 * * `1 <= arr[i] <= m where (0 <= i < n)`.
 * * After applying the mentioned algorithm to arr, the value search_cost is equal to k.
 *
 * Return the number of ways to build the array arr under the mentioned conditions.
 * As the answer may grow large, the answer must be computed modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/)
 */
object KthSmallestAmountWithSingleDenominationCombination {

    fun findKthSmallest(coins: IntArray, k: Int): Long {
        coins.sort()
        val n = coins.size
        val m = 1 shl n

        var l = k.toLong()
        var r = coins[0].toLong() * k + 1

        val bitCount = IntArray(m)
        val lcm = LongArray(m)

        for (mask in 1..<m) {
            var curLcm = 1L
            for (i in 0..<n) {
                if (((mask shr i) and 1) == 1) {
                    val g = gcd(curLcm, coins[i].toLong())
                    val tmp = curLcm / g

                    if (tmp <= r / coins[i]) {
                        curLcm = tmp * coins[i]
                    } else {
                        curLcm = r + 1
                        break
                    }
                    bitCount[mask]++
                }
            }
            lcm[mask] = curLcm
        }

        while (l < r) {
            val x = l + (r - l) / 2
            if (count(x, m, lcm, bitCount) >= k) {
                r = x
            } else {
                l = x + 1
            }
        }
        return l
    }

    private fun count(x: Long, m: Int, lcm: LongArray, bitCount: IntArray): Long {
        var res: Long = 0
        for (mask in 1..<m) {
            if (lcm[mask] > x) continue

            if ((bitCount[mask] and 1) == 1) {
                res += x / lcm[mask]
            } else {
                res -= x / lcm[mask]
            }
        }
        return res
    }

    private fun gcd(a: Long, b: Long): Long {
        var a = a
        var b = b
        while (b != 0L) {
            val t = b
            b = a % b
            a = t
        }
        return a
    }
}
