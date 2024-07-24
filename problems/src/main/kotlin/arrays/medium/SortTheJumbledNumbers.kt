package arrays.medium

/**
 * You are given a 0-indexed integer array mapping which represents the mapping rule of a shuffled decimal system.
 * `mapping[i] = j` means digit i should be mapped to digit j in this system.
 *
 * The mapped value of an integer is the new integer obtained by replacing each occurrence of digit i in the integer
 * with` mapping[i]` for all 0 <= i <= 9.
 *
 * You are also given another integer array nums. Return the array nums sorted in non-decreasing order based on
 * the mapped values of its elements.
 *
 * Notes:
 * * Elements with the same mapped values should appear in the same relative order as in the input.
 * * The elements of nums should only be sorted based on their mapped values and not be replaced by them.
 *
 * [URL](https://leetcode.com/problems/sort-the-jumbled-numbers/)
 */
object SortTheJumbledNumbers {
    fun sortJumbled(mapping: IntArray, nums: IntArray): IntArray {
        val mapped = mapNumbers(mapping, nums)

        return nums.sortedWith { n1, n2 -> mapped[n1]!!.compareTo(mapped[n2]!!) }.toIntArray()
    }

    private fun mapNumbers(mapping: IntArray, nums: IntArray): HashMap<Int, Int> {
        val result = HashMap<Int, Int>(nums.size)

        for (n in nums) {
            var map = 0
            var temp = n
            var place = 1

            if (temp == 0) {
                result[n] = mapping[0]
                continue
            }

            while (temp != 0) {
                map += place * mapping[temp % 10]
                place *= 10
                temp /= 10
            }
            result[n] = map
        }

        return result
    }
}
