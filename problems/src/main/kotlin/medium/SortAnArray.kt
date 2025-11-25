package medium

/**
 * Given an array of integers nums, sort the array in ascending order and return it.
 *
 * You must solve the problem without using any built-in functions in O(nlog(n))
 * time complexity and with the smallest space complexity possible.
 *
 * [URL](https://leetcode.com/problems/sort-an-array/)
 */
object SortAnArray {

    fun sortArray(nums: IntArray): IntArray {
        val temporaryArray = IntArray(nums.size)
        mergeSort(nums, 0, nums.size - 1, temporaryArray)
        return nums
    }

    // Recursive function to sort an array using merge sort
    private fun mergeSort(arr: IntArray, left: Int, right: Int, tempArr: IntArray) {
        if (left >= right) {
            return
        }
        val mid = left + (right - left) / 2
        // Sort first and second halves recursively.
        mergeSort(arr, left, mid, tempArr)
        mergeSort(arr, mid + 1, right, tempArr)
        // Merge the sorted halves.
        merge(arr, left, mid, right, tempArr)
    }

    // Function to merge two sub-arrays in sorted order.
    private fun merge(arr: IntArray, left: Int, mid: Int, right: Int, tempArr: IntArray) {
        // Calculate the start and sizes of two halves.
        val start2 = mid + 1
        val n1 = mid - left + 1
        val n2 = right - mid

        // Copy elements of both halves into a temporary array.
        for (i in 0 until n1) {
            tempArr[left + i] = arr[left + i]
        }
        for (i in 0 until n2) {
            tempArr[start2 + i] = arr[start2 + i]
        }

        // Merge the sub-arrays 'in tempArray' back into the original array 'arr' in sorted order.
        var i = 0
        var j = 0
        var k = left
        while (i < n1 && j < n2) {
            if (tempArr[left + i] <= tempArr[start2 + j]) {
                arr[k] = tempArr[left + i]
                i += 1
            } else {
                arr[k] = tempArr[start2 + j]
                j += 1
            }
            k += 1
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = tempArr[left + i]
            i += 1
            k += 1
        }
        while (j < n2) {
            arr[k] = tempArr[start2 + j]
            j += 1
            k += 1
        }
    }
}
