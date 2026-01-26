package easy

/**
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
 *
 * Return a list of pairs in ascending order(with respect to pairs), each pair `[a, b]` follows
 * * a, b are from arr
 * * a < b
 * * b - a equals to the minimum absolute difference of any two elements in arr
 *
 * [URL](https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/)
 */
object MinimumAbsoluteDifference {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        arr.sort()

        val pairs = arrayListOf<List<Int>>()
        var minDiff = Int.MAX_VALUE

        for (i in 0 until arr.size - 1) {
            val diff = arr[i + 1] - arr[i]

            if (diff < minDiff) {
                minDiff = diff
                pairs.clear()
                pairs.add(listOf(arr[i], arr[i + 1]))
            } else if (diff == minDiff) {
                pairs.add(listOf(arr[i], arr[i + 1]))
            }
        }

        return pairs
    }
}
