package hard

import java.util.*

/**
 * You are given an integer array arr.
 *
 * We split arr into some number of chunks (i.e., partitions), and individually sort each chunk.
 * After concatenating them, the result should equal the sorted array.
 *
 * Return the largest number of chunks we can make to sort the array.
 *
 * [URL](https://leetcode.com/problems/max-chunks-to-make-sorted-ii/)
 */
object MaxChunksToMakeSortedII {
    fun maxChunksToSortedMinOfRight(arr: IntArray): Int {
        val n = arr.size
        val minOfRight = IntArray(n)
        minOfRight[n - 1] = arr[n - 1]

        for (i in n - 2 downTo 0) {
            minOfRight[i] = minOf(minOfRight[i + 1], arr[i])
        }

        var res = 0
        var max = Int.MIN_VALUE
        for (i in 0 until n - 1) {
            max = maxOf(max, arr[i])
            
            if (max <= minOfRight[i + 1]) {
                res++
            }
        }
        return res + 1
    }

    fun maxChunksToSortedHashTrack(arr: IntArray): Int {
        val sorted = arr.sorted()

        var result = 0
        val curr = TreeMap<Int, Int>()
        var chunkStart = 0
        var i = 0
        while (i < arr.size) {
            val num = arr[i++]
            curr.merge(num, 1, Int::plus)
            if (isValid(sorted, curr, chunkStart)) {
                result++
                curr.clear()
                chunkStart = i
            }
        }

        return result
    }

    private fun isValid(arr: List<Int>, curr: TreeMap<Int, Int>, chunkStart: Int): Boolean {
        var i = chunkStart
        for ((k, v) in curr) {
            for (j in i until i + v) {
                if (arr[j] != k) return false
            }
            i += v
        }
        return true
    }
}
