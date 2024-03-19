package arrays.medium

/**
 * You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n.
 * Each cycle or interval allows the completion of one task. Tasks can be completed in any order,
 * but there's a constraint: identical tasks must be separated by at least n intervals due to cooling time.
 *
 * Return the minimum number of intervals required to complete all tasks.
 *
 * [URL](https://leetcode.com/problems/task-scheduler/)
 */
object TaskScheduler {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        val freq = IntArray(26)
        var maxCount = 0

        for (task in tasks) {
            freq[task - 'A']++
            maxCount = maxOf(maxCount, freq[task - 'A'])
        }

        var neededTimeForMax = (maxCount - 1) * (n + 1)
        for (f in freq) {
            if (f == maxCount) {
                neededTimeForMax++
            }
        }

        return maxOf(tasks.size, neededTimeForMax)
    }
}