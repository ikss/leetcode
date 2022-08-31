package strings.easy

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * [URL](https://leetcode.com/problems/longest-common-prefix/)
 */
object LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.any { it.isEmpty() }) {
            return ""
        }
        val arrays = strs.map { it.toCharArray() }
        val result = StringBuilder()

        var index = 0
        while (index < arrays[0].size) {
            val char = arrays[0][index]
            if (arrays.any { index > it.size - 1 || it[index] != char }) {
                break
            }
            result.append(char)
            index++
        }

        return result.toString()
    }
}
