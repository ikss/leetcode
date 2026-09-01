package hard

import java.util.*


/**
 * You are given a 0-indexed integer array books of length n where `books[i]`
 * denotes the number of books on the ith shelf of a bookshelf.
 *
 * You are going to take books from a contiguous section of the bookshelf spanning from l to r where 0 <= l <= r < n.
 * For each index i in the range l <= i < r, you must take strictly fewer books from shelf i than shelf i + 1.
 *
 * Return the maximum number of books you can take from the bookshelf.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-books-you-can-take/)
 */
object MaximumNumberOfBooksYouCanTake {
    fun maximumBooks(books: IntArray): Long {
        val n = books.size

        val s = Stack<Int>()
        val dp = LongArray(n)

        for (i in 0..<n) {
            // While we cannot push i, we pop from the stack
            while (s.isNotEmpty() && books[s.peek()] - s.peek() >= books[i] - i) {
                s.pop()
            }

            // Compute dp[i]
            if (s.isEmpty()) {
                dp[i] = calculateSum(books, 0, i)
            } else {
                val j = s.peek()
                dp[i] = dp[j] + calculateSum(books, j + 1, i)
            }

            // Push the current index onto the stack
            s.push(i)
        }


        // Return the maximum element in dp array
        return dp.max()
    }

    // Helper function to calculate the sum of books in a given range [l, r]
    private fun calculateSum(books: IntArray, l: Int, r: Int): Long {
        val cnt = minOf(books[r], r - l + 1).toLong()

        return (2 * books[r] - (cnt - 1)) * cnt / 2
    }
}
