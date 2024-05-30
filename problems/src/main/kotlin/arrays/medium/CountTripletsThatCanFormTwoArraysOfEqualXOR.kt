package arrays.medium


/**
 * Given an array of integers arr.
 *
 * We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).
 *
 * Let's define a and b as follows:
 * * `a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]`
 * * `b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]`
 *
 * Note that ^ denotes the bitwise-xor operation.
 *
 * Return the number of triplets (i, j and k) Where a == b.
 *
 * [URL](https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/)
 */
object CountTripletsThatCanFormTwoArraysOfEqualXOR {
    fun countTriplets(arr: IntArray): Int {
        val size = arr.size
        var count = 0
        var prefix = 0

        val countMap = HashMap<Int, Int>()
        countMap[0] = 1
        val totalMap = HashMap<Int, Int>()

        for (i in 0 until size) {
            prefix = prefix xor arr[i]

            count += countMap.getOrDefault(prefix, 0) * i - totalMap.getOrDefault(prefix, 0)

            totalMap[prefix] = totalMap.getOrDefault(prefix, 0) + i + 1
            countMap[prefix] = countMap.getOrDefault(prefix, 0) + 1
        }

        return count
    }
}
