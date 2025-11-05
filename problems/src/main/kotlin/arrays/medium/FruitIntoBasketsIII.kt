package arrays.medium

/**
 * You are given two arrays of integers, fruits and baskets, each of length n, where `fruits[i]` represents
 * the quantity of the ith type of fruit, and `baskets[j]` represents the capacity of the jth basket.
 *
 * From left to right, place the fruits according to these rules:
 *
 * * Each fruit type must be placed in the leftmost available basket with a capacity greater than or equal to the
 * quantity of that fruit type.
 * * Each basket can hold only one type of fruit.
 * * If a fruit type cannot be placed in any basket, it remains unplaced.
 *
 * Return the number of fruit types that remain unplaced after all possible allocations are made.
 *
 * [URL](https://leetcode.com/problems/fruit-into-baskets-iii/)
 */
object FruitIntoBasketsIII {
    private val segTree = IntArray(400007)

    private fun build(p: Int, l: Int, r: Int, baskets: IntArray) {
        if (l == r) {
            segTree[p] = baskets[l]
            return
        }
        val mid = (l + r) shr 1
        build(p shl 1, l, mid, baskets)
        build((p shl 1) or 1, mid + 1, r, baskets)
        segTree[p] = maxOf(segTree[p shl 1], segTree[(p shl 1) or 1])
    }

    private fun query(p: Int, l: Int, r: Int, ql: Int, qr: Int): Int {
        if (ql > r || qr < l) {
            return Int.Companion.MIN_VALUE
        }
        if (ql <= l && r <= qr) {
            return segTree[p]
        }
        val mid = (l + r) shr 1
        return maxOf(
            query(p shl 1, l, mid, ql, qr),
            query((p shl 1) or 1, mid + 1, r, ql, qr)
        )
    }

    private fun update(p: Int, l: Int, r: Int, pos: Int, `val`: Int) {
        if (l == r) {
            segTree[p] = `val`
            return
        }
        val mid = (l + r) shr 1
        if (pos <= mid) {
            update(p shl 1, l, mid, pos, `val`)
        } else {
            update((p shl 1) or 1, mid + 1, r, pos, `val`)
        }
        segTree[p] = maxOf(segTree[p shl 1], segTree[(p shl 1) or 1])
    }

    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
        val m = baskets.size
        var count = 0
        if (m == 0) {
            return fruits.size
        }
        segTree.fill(Int.MIN_VALUE)
        build(1, 0, m - 1, baskets)
        for (i in fruits.indices) {
            var l = 0
            var r = m - 1
            var res = -1
            while (l <= r) {
                val mid = (l + r) shr 1
                if (query(1, 0, m - 1, 0, mid) >= fruits[i]) {
                    res = mid
                    r = mid - 1
                } else {
                    l = mid + 1
                }
            }
            if (res != -1 && baskets[res] >= fruits[i]) {
                update(1, 0, m - 1, res, Int.MIN_VALUE)
            } else {
                count++
            }
        }
        return count
    }
}
