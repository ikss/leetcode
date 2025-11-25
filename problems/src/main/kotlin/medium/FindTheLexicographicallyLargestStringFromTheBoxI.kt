package medium

/**
 * You are given a string word, and an integer numFriends.
 *
 * Alice is organizing a game for her numFriends friends.
 * There are multiple rounds in the game, where in each round:
 * * word is split into numFriends non-empty strings, such that no previous round has had the exact same split.
 * * All the split words are put into a box.
 *
 * Find the lexicographically largest string from the box after all the rounds are finished.
 *
 * [URL](https://leetcode.com/problems/find-the-lexicographically-largest-string-from-the-box-i/)
 */
object FindTheLexicographicallyLargestStringFromTheBoxI {
    fun answerString(word: String, numFriends: Int): String {
        if (numFriends == 1) return word
        val largest = word.length - (numFriends - 1)

        var result = ""
        for (i in 0 until word.length) {
            val possibleSub = word.substring(i, minOf(i + largest, word.length))

            if (possibleSub > result) {
                result = possibleSub
            }
        }

        return result
    }
}