package medium

/**
 * You have n processes forming a rooted tree structure. You are given two integer arrays pid and ppid,
 * where `pid[i]` is the ID of the ith process and `ppid[i]` is the ID of the ith process's parent process.
 *
 * Each process has only one parent process but may have multiple children processes.
 * nly one process has `ppid[i] = 0`, which means this process has no parent process (the root of the tree).
 *
 * When a process is killed, all of its children processes will also be killed.
 *
 * Given an integer kill representing the ID of a process you want to kill, return a list of the IDs of the processes
 * that will be killed. You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/kill-process/)
 */
object KillProcess {
    fun killProcess(pid: List<Int>, ppid: List<Int>, kill: Int): List<Int> {
        val graph = HashMap<Int, ArrayList<Int>>()
        for (p in pid) {
            graph[p] = ArrayList()
        }

        for (i in ppid.indices) {
            val parent = ppid[i]
            if (parent == 0) continue

            graph[parent]!!.add(pid[i])
        }

        val result = ArrayList<Int>()
        val queue = java.util.ArrayDeque<Int>()
        queue.offer(kill)

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            result.add(curr)

            for (child in graph[curr] ?: continue) {
                queue.offer(child)
            }
        }

        return result
    }
}
