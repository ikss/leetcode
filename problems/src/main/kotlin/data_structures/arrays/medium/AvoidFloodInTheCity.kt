package data_structures.arrays.medium

/**
 * Your country has an infinite number of lakes. Initially, all the lakes are empty,
 * but when it rains over the nth lake, the nth lake becomes full of water.
 * If it rains over a lake that is full of water, there will be a flood. Your goal is to avoid floods in any lake.
 *
 * Given an integer array rains where:
 *
 *  * `rains[i]` > 0 means there will be rains over the `rains[i]` lake.
 *  * `rains[i]` == 0 means there are no rains this day and you can choose one lake this day and dry it.
 *
 * Return an array ans where:
 *
 *  * ans.length == rains.length
 *  * `ans[i] == -1` if `rains[i] > 0`.
 *  * `ans[i]` is the lake you choose to dry in the ith day if `rains[i] == 0`.
 *
 * If there are multiple valid answers return any of them. If it is impossible to avoid flood return an empty array.
 *
 * Notice that if you chose to dry a full lake, it becomes empty, but if you chose to dry an empty lake, nothing changes.
 *
 * [URL](https://leetcode.com/problems/avoid-flood-in-the-city/)
 */
object AvoidFloodInTheCity {
    fun avoidFlood(rains: IntArray): IntArray {
        val map = hashMapOf<Int, Int>()
        val zeros = sortedSetOf<Int>()
        val res = IntArray(rains.size) { 1 }
        for (i in rains.indices) {
            val r = rains[i]
            if (r == 0) {
                zeros.add(i)
                continue
            }
            if (map.containsKey(r)) {
                // find the day after map[r] which can be used to empty r lake
                val nextDayAfterFill = zeros.ceiling(map[r])
                    ?: return IntArray(0)
                res[nextDayAfterFill] = r
                zeros.remove(nextDayAfterFill)
            }
            res[i] = -1
            map[r] = i
        }
        return res
    }
}
