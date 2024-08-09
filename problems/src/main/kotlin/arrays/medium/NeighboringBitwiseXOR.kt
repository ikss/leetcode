package arrays.medium

/**
 * A 0-indexed array derived with length n is derived by computing the bitwise XOR (⊕)
 * of adjacent values in a binary array original of length n.
 *
 * Specifically, for each index i in the range `[0, n - 1]`:
 * * If i = n - 1, then `derived[i] = original[i] ⊕ original[0]`.
 * * Otherwise, `derived[i] = original[i] ⊕ original[i + 1]`.
 *
 * Given an array derived, your task is to determine whether there exists a valid binary array original that
 * could have formed derived.
 *
 * Return true if such an array exists or false otherwise.
 * * A binary array is an array containing only 0's and 1's
 *
 * [URL](https://leetcode.com/problems/neighboring-bitwise-xor/)
 */
object NeighboringBitwiseXOR {
    fun doesValidArrayExist(derived: IntArray): Boolean {
        return isValid(0, derived) || isValid(1, derived)
    }

    private fun isValid(endWith: Int, derived: IntArray): Boolean {
        val n = derived.size
        val arr = IntArray(n) { derived[it] }

        for (i in n - 2 downTo 0) {
            arr[i] = arr[i] xor arr[i + 1]
        }

        return derived[n-1] == arr[n-1] xor arr[0]
    }
}
