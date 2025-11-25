package easy

/**
 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting
 * from the start of the string.
 *
 * If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than
 * or equal to k characters, then reverse the first k characters and leave the other as original.
 *
 * [URL](https://leetcode.com/problems/reverse-string-ii/)
 */
object ReverseStringII {
    fun reverseStr(s: String, k: Int): String {
        val arr = s.toCharArray()
        var start = 0
        while (start < arr.size) {
            var i = start
            var j = minOf(start + k - 1, arr.size - 1)
            while (i < j) {
                val tmp = arr[i]
                arr[i++] = arr[j]
                arr[j--] = tmp
            }
            start += 2 * k
        }
        return String(arr)
    }
}