package design.easy

/**
 * Design a data structure that accepts a stream of integers and checks if it has a pair of integers that sum up to a particular value.
 *
 * Implement the TwoSum class:
 * * TwoSum() Initializes the TwoSum object, with an empty array initially.
 * * void add(int number) Adds number to the data structure.
 * * boolean find(int value) Returns true if there exists any pair of numbers whose sum is equal to value,
 * otherwise, it returns false.
 *
 * [URL](https://leetcode.com/problems/design-parking-system/)
 */
object TwoSumIIIDataStructureDesign {
    class TwoSum() {
        private val map = HashMap<Int, Boolean>()

        fun add(number: Int) {
            if (number in map) {
                map[number] = true
            } else {
                map[number] = false
            }
        }

        fun find(value: Int): Boolean {
            for ((k, v) in map) {
                val search = value - k

                if ((search == k && v) || (search != k && search in map)) {
                    return true
                }
            }
            return false
        }

    }
}