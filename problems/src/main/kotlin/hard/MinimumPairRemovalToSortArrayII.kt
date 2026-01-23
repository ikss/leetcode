package hard

import java.util.PriorityQueue
import java.util.TreeMap

/**
 * Given an array nums, you can perform the following operation any number of times:
 *
 * * Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
 * * Replace the pair with their sum.
 *
 * Return the minimum number of operations needed to make the array non-decreasing.
 *
 * An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).
 *
 * [URL](https://leetcode.com/problems/minimum-pair-removal-to-sort-array-ii/)
 */
object MinimumPairRemovalToSortArrayII {
    fun minimumPairRemoval(nums: IntArray): Int {
        val indices = getWrongIndices(nums)
        if (indices.isEmpty()) return 0

        val invalidSums = HashMap<Triple<Int, Int, Long>, Int>()
        val sumQueue = PriorityQueue<Pair<Long, Pair<Int, Int>>> { p1, p2 ->
            if (p1.first != p2.first) {
                p1.first.compareTo(p2.first)
            } else {
                p1.second.first - p2.second.first
            }
        }
        val indexToNum = TreeMap<Int, Long>()
        for (i in 0 until nums.size - 1) {
            sumQueue.offer((nums[i].toLong() + nums[i + 1]) to (i to i + 1))
            indexToNum[i] = nums[i].toLong()
        }
        indexToNum[nums.size - 1] = nums.last().toLong()

        var result = 0
        while (indices.isNotEmpty()) {
            val (sum, indPair) = sumQueue.poll()
            val (left, right) = indPair
            val key = Triple(left, right, sum)
            val invalidCount = invalidSums.getOrDefault(key, 0)
            if (invalidCount > 0) {
                invalidSums[key] = invalidCount - 1
                continue
            }
            val oldValLeft = indexToNum[left]!!
            val oldValRight = indexToNum[right]!!
            indexToNum[left] = sum
            indexToNum.remove(right)
            indices.remove(left)
            indices.remove(right)

            val prev = indexToNum.lowerEntry(left)
            if (prev != null) {
                indices.remove(prev.key)
                val leftKey = Triple(prev.key, left, oldValLeft + prev.value)
                invalidSums[leftKey] = invalidSums.getOrDefault(leftKey, 0) + 1
                sumQueue.offer((prev.value + sum) to (prev.key to left))
                if (prev.value > sum) {
                    indices.add(prev.key)
                }
            }

            val next = indexToNum.higherEntry(right)
            if (next != null) {
                val rightKey = Triple(right, next.key, oldValRight + next.value)
                invalidSums[rightKey] = invalidSums.getOrDefault(rightKey, 0) + 1
                sumQueue.offer((next.value + sum) to (left to next.key))
                if (next.value < sum) {
                    indices.add(left)
                }
            }
            result++
        }

        return result
    }

    private fun getWrongIndices(nums: IntArray) : HashSet<Int> {
        val result = HashSet<Int>()

        for (i in 0 until nums.size - 1) {
            if (nums[i] > nums[i + 1]) {
                result.add(i)
            }
        }

        return result
    }
}
