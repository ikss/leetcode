package medium

/**
 * Given two vectors of integers v1 and v2, implement an iterator to return their elements alternately.
 *
 * Implement the ZigzagIterator class:
 * * ZigzagIterator(List<int> v1, List<int> v2) initializes the object with the two vectors v1 and v2.
 * * boolean hasNext() returns true if the iterator still has elements, and false otherwise.
 * * int next() returns the current element of the iterator and moves the iterator to the next element.
 *
 * [URL](https://leetcode.com/problems/zigzag-iterator/
 */
object ZigzagIterator {
    class ZigzagIterator(val v1: IntArray, val v2: IntArray) {
        var i1 = 0
        var i2 = 0
        var first = true

        fun next(): Int {
            if ((first && i1 < v1.size) || i2 == v2.size) {
                first = false
                return v1[i1++]
            }
            first = true
            return v2[i2++]
        }

        fun hasNext(): Boolean {
            return i1 < v1.size || i2 < v2.size
        }
    }
}
