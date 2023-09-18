package arrays.easy

import java.util.*

/**
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
 * The soldiers are positioned in front of the civilians.
 * That is, all the 1's will appear to the left of all the 0's in each row.
 *
 * A row i is weaker than a row j if one of the following is true:
 *
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 *
 * [URL](https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/)
 */
object TheKWeakestRowsInAMatrix {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val pq = PriorityQueue<Pair<Int, Int>> { p1, p2 ->
            if (p1.second == p2.second) p2.first.compareTo(p1.first) else p2.second.compareTo(p1.second)
        }

        for (i in mat.indices) {
            pq.offer(i to numOnes(mat[i]))
            if (pq.size > k) {
                pq.poll()
            }
        }
        val result = IntArray(k)
        for (i in result.indices) {
            val (index, _) = pq.poll()
            result[k - i - 1] = index
        }
        return result
    }

    private fun numOnes(row: IntArray): Int {
        var lo = 0
        var hi = row.size
        while (lo < hi) {
            val mid = lo + (hi - lo) / 2
            if (row[mid] == 1) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }
        return lo
    }
}
