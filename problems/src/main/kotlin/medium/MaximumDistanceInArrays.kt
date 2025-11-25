package medium

/**
 * You are given m arrays, where each array is sorted in ascending order.
 *
 * You can pick up two integers from two different arrays (each array picks one) and calculate the distance.
 * We define the distance between two integers a and b to be their absolute difference |a - b|.
 *
 * Return the maximum distance.
 *
 * [URL](https://leetcode.com/problems/maximum-distance-in-arrays/)
 */
object MaximumDistanceInArrays {
    fun maxDistance(arrays: List<List<Int>>): Int {
        val firstArr = arrays[0]
        var min = firstArr[0]
        var max = firstArr[firstArr.size - 1]

        var res = 0

        for (i in 1 until arrays.size) {
            val arr = arrays[i]
            val last = arr.size - 1
            res = maxOf(res, Math.abs(arr[last] - min), Math.abs(max - arr[0]))
            min = minOf(min, arr[0])
            max = maxOf(max, arr[last])
        }

        return res
    }
}