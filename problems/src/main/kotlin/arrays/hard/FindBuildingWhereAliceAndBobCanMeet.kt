package arrays.hard

import java.util.*

/**
 * You are given a 0-indexed array heights of positive integers,
 * where `heights[i]` represents the height of the ith building.
 *
 * If a person is in building i, they can move to any other building j if and only if i < j and `heights[i] < heights[j]`.
 *
 * You are also given another array queries where `queries[i] = [ai, bi]`.
 * On the ith query, Alice is in building ai while Bob is in building bi.
 *
 * Return an array _ans_ where `ans[i]` is the index of the leftmost building where Alice and Bob can meet on the ith
 * query. If Alice and Bob cannot move to a common building on query i, set `ans[i]` to -1.
 *
 * [URL](https://leetcode.com/problems/find-building-where-alice-and-bob-can-meet/)
 */
object FindBuildingWhereAliceAndBobCanMeet {

    fun leftmostBuildingQueries(heights: IntArray, queries: Array<IntArray>): IntArray {
        val storeQueries = ArrayList<ArrayList<List<Int>>>(heights.size)
        for (i in heights.indices) storeQueries.add(ArrayList())

        val maxIndex = PriorityQueue<List<Int>>(compareBy({ it[0] }))
        val result = IntArray(queries.size) { -1 }

        for (currQuery in queries.indices) {
            val (a, b) = queries[currQuery]

            if (a < b && heights[a] < heights[b]) {
                result[currQuery] = b
            } else if (a > b && heights[a] > heights[b]) {
                result[currQuery] = a
            } else if (a == b) {
                result[currQuery] = a
            } else {
                storeQueries[maxOf(a, b)].add(listOf(maxOf(heights[a], heights[b]), currQuery))
            }
        }

        for (index in heights.indices) {
            while (maxIndex.isNotEmpty() && maxIndex.peek()[0] < heights[index]) {
                result[maxIndex.peek()[1]] = index
                maxIndex.poll()
            }
            for (element in storeQueries[index]) {
                maxIndex.offer(element)
            }
        }
        return result
    }
}
