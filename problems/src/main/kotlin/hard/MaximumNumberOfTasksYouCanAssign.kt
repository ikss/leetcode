package hard

import java.util.*

/**
 * You have n tasks and m workers. Each task has a strength requirement stored in a 0-indexed integer array tasks,
 * with the ith task requiring `tasks[i]` strength to complete. The strength of each worker is stored in a 0-indexed
 * integer array workers, with the jth worker having workers[j] strength. Each worker can only be assigned to a single task and must have a strength greater than or equal to the task's strength requirement (i.e., workers[j] >= tasks[i]).
 *
 * Additionally, you have pills magical pills that will increase a worker's strength by strength.
 * You can decide which workers receive the magical pills, however,
 * you may only give each worker at most one magical pill.
 *
 * Given the 0-indexed integer arrays tasks and workers and the integers pills and strength,
 * return the maximum number of tasks that can be completed.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-tasks-you-can-assign/)
 */
object MaximumNumberOfTasksYouCanAssign {

    fun maxTaskAssign(tasks: IntArray, workers: IntArray, pills: Int, strength: Int): Int {
        tasks.sort()
        workers.sort()

        val n = tasks.size
        val m = workers.size
        var left = 1
        var right = minOf(m, n)
        var ans = 0
        
        while (left <= right) {
            val mid = (left + right) / 2
            if (check(mid, tasks, workers, pills, strength)) {
                ans = mid
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return ans
    }

    private fun check(
        mid: Int,
        tasks: IntArray,
        workers: IntArray,
        pills: Int,
        strength: Int,
    ): Boolean {
        var p = pills
        val ws = TreeMap<Int, Int>()
        for (i in workers.size - mid..<workers.size) {
            ws.put(workers[i], ws.getOrDefault(workers[i], 0) + 1)
        }
        for (i in mid - 1 downTo 0) {
            var key = ws.lastKey()
            if (key!! >= tasks[i]) {
                ws.put(key, ws.get(key)!! - 1)
                if (ws.get(key) == 0) {
                    ws.remove(key)
                }
            } else {
                if (p == 0) {
                    return false
                }
                key = ws.ceilingKey(tasks[i] - strength)
                if (key == null) {
                    return false
                }
                ws.put(key, ws.get(key)!! - 1)
                if (ws.get(key) == 0) {
                    ws.remove(key)
                }
                --p
            }
        }
        return true
    }
}