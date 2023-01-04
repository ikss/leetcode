package arrays.medium

/**
 * You are given a 0-indexed integer array tasks, where `tasks[i]` represents the difficulty level of a task.
 * In each round, you can complete either 2 or 3 tasks of the same difficulty level.
 *
 * Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.
 *
 * [URL](https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/)
 */
object MinimumRoundsToCompleteAllTasks {
    fun minimumRounds(tasks: IntArray): Int {
        val taskCount = tasks.toList().groupingBy { it }.eachCount().values
        println(taskCount)
        var result = 0
        for (count in taskCount) {
            if (count == 1) return -1

            var twos = 0
            var threes: Int

            if (count % 3 == 0) {
                threes = count / 3
            } else {
                threes = (count - 2) / 3
                twos = (count - threes * 3) / 2
            }
            result += twos + threes
        }

        return result
    }
}