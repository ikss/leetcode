package strings.medium


/**
 * You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr
 * that has unique characters.
 *
 * Return the maximum possible length of s.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements
 * without changing the order of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/)
 */
object MaximumLengthOfConcatenatedStringWithUniqueCharacters {
    var result = 0

    fun maxLengthRecursion(arr: List<String>): Int {
        result = 0
        recursionHelper(arr, "", 0)
        return result
    }

    private fun recursionHelper(arr: List<String>, unique: String, index: Int) {
        val isUnique = checkUnique(unique)

        if (isUnique) {
            result = maxOf(result, unique.length)
        }

        if (!isUnique || index == arr.size) {
            return
        }

        for (i in index until arr.size) {
            recursionHelper(arr, unique + arr[i], index + 1)
        }
    }

    private fun checkUnique(unique: String): Boolean {
        val set = hashSetOf<Char>()
        for (c in unique) {
            if (!set.add(c)) {
                return false
            }
        }
        return true
    }

    fun maxLengthDp(arr: List<String>): Int {
        val dp = mutableListOf(0)
        var res = 0
        for (s in arr) {
            var a = 0
            var dup = 0
            for (c in s) {
                val shift = 1 shl c - 'a'
                dup = dup or (a and shift)
                a = a or shift
            }
            if (dup > 0) continue
            for (i in dp.indices.reversed()) {
                val element = dp[i]
                if (element and a > 0) continue
                dp.add(element or a)
                res = maxOf(res, Integer.bitCount(element or a))
            }
        }
        return res
    }
}
