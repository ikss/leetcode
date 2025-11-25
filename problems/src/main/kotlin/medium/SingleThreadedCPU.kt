package medium

import java.util.*

/**
 * You are given n tasks labeled from 0 to n - 1 represented by a 2D integer array tasks,
 * where `tasks[i] = [enqueueTimei, processingTimei]` means that the ith task will be available to process at
 * enqueueTimei and will take processingTimei to finish processing.
 *
 * You have a single-threaded CPU that can process at most one task at a time and will act in the following way
 * * If the CPU is idle and there are no available tasks to process, the CPU remains idle.
 * * If the CPU is idle and there are available tasks, the CPU will choose the one with the shortest processing time.
 * * If multiple tasks have the same shortest processing time, it will choose the task with the smallest index.
 * * Once a task is started, the CPU will process the entire task without stopping.
 * * The CPU can finish a task then start a new one instantly.
 *
 * Return the order in which the CPU will process the tasks.
 *
 * [URL](https://leetcode.com/problems/single-threaded-cpu/)
 */
object SingleThreadedCPU {
    fun getOrder(tasks: Array<IntArray>): IntArray {
        // Sort based on min task processing time or min task index.
        // Store enqueue time, processing time, task index.
        val nextTask = PriorityQueue { a: IntArray, b: IntArray -> if (a[1] != b[1]) a[1] - b[1] else a[2] - b[2] }

        // Store task enqueue time, processing time, index.
        val sortedTasks = Array(tasks.size) { IntArray(3) }
        for (i in tasks.indices) {
            sortedTasks[i][0] = tasks[i][0]
            sortedTasks[i][1] = tasks[i][1]
            sortedTasks[i][2] = i
        }
        sortedTasks.sortBy { it[0] }
        val result = IntArray(tasks.size)
        var currTime = 0L
        var taskIndex = 0
        var ansIndex = 0

        // Stop when no tasks are left in array and heap.
        while (taskIndex < tasks.size || !nextTask.isEmpty()) {
            if (nextTask.isEmpty() && currTime < sortedTasks[taskIndex][0]) {
                // When the heap is empty, try updating currTime to next task's enqueue time.
                currTime = sortedTasks[taskIndex][0].toLong()
            }

            // Push all the tasks whose enqueueTime <= currTime into the heap.
            while (taskIndex < tasks.size && currTime >= sortedTasks[taskIndex][0]) {
                nextTask.add(sortedTasks[taskIndex++])
            }
            val (_, processTime, index) = nextTask.poll()

            // Complete this task and increment currTime.
            currTime += processTime
            result[ansIndex++] = index
        }
        return result
    }
}