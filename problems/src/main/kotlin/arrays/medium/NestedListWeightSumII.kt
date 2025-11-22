package arrays.medium

/**
 * You are given a nested list of integers nestedList.
 * Each element is either an integer or a list whose elements may also be integers or other lists.
 *
 * The depth of an integer is the number of lists that it is inside of. For example,
 * the nested list `[1,[2,2],[[3],2],1]` has each integer's value set to its depth.
 * Let maxDepth be the maximum depth of any integer.
 *
 * The weight of an integer is maxDepth - (the depth of the integer) + 1.
 *
 * Return the sum of each integer in nestedList multiplied by its weight.
 *
 * [URL](https://leetcode.com/problems/nested-list-weight-sum-ii/)
 */
object NestedListWeightSumII {

    fun depthSumInverse(nestedList: List<NestedInteger>): Int {
        val maxDepth = getMaxDepth(nestedList)

        return getDepthSum(nestedList, maxDepth, 1)
    }

    private fun getDepthSum(nestedList: List<NestedInteger>, maxDepth: Int, currDepth: Int): Int {
        var result = 0

        for (ni in nestedList) {
            if (ni.isInteger()) {
                result += ni.getInteger()!! * (maxDepth - currDepth + 1)
            } else {
                result += getDepthSum(ni.getList()!!, maxDepth, currDepth + 1)
            }
        }

        return result
    }

    private fun getMaxDepth(nestedList: List<NestedInteger>): Int {
        var currDepths = 1
        for (ni in nestedList) {
            if (ni.isInteger()) continue

            currDepths = maxOf(currDepths, 1 + getMaxDepth(ni.getList()!!))
        }
        return currDepths
    }
}

data class NestedInteger(val num: Int? = null, val internalList: List<NestedInteger>? = null) {
    fun isInteger(): Boolean = num != null

    fun getList(): List<NestedInteger> = internalList!!

    fun getInteger(): Int = num!!
}