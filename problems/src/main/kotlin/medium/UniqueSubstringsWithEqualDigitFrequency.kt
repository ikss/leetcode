package medium

/**
 * Given a digit string s, return the number of unique substrings of s where every digit appears the same number of times.
 *
 * [URL](https://leetcode.com/problems/unique-substrings-with-equal-digit-frequency/)
 */
object UniqueSubstringsWithEqualDigitFrequency {

    fun equalDigitFrequency(s: String): Int {
        val root = TrieNode()
        var result = 0

        for (start in s.indices) {
            var currentNode: TrieNode = root
            val digitFrequency = IntArray(10)
            var uniqueDigitsCount = 0
            var maxDigitFrequency = 0

            // Extend the substring from 'start' to different end positions
            for (end in start..<s.length) {
                val currentDigit = s[end] - '0'

                // Update digit frequency and unique digits count
                if (digitFrequency[currentDigit]++ == 0) {
                    uniqueDigitsCount++
                }
                maxDigitFrequency = maxOf(maxDigitFrequency, digitFrequency[currentDigit])

                if (currentNode.children[currentDigit] == null) {
                    currentNode.children[currentDigit] = TrieNode() // Add new node for the digit
                }
                currentNode = currentNode.children[currentDigit]!! // Move to the child node

                // Check if the substring is valid
                if (uniqueDigitsCount * maxDigitFrequency == end - start + 1 && !currentNode.isVisited) {
                    result++
                    currentNode.isVisited = true
                }
            }
        }
        return result
    }

    class TrieNode {
        var children: Array<TrieNode?> = arrayOfNulls(10)
        var isVisited: Boolean = false
    }
}