package medium

/**
 * An integer array original is transformed into a doubled array changed by appending twice the value
 * of every element in original, and then randomly shuffling the resulting array.
 *
 * Given an array changed, return original if changed is a doubled array. If changed is not a doubled array,
 * return an empty array. The elements in original may be returned in any order.
 *
 * [URL](https://leetcode.com/problems/find-original-array-from-doubled-array/)
 */
object FindOriginalArrayFromDoubledArray {
    fun findOriginalArray(changed: IntArray): IntArray {
        if (changed.size % 2 != 0) return intArrayOf()
        changed.sort()

        val result = ArrayList<Int>(changed.size / 2)
        val deque = ArrayDeque<Int>()
        for (num in changed) {
            if (deque.isNotEmpty() && num == deque.first() * 2) {
                result.add(deque.removeFirst())
            } else {
                deque.add(num)
            }
        }

        return if (deque.isEmpty()) result.toIntArray() else intArrayOf()
    }
}
