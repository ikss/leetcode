package hard

import java.util.*
import kotlin.math.max


/**
 * There exists an infinite number line, with its origin at 0 and extending towards the positive x-axis.
 *
 * You are given a 2D array queries, which contains two types of queries:
 * * For a query of type 1, `queries[i] = [1, x]`. Build an obstacle at distance x from the origin.
 * It is guaranteed that there is no obstacle at distance x when the query is asked.
 * * For a query of type 2, `queries[i] = [2, x, sz]`. Check if it is possible to place a block of size sz anywhere in
 * the range [0, x] on the line, such that the block entirely lies in the range `[0, x]`.
 * A block cannot be placed if it intersects with any obstacle, but it may touch it.
 * Note that you do not actually place the block. Queries are separate.
 *
 * Return a boolean array results, where `results[i]` is true if you can place the block
 * specified in the ith query of type 2, and false otherwise.
 *
 * [URL](https://leetcode.com/problems/block-placement-queries/)
 */
object BlockPlacementQueries {

    private fun update(seg: IntArray, idx: Int, `val`: Int, p: Int, l: Int, r: Int) {
        if (l == r) {
            seg[p] = `val`
            return
        }
        val mid = (l + r) shr 1
        if (idx <= mid) {
            update(seg, idx, `val`, p shl 1, l, mid)
        } else {
            update(seg, idx, `val`, (p shl 1) or 1, mid + 1, r)
        }
        seg[p] = max(seg[p shl 1], seg[(p shl 1) or 1])
    }

    private fun query(seg: IntArray, left: Int, right: Int, p: Int, l: Int, r: Int): Int {
        if (left <= l && r <= right) {
            return seg[p]
        }
        val mid = (l + r) shr 1
        var res = 0
        if (left <= mid) {
            res = max(res, query(seg, left, right, p shl 1, l, mid))
        }
        if (right > mid) {
            res = max(res, query(seg, left, right, (p shl 1) or 1, mid + 1, r))
        }
        return res
    }

    fun getResults(queries: Array<IntArray>): ArrayList<Boolean> {
        val mx = 50000
        val seg = IntArray(mx shl 2)
        val st = TreeSet<Int>()
        st.add(0)
        st.add(mx)
        update(seg, mx, mx, 1, 0, mx)
        val result = ArrayList<Boolean>()

        for (q in queries) {
            if (q[0] == 1) {
                val x = q[1]
                val r = st.ceiling(x + 1) ?: mx
                val l = st.floor(x - 1) ?: 0
                update(seg, x, x - l, 1, 0, mx)
                update(seg, r, r - x, 1, 0, mx)
                st.add(x)
            } else {
                val x = q[1]
                val sz = q[2]
                val pre = st.floor(x) ?: 0
                var maxSpace = query(seg, 0, pre, 1, 0, mx)
                maxSpace = maxOf(maxSpace, x - pre)

                result.add(maxSpace >= sz)
            }
        }
        return result
    }
}
