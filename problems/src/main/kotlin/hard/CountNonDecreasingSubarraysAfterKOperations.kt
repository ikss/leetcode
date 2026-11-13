package hard

import java.util.PriorityQueue

/**
 * You are given an array nums of n integers and an integer k.
 *
 * For each subarray of nums, you can apply up to k operations on it. In each operation, you increment any element of the subarray by 1.
 *
 * Note that each subarray is considered independently, meaning changes made to one subarray do not persist to another.
 *
 * Return the number of subarrays that you can make non-decreasing after performing at most k operations.
 *
 * An array is said to be non-decreasing if each element is greater than or equal to its previous element, if it exists.
 *
 * [URL](https://leetcode.com/problems/count-non-decreasing-subarrays-after-k-operations/)
 */
object CountNonDecreasingSubarraysAfterKOperations {
    fun countNonDecreasingSubarrays(nums: IntArray, k: Int): Long {
        val n = nums.size
        var ans: Long = 0
        var operations: Long = 0
        // Maintain the window maximum with a priority queue
        val q = PriorityQueue<IntArray>(Comparator { a, b -> b[0] - a[0] })
        // Record the set of elements covered by this index
        val cnt = ArrayList<ArrayList<Int>>()
        for (i in 0..<n) {
            cnt.add(ArrayList())
        }
        // Index of the first greater-or-equal element to the right
        val pos = IntArray(n) { n }
        // Decreasing monotonic stack
        val st = java.util.ArrayDeque<Int>()

        var left = 0
        var right = 0
        while (right < n) {
            // Maintain the monotonic stack
            while (!st.isEmpty() && nums[right] >= nums[st.peek()!!]) {
                pos[st.peek()!!] = right
                st.pop()
            }
            // The stack top is the nearest greater element to the left of nums[right]
            if (!st.isEmpty()) {
                cnt[st.peek()!!].add(right)
            }
            st.push(right)

            // The priority queue front is the window maximum
            q.offer(intArrayOf(nums[right], right))
            // Adding nums[right] increases the operation count
            operations += maxOf(0, q.peek()!![0] - nums[right]).toLong()

            // The minimum operation count exceeds k; shrink the window
            while (operations > k) {
                // Removing nums[left] from the window decreases the operation count
                for (i in cnt[left]) {
                    // Subtract the contribution
                    operations -= (nums[left] - nums[i]).toLong() * (minOf(pos[i], right + 1) - i)
                }
                left++
            }

            // Remove elements with indices less than left from the priority queue
            while (!q.isEmpty() && q.peek()!![1] < left) {
                q.poll()
            }

            // There are right - left + 1 valid contiguous subarrays ending at right
            ans += (right - left + 1).toLong()
            right++
        }

        return ans
    }
}
