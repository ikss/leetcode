package hard

import java.util.*


/**
 * You are given a 0-indexed array of integers nums of length n, and two positive integers k and dist.
 *
 * The cost of an array is the value of its first element.
 * For example, the cost of `[1,2,3]` is 1 while the cost of `[3,4,1]` is 3.
 *
 * You need to divide nums into k disjoint contiguous subarrays, such that the difference between the starting index of
 * the second subarray and the starting index of the kth subarray should be less than or equal to dist.
 * In other words, if you divide nums into the subarrays `nums[0..(i1 - 1)], nums[i1..(i2 - 1)], ..., nums[ik-1..(n - 1)]`,
 * then ik-1 - i1 <= dist.
 *
 * Return the minimum possible sum of the cost of these subarrays.
 *
 * [URL](https://leetcode.com/problems/adding-spaces-to-a-string/)
 */
object DivideArrayIntoSubarraysWithMinimumCostII {
    fun minimumCostMaxHeap(nums: IntArray, k: Int, dist: Int): Long {
        var result = Long.MAX_VALUE

        for (i in 1 until nums.size - (k - 2)) {
            val midRes = calcResult(nums, k, dist, i)
            result = minOf(result, midRes)
        }

        return result + nums[0]
    }

    private fun calcResult(nums: IntArray, k: Int, dist: Int, start: Int): Long {
        var result = nums[start].toLong()

        val queue = PriorityQueue<Int>(compareByDescending { it })

        for (i in start + 1 .. minOf(start + dist, nums.size - 1)) {
            queue.offer(nums[i])
            if (queue.size > k - 2) {
                queue.poll()
            }
        }

        while (queue.isNotEmpty()) {
            result += queue.poll()
        }

        return result
    }

    class Container(private val k: Int) {
        private var st1Size = 0
        private var st2Size = 0

        private val st1 = TreeMap<Int, Int>()
        private val st2 = TreeMap<Int, Int>()
        internal var sm = 0L

        private fun removeOne(map: TreeMap<Int, Int>, key: Int) {
            val count = map[key]!!
            if (count == 1) {
                map.remove(key)
            } else {
                map[key] = count - 1
            }
        }

        private fun addOne(map: TreeMap<Int, Int>, key: Int) {
            map[key] = map.getOrDefault(key, 0) + 1
        }

        private fun adjust() {
            while (st1Size < k && st2.isNotEmpty()) {
                val x = st2.firstKey()!!
                addOne(st1, x)
                st1Size++
                sm += x.toLong()
                removeOne(st2, x)
                st2Size--
            }
            while (st1Size > k) {
                val x = st1.lastKey()!!
                addOne(st2, x)
                st2Size++
                removeOne(st1, x)
                st1Size--
                sm -= x.toLong()
            }
        }

        // insert element x
        fun add(x: Int) {
            if (st2.isNotEmpty() && x >= st2.firstKey()!!) {
                addOne(st2, x)
                st2Size++
            } else {
                addOne(st1, x)
                st1Size++
                sm += x
            }
            adjust()
        }

        // delete element x
        fun erase(x: Int) {
            if (st1.containsKey(x)) {
                removeOne(st1, x)
                st1Size--
                sm -= x
            } else if (st2.containsKey(x)) {
                removeOne(st2, x)
                st2Size--
            }
            adjust()
        }
    }

    fun minimumCostTwoHeaps(nums: IntArray, k: Int, dist: Int): Long {
        val n = nums.size
        val cnt = Container(k - 2)
        for (i in 1..<k - 1) {
            cnt.add(nums[i])
        }

        var result = cnt.sm + nums[k - 1]
        for (i in k..<n) {
            val j = i - dist - 1
            if (j > 0) {
                cnt.erase(nums[j])
            }
            cnt.add(nums[i - 1])
            result = minOf(result, cnt.sm + nums[i])
        }

        return result + nums[0]
    }
}