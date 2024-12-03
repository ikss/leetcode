package strings.easy

/**
 * You are given a 0-indexed string s and a 0-indexed integer array spaces that describes the indices in the original
 * string where spaces will be added. Each space should be inserted before the character at the given index.
 * * For example, given s = "EnjoyYourCoffee" and `spaces = [5, 9]`, we place spaces before 'Y' and 'C', which are at
 * indices 5 and 9 respectively. Thus, we obtain "Enjoy Your Coffee".
 *
 * Return the modified string after the spaces have been added.
 *
 * [URL](https://leetcode.com/problems/adding-spaces-to-a-string/)
 */
object AddingSpacesToString {
    fun addSpaces(s: String, spaces: IntArray): String {
        var i = 0
        var nextSpace = spaces[i]
        val result = StringBuilder()
        for (stri in s.indices) {
            if (stri == nextSpace) {
                result.append(' ')
                i++
                if (spaces.size > i) {
                    nextSpace = spaces[i]
                } else {
                    nextSpace = -1
                }
            }
            result.append(s[stri])
        }

        return result.toString()
    }
}