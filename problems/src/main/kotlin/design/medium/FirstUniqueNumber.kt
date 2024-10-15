package design.medium

/**
 * You have a queue of integers, you need to retrieve the first unique integer in the queue.
 *
 * Implement the FirstUnique class:
 * * FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
 * * int showFirstUnique() returns the value of the first unique integer of the queue,
 * and returns -1 if there is no such integer.
 * * void add(int value) insert value to the queue.
 *
 * [URL](https://leetcode.com/problems/first-unique-number/)
 */
object FirstUniqueNumber {
    class FirstUnique(nums: IntArray) {
        private val uniques = LinkedHashSet<Int>()
        private val nonUniques = HashSet<Int>()

        init {
            for (n in nums) {
                add(n)
            }
        }

        fun showFirstUnique(): Int {
            if (uniques.isEmpty()) {
                return -1
            }
            return uniques.first()
        }

        fun add(value: Int) {
            if (nonUniques.contains(value)) return
            
            if (!uniques.add(value)) {
                nonUniques.add(value)
                uniques.remove(value)
            }
        }

    }

    /**
     * Your FirstUnique object will be instantiated and called as such:
     * var obj = FirstUnique(nums)
     * var param_1 = obj.showFirstUnique()
     * obj.add(value)
     */
}