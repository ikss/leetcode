package design.medium

/**
 * Implement the RandomizedSet class:
 * * RandomizedSet() Initializes the RandomizedSet object.
 * * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * * int getRandom() Returns a random element from the current set of elements
 * (it's guaranteed that at least one element exists when this method is called).
 * Each element must have the same probability of being returned.
 *
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 *
 * [URL](https://leetcode.com/problems/insert-delete-getrandom-o1/)
 */
object `InsertDeleteGetRandom_O(1)` {
    class RandomizedSet {
        private val random = java.util.Random()
        var nums = mutableListOf<Int>()
        var locs = hashMapOf<Int, Int>()

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element.  */
        fun insert(`val`: Int): Boolean {
            if (locs.containsKey(`val`)) {
                return false
            }
            locs[`val`] = nums.size
            nums.add(`val`)
            return true
        }

        /** Removes a value from the set. Returns true if the set contained the specified element.  */
        fun remove(`val`: Int): Boolean {
            val loc = locs[`val`]
                ?: return false
            if (loc < nums.size - 1) { // not the last one than swap the last one with this val
                val lastone = nums[nums.size - 1]
                nums[loc] = lastone
                locs[lastone] = loc
            }
            locs.remove(`val`)
            nums.removeAt(nums.size - 1)
            return true
        }

        /** Get a random element from the set.  */
        fun getRandom(): Int = nums[random.nextInt(nums.size)]
    }
}