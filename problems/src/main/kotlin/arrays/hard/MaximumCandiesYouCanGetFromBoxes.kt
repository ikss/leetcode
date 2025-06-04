package arrays.hard

import java.util.*

/**
 * You have n boxes labeled from 0 to n - 1.
 * You are given four arrays: status, candies, keys, and containedBoxes where:
 * * `status[i]` is 1 if the ith box is open and 0 if the ith box is closed,
 * * `candies[i]` is the number of candies in the ith box,
 * * `keys[i]` is a list of the labels of the boxes you can open after opening the ith box.
 * * `containedBoxes[i]` is a list of the boxes you found inside the ith box.
 *
 * You are given an integer array initialBoxes that contains the labels of the boxes you initially have.
 * You can take all the candies in any open box and you can use the keys in it
 * to open new boxes and you also can use the boxes you find in it.
 *
 * Return the maximum number of candies you can get following the rules above.
 *
 * [URL](https://leetcode.com/problems/maximum-candies-you-can-get-from-boxes/)
 */
object MaximumCandiesYouCanGetFromBoxes {
    fun maxCandies(
        status: IntArray,
        candies: IntArray,
        keys: Array<IntArray>,
        containedBoxes: Array<IntArray>,
        initialBoxes: IntArray,
    ): Int {
        val queue = ArrayDeque<Int>()
        for (box in initialBoxes) {
            if (status[box] == 1) {
                queue.addFirst(box)
            } else {
                queue.addLast(box)
            }
        }

        val visited = BooleanArray(status.size)
        var result = 0

        var first = -1
        while (!queue.isEmpty()) {
            val curr = queue.poll()
            if (status[curr] == 0) {
                if (first != -1) {
                    break
                }
                first = curr
                queue.offer(curr)
                continue
            }
            first = -1
            if (visited[curr]) {
                continue
            }
            visited[curr] = true
            result += candies[curr]
            for (key in keys[curr]) {
                status[key] = 1
            }
            for (box in containedBoxes[curr]) {
                queue.addLast(box)
            }
        }

        return result
    }
}
