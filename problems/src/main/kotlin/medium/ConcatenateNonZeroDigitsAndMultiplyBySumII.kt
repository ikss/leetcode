package medium

/**
 * You are given a string s of length m consisting of digits. You are also given a 2D integer array queries,
 * where `queries[i] = [li, ri]`.
 *
 * For each `queries[i]`, extract the substring `s[li..ri]`. Then, perform the following:
 *
 * Form a new integer x by concatenating all the non-zero digits from the substring in their original order.
 * If there are no non-zero digits, x = 0.
 * Let sum be the sum of digits in x. The answer is x * sum.
 * Return an array of integers answer where `answer[i]` is the answer to the ith query.
 *
 * Since the answers may be very large, return them modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-ii/)
 */
object ConcatenateNonZeroDigitsAndMultiplyBySumII {
    val mod = 1_000_000_007

    private class State(
        val count: Int,
        val sum: Int,
        val x: Long,
    )

    fun sumAndMultiply(s: String, queries: Array<IntArray>): IntArray {
        val pow10 = LongArray(s.length + 1)
        pow10[0] = 1
        for (i in 1 until pow10.size) {
            pow10[i] = (pow10[i - 1] * 10) % mod
        }

        val state = arrayOfNulls<State>(s.length + 1)
        state[0] = State(0, 0, 0L)
        for (i in s.indices) {
            val c = s[i]
            val num = c - '0'

            val prevState = state[i]!!
            val newCount = prevState.count + if (num > 0) 1 else 0
            val newSum = prevState.sum + num
            val newX = if (num > 0) (prevState.x * 10 + num) % mod else prevState.x

            state[i + 1] = State(newCount, newSum, newX)
        }

        val result = IntArray(queries.size)
        for (i in queries.indices) {
            val s = state[queries[i][0]]!!
            val e = state[queries[i][1] + 1]!!

            val length = e.count - s.count
            val x = (e.x - ((s.x * pow10[length]) % mod) + mod) % mod
            val sum = e.sum - s.sum

            result[i] = ((x * sum) % mod).toInt()
        }

        return result
    }
}
