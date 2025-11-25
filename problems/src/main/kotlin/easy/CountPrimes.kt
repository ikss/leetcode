package easy

/**
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 *
 * [URL](https://leetcode.com/problems/count-primes/)
 */
object CountPrimes {
    fun countPrimes(n: Int): Int {
        val isPrime = Array(n) { true }
        // Loop's ending condition is i * i < n instead of i < sqrt(n)
        // to avoid repeatedly calling an expensive function sqrt().
        for (i in 2 until n) {
            if (i * i > n) break
            if (!isPrime[i]) continue
            for (j in i * i until n step i) {
                isPrime[j] = false
            }
        }
        var count = 0
        for (i in 2 until n) {
            if (isPrime[i]) count++
        }
        return count
    }
}
