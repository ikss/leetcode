package arrays.hard

/**
 * You are given a 0-indexed 2D integer array flowers, where `flowers[i] = [starti, endi]` means the ith flower will be
 * in full bloom from starti to endi (inclusive). You are also given a 0-indexed integer array people of size n,
 * where `people[i]` is the time that the ith person will arrive to see the flowers.
 *
 * Return an integer array answer of size n, where `answer[i]` is the number of flowers that are in full bloom when the
 * ith person arrives.
 *
 * [URL](https://leetcode.com/problems/number-of-flowers-in-full-bloom/)
 */
object NumberOfFlowersInFullBloom {

    fun fullBloomFlowers(flowers: Array<IntArray>, people: IntArray): IntArray {
        val result = IntArray(people.size)

        val start = ArrayList<Int>(flowers.size)
        val end = ArrayList<Int>(flowers.size)

        for ((s, e) in flowers) {
            start.add(s)
            end.add(e + 1)
        }

        start.sort()
        end.sort()

        for (i in people.indices) {
            val p = people[i]
            val started = binarySearch(start, p)
            val ended = binarySearch(end, p)
            result[i] = started - ended
        }

        return result
    }

    private fun binarySearch(arr: ArrayList<Int>, target: Int): Int {
        var left = 0
        var right = arr.size

        while (left < right) {
            val mid = left + (right - left) / 2

            if (target < arr[mid]) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return left
    }
}
