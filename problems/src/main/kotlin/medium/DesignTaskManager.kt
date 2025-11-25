package medium

import java.util.*

/**
 * There is a task management system that allows users to manage their tasks, each associated with a priority.
 * The system should efficiently handle adding, modifying, executing, and removing tasks.
 *
 * Implement the TaskManager class:
 * * TaskManager(vector<vector<int>>& tasks) initializes the task manager with a list of user-task-priority triples.
 * Each element in the input list is of the form [userId, taskId, priority], which adds a task to the specified user
 * with the given priority.
 * * void add(int userId, int taskId, int priority) adds a task with the specified taskId and priority
 * to the user with userId. It is guaranteed that taskId does not exist in the system.
 * * void edit(int taskId, int newPriority) updates the priority of the existing taskId to newPriority.
 * It is guaranteed that taskId exists in the system.
 * * void rmv(int taskId) removes the task identified by taskId from the system.
 * It is guaranteed that taskId exists in the system.
 * * int execTop() executes the task with the highest priority across all users.
 * If there are multiple tasks with the same highest priority, execute the one with the highest taskId.
 * After executing, the taskId is removed from the system. Return the userId associated with the executed task.
 * If no tasks are available, return -1.
 *
 * Note that a user may be assigned multiple tasks.
 *
 * [URL](https://leetcode.com/problems/design-task-manager/)
 */
object DesignTaskManager {
    class TaskManager(tasks: List<List<Int>>) {
        private data class Task(
            val userId: Int,
            val taskId: Int,
            var priority: Int,
        ) {
            var removed = false
        }

        private val tasksMap = HashMap<Int, Task>()
        private val taskQueue = PriorityQueue<Task> { t1, t2 ->
            if (t1.priority == t2.priority) t2.taskId - t1.taskId else t2.priority - t1.priority
        }
        init {
            for ((userId, taskId, priority) in tasks) {
                add(userId, taskId, priority)
            }
        }
        fun add(userId: Int, taskId: Int, priority: Int) {
            val task = Task(userId, taskId, priority)
            tasksMap[taskId] = task
            taskQueue.offer(task)
        }

        fun edit(taskId: Int, newPriority: Int) {
            val task = tasksMap[taskId]!!
            val newTask = task.copy(priority = newPriority)
            task.removed = true
            tasksMap[taskId] = newTask
            taskQueue.offer(newTask)
        }

        fun rmv(taskId: Int) {
            val task = tasksMap.remove(taskId)!!
            task.removed = true
        }

        fun execTop(): Int {
            var nextTask: Task? = null
            while (taskQueue.isNotEmpty()) {
                nextTask = taskQueue.poll()
                if (nextTask!!.removed) nextTask = null else break
            }
            if (nextTask == null) return -1
            tasksMap.remove(nextTask.taskId)
            return nextTask.userId
        }

    }
}