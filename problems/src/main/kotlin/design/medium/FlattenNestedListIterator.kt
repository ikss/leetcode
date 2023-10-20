package design.medium

/**
 * You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may
 * also be integers or other lists. Implement an iterator to flatten it.
 *
 * Implement the NestedIterator class:
 * * NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
 * * int next() Returns the next integer in the nested list.
 * * boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
 *
 * [URL](https://leetcode.com/problems/flatten-nested-list-iterator/)
 */
object FlattenNestedListIterator {
    class NestedInteger {
        private var _value: Int? = null
        private val list = ArrayList<NestedInteger>()

        // Constructor initializes an empty nested list.
        constructor()

        constructor(list: List<Int>) {
            this.list.addAll(list.map { NestedInteger(it) })
        }

        // Constructor initializes a single integer.
        constructor(value: Int) {
            _value = value
        }

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        fun isInteger(): Boolean = _value != null

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        fun getInteger(): Int? = _value

        // Set this NestedInteger to hold a single integer.
        fun setInteger(value: Int) {
            _value = value
            list.clear()
        }

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        fun add(ni: NestedInteger) {
            _value = null
            list.add(ni)
        }

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        fun getList(): List<NestedInteger>? = if (isInteger()) null else list
    }

    class NestedIteratorCopy(nestedList: List<NestedInteger>): Iterator<Int> {
        private val list = fillList(nestedList)
        private val iterator = list.iterator()

        private fun fillList(nestedList: List<NestedInteger>): ArrayList<Int> {
            val result = ArrayList<Int>()
            for (e in nestedList) {
                if (e.isInteger()) {
                    result.add(e.getInteger()!!)
                } else {
                    result.addAll(fillList(e.getList()!!))
                }
            }
            return result
        }

        override fun next(): Int = iterator.next()

        override fun hasNext(): Boolean = iterator.hasNext()
    }
}