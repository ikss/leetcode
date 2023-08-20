package graphs.hard

import java.util.*


/**
 * There are n items each belonging to zero or one of m groups where `group[i]` is the group that the i-th item belongs
 * to and it's equal to -1 if the i-th item belongs to no group. The items and the groups are zero indexed.
 * A group can have no item belonging to it.
 *
 * Return a sorted list of the items such that:
 * * The items that belong to the same group are next to each other in the sorted list.
 * * There are some relations between these items where `beforeItems[i]` is a list containing all the items that should
 * come before the i-th item in the sorted array (to the left of the i-th item).
 *
 * Return any solution if there is more than one solution and return an empty list if there is no solution.
 *
 * [URL](https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/)
 */
object SortItemsByGroupsRespectingDependencies {
    fun sortItems(n: Int, m: Int, group: IntArray, beforeItems: List<List<Int>>): IntArray {
        // If an item belongs to zero group, assign it a unique group id.
        var groupId = m
        for (i in 0 until n) {
            if (group[i] == -1) {
                group[i] = groupId
                groupId++
            }
        }

        // Sort all item regardless of group dependencies.
        val itemGraph = HashMap<Int, ArrayList<Int>>()
        val itemIndegree = IntArray(n)
        for (i in 0 until n) {
            itemGraph[i] = ArrayList()
        }

        // Sort all groups regardless of item dependencies.
        val groupGraph = HashMap<Int, ArrayList<Int>>()
        val groupIndegree = IntArray(groupId)
        for (i in 0 until groupId) {
            groupGraph[i] = ArrayList()
        }
        for (curr in 0 until n) {
            for (prev in beforeItems[curr]) {
                // Each (prev -> curr) represents an edge in the item graph.
                itemGraph[prev]!!.add(curr)
                itemIndegree[curr]++

                // If they belong to different groups, add an edge in the group graph.
                if (group[curr] != group[prev]) {
                    groupGraph[group[prev]]!!.add(group[curr])
                    groupIndegree[group[curr]]++
                }
            }
        }

        // Topological sort nodes in the graph, return an empty array if a cycle exists.
        val itemOrder = topologicalSort(itemGraph, itemIndegree)
        val groupOrder = topologicalSort(groupGraph, groupIndegree)
        if (itemOrder.isEmpty() || groupOrder.isEmpty()) {
            return IntArray(0)
        }

        // Items are sorted regardless of groups, we need to differentiate them by the groups they belong to.
        val orderedGroups = HashMap<Int, ArrayList<Int>>()
        for (item in itemOrder) {
            orderedGroups.computeIfAbsent(group[item]) { ArrayList() }.add(item)
        }

        // Concatenate sorted items in all sorted groups.
        // [group 1, group 2, ... ] -> [(item 1, item 2, ...), (item 1, item 2, ...), ...]
        val answerList = ArrayList<Int>()
        for (groupIndex in groupOrder) {
            answerList.addAll(orderedGroups.getOrDefault(groupIndex, emptyList()))
        }
        return answerList.toIntArray()
    }

    private fun topologicalSort(graph: Map<Int, List<Int>>, indegree: IntArray): List<Int> {
        val visited = ArrayList<Int>()
        val stack = Stack<Int>()
        for (key in graph.keys) {
            if (indegree[key] == 0) {
                stack.add(key)
            }
        }
        while (!stack.isEmpty()) {
            val curr = stack.pop()
            visited.add(curr)
            for (prev in graph[curr]!!) {
                indegree[prev]--
                if (indegree[prev] == 0) {
                    stack.add(prev)
                }
            }
        }
        return if (visited.size == graph.size) visited else emptyList()
    }
}
