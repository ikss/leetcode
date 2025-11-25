package easy

/**
 * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their
 * binary representation and in case of two or more integers have the same number
 * of 1's you have to sort them in ascending order.
 *
 * Return the array after sorting it.
 *
 * [URL](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/)
 */
object SortIntegersByTheNumberOf1Bits {
    fun sortByBits(arr: IntArray): IntArray {
        return arr.sortedWith { i1, i2 ->
            val c1 = i1.countOneBits()
            val c2 = i2.countOneBits()
            if (c1 == c2) i1.compareTo(i2) else c1.compareTo(c2)
        }.toIntArray()
    }
}
