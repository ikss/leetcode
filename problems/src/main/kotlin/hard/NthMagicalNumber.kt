package hard

import java.util.*

/**
 * A positive integer is magical if it is divisible by either a or b.
 *
 * Given the three integers n, a, and b, return the nth magical number. Since the answer may be very large,
 * return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/nth-magical-number/)
 */
object NthMagicalNumber {
    private const val MOD = 1_000_000_007

    private data class MagicNum(val origin: Int, val mult: Int, val value: Long = origin.toLong() * mult)

    fun nthMagicalNumberPriorityQueue(n: Int, a: Int, b: Int): Int {
        val priorityQueue = PriorityQueue<MagicNum> { n1, n2 -> n1.value.compareTo(n2.value) }
        priorityQueue.offer(MagicNum(a, 1))
        priorityQueue.offer(MagicNum(b, 1))

        var result = 0L
        val visited = HashSet<Long>()

        var distinct = 0
        while (distinct < n) {
            val curr = priorityQueue.poll()
            if (visited.add(curr.value)) {
                distinct++
            }
            priorityQueue.offer(MagicNum(curr.origin, curr.mult + 1))
            result = curr.value
        }
        return (result % MOD).toInt()
    }

    fun nthMagicalNumberBinarySearch(n: Int, a: Int, b: Int): Int {
        val l = a / gcd(a, b) * b

        var lo: Long = 0
        var hi = n.toLong() * minOf(a, b)
        while (lo < hi) {
            val mi = lo + (hi - lo) / 2
            // If there are not enough magic numbers below mi...
            if (mi / a + mi / b - mi / l < n) lo = mi + 1
            else hi = mi
        }

        return (lo % MOD).toInt()
    }

    private fun gcd(x: Int, y: Int): Int {
        if (x == 0) return y
        return gcd(y % x, x)
    }
}
