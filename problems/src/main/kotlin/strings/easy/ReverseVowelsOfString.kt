package strings.easy

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 * [URL](https://leetcode.com/problems/reverse-vowels-of-a-string/)
 */
object ReverseVowelsOfString {
    private val vowels = hashSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    fun reverseVowels(s: String): String {
        if (s.length < 2) return s

        val arr = s.toCharArray()
        var start = 0
        var end = s.length - 1

        while (end > start) {
            while (start < end && arr[start] !in vowels) {
                start++
            }

            while (end > start && arr[end] !in vowels) {
                end--
            }

            if (start == end) {
                break
            }
            val tmp = arr[start]
            arr[start++] = arr[end]
            arr[end--] = tmp
        }
        return String(arr)
    }
}