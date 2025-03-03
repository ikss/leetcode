package arrays.medium

/**
 * Given a binary array data, return the minimum number of swaps required to group all 1’s present in the array together
 * in any place in the array.
 *
 * [URL](https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together/)
 */
object MinimumSwapsToGroupAll1sTogether {
    fun minSwaps(data: IntArray): Int {
        var count = 0
        for (n in data) {
            if (n == 1) {
                count++
            }
        }
        if (count == 0) {
            return 0
        }

        var i = 0
        var zeros = 0
        while (i < count) {
            if (data[i++] == 0) {
                zeros++
            }
        }
        var result = zeros

        while (i < data.size) {
            if (data[i] == 0) {
                zeros++
            }
            if (data[i - count] == 0) {
                zeros--
            }
            i++
            result = minOf(result, zeros)
        }

        return result
    }
}
