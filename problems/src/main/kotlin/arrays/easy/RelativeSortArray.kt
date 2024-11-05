package arrays.easy

/**
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 *
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
 * Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
 *
 * [URL](https://leetcode.com/problems/relative-sort-array/)
 */
object RelativeSortArray {

    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val maxElement = arr1.max()
        val count = IntArray(maxElement + 1)

        for (element in arr1) {
            count[element]++
        }

        val result = ArrayList<Int>(arr1.size)
        for (value in arr2) {
            while (count[value] > 0) {
                result.add(value)
                count[value]--
            }
        }

        for (num in 0..maxElement) {
            while (count[num] > 0) {
                result.add(num)
                count[num]--
            }
        }

        return result.toIntArray()
    }
}
