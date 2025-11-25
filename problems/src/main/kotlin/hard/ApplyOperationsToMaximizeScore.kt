package hard

import java.util.*
import kotlin.math.sqrt

/**
 * You are given an array nums of n positive integers and an integer k.
 *
 * Initially, you start with a score of 1. You have to maximize your score by applying the following operation
 * at most k times:
 * * Choose any non-empty subarray `nums[l, ..., r]` that you haven't chosen previously.
 * Choose an element x of `nums[l, ..., r]` with the highest prime score. If multiple such elements exist,
 * choose the one with the smallest index.
 * * Multiply your score by x.
 *
 * Here, `nums[l, ..., r]` denotes the subarray of nums starting at index l and ending at the index r,
 * both ends being inclusive.
 *
 * The prime score of an integer x is equal to the number of distinct prime factors of x.
 * For example, the prime score of 300 is 3 since 300 = 2 * 2 * 3 * 5 * 5.
 *
 * Return the maximum possible score after applying at most k operations.
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 * [URL](https://leetcode.com/problems/apply-operations-to-maximize-score/)
 */
object ApplyOperationsToMaximizeScore {
    private val MOD: Int = 1_000_000_007

    fun maximumScore(nums: List<Int>, k: Int): Int {
        var k = k
        val n = nums.size
        val primeScores = calculatePrimes(n, nums)

        // Initialize next and previous dominant index arrays
        val nextDominant = IntArray(n) { n }
        val prevDominant = IntArray(n) { -1 }

        // Stack to store indices for monotonic decreasing prime score
        val decreasingPrimeScore = Stack<Int>()

        // Calculate the next and previous dominant indices for each number
        for (index in 0..<n) {
            // While the stack is not empty and the current prime score is greater than the stack's top
            while (!decreasingPrimeScore.isEmpty() && primeScores[decreasingPrimeScore.peek()] < primeScores[index]) {
                val topIndex = decreasingPrimeScore.pop()

                // Set the next dominant element for the popped index
                nextDominant[topIndex] = index
            }

            // If the stack is not empty, set the previous dominant element for the current index
            if (!decreasingPrimeScore.isEmpty()) prevDominant[index] = decreasingPrimeScore.peek()

            // Push the current index onto the stack
            decreasingPrimeScore.push(index)
        }

        // Calculate the number of subarrays in which each element is dominant
        val numOfSubarrays = LongArray(n)
        for (index in 0..<n) {
            numOfSubarrays[index] = (nextDominant[index].toLong() - index) * (index - prevDominant[index])
        }

        // Priority queue to process elements in decreasing order of their value
        val processingQueue = PriorityQueue { a: IntArray, b: IntArray ->
            if (b[0] == a[0]) {
                a[1] - b[1]
            } else {
                b[0] - a[0]
            }
        }

        // Push each number and its index onto the priority queue
        for (index in 0..<n) {
            processingQueue.offer(intArrayOf(nums[index], index))
        }

        var score: Long = 1

        // Process elements while there are operations left
        while (k > 0) {
            // Get the element with the maximum value from the queue
            val top = processingQueue.poll()
            val num = top[0]
            val index = top[1]

            // Calculate the number of operations to apply on the current element
            val operations = minOf(k.toLong(), numOfSubarrays[index])

            // Update the score by raising the element to the power of operations
            score = (score * power(num.toLong(), operations)) % MOD

            // Reduce the remaining operations count
            k -= operations.toInt()
        }

        return score.toInt()
    }

    private fun calculatePrimes(n: Int, nums: List<Int>): IntArray {
        val primeScores = IntArray(n)

        // Calculate the prime score for each number in nums
        for (index in 0..<n) {
            var num = nums[index]

            // Check for prime factors from 2 to sqrt(n)
            var factor = 2
            while (factor <= sqrt(num.toDouble())) {
                if (num % factor == 0) {
                    // Increment prime score for each prime factor
                    primeScores[index] = primeScores[index] + 1

                    // Remove all occurrences of the prime factor from num
                    while (num % factor == 0) num /= factor
                }
                factor++
            }

            // If num is still greater than or equal to 2, it's a prime factor
            if (num >= 2) primeScores[index] = primeScores[index] + 1
        }
        return primeScores
    }

    // Helper function to compute the power of a number modulo MOD
    private fun power(base: Long, exponent: Long): Long {
        var base = base
        var exponent = exponent
        var res: Long = 1

        // Calculate the exponentiation using binary exponentiation
        while (exponent > 0) {
            // If the exponent is odd, multiply the result by the base
            if (exponent % 2 == 1L) {
                res = (res * base) % MOD
            }

            // Square the base and halve the exponent
            base = (base * base) % MOD
            exponent /= 2
        }

        return res
    }
}
