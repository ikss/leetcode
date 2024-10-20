package strings.medium

/**
 * You are given a string target.
 *
 * Alice is going to type target on her computer using a special keyboard that has only two keys:
 * * Key 1 appends the character "a" to the string on the screen.
 * * Key 2 changes the last character of the string on the screen to its next character in the English alphabet.
 * For example, "c" changes to "d" and "z" changes to "a".
 *
 * Note that initially there is an empty string "" on the screen, so she can only press key 1.
 *
 * Return a list of all strings that appear on the screen as Alice types target, in the order they appear, using the minimum key presses.
 *
 * [URL](https://leetcode.com/problems/find-the-sequence-of-strings-appeared-on-the-screen/)
 */
object FindTheSequenceOfStringsAppearedOnTheScreen {
    fun stringSequence(target: String): List<String> {
        val result = ArrayList<String>()
        var curr = 0

        var currStr = ""
        while (curr < target.length) {
            for (i in 0 .. target[curr] - 'a') {
                result.add(currStr + ('a' + i))
            }

            currStr = target.substring(0, ++curr)
        }

        return result
    }
}
