package easy

/**
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 *
 * [URL](https://leetcode.com/problems/reverse-words-in-a-string-iii/)
 */
object ReverseWordsInStringIII {
    fun reverseWords(s: String): String {
        val arr = s.toCharArray()

        var start = 0
        for (i in arr.indices) {
            if (arr[i] == ' ') {
                reverse(arr, start, i - 1)
                start = i + 1
            }
        }
        if (start != arr.size - 1) {
            reverse(arr, start, arr.size - 1)
        }
        return String(arr)
    }

    private fun reverse(arr: CharArray, start: Int, end: Int) {
        var left = start
        var right = end
        while (left < right) {
            val tmp = arr[left]
            arr[left++] = arr[right]
            arr[right--] = tmp
        }
    }
}
