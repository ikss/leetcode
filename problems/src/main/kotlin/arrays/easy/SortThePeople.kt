package arrays.easy

/**
 * You are given an array of strings names, and an array heights that consists of distinct positive integers.
 * Both arrays are of length n.
 *
 * For each index i, `names[i]` and `heights[i]` denote the name and height of the ith person.
 *
 * Return names sorted in descending order by the people's heights.
 *
 * [URL](https://leetcode.com/problems/build-array-from-permutation/)
 */
object SortThePeople {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val sortedHeights = heights.withIndex().sortedByDescending { it.value }

        return Array(heights.size) { names[sortedHeights[it].index] }
    }
}
