package medium

/**
 * You are given an array arr of positive integers. You are also given the array queries where
 * `queries[i] = [lefti, righti]`.
 *
 * For each query i compute the XOR of elements from lefti to righti
 * (that is, `arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti]`).
 *
 * Return an array answer where `answer[i]` is the answer to the ith query.
 *
 * [URL](https://leetcode.com/problems/xor-queries-of-a-subarray/)
 */
object XORQueriesOfSubarray {
    fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {
        val xors = IntArray(arr.size)
        xors[0] = arr[0]

        for (i in 1 until arr.size) {
            xors[i] = arr[i] xor xors[i - 1]
        }

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            val (l, r) = queries[i]
            result[i] = if (l == 0) xors[r] else xors[l - 1] xor xors[r]
        }

        return result
    }
}
