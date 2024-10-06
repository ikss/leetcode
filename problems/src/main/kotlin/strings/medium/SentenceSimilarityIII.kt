package strings.medium

/**
 * You are given two strings sentence1 and sentence2, each representing a sentence composed of words. A sentence is a
 * list of words that are separated by a single space with no leading or trailing spaces. Each word consists of only
 * uppercase and lowercase English characters.
 *
 * Two sentences s1 and s2 are considered similar if it is possible to insert an arbitrary sentence (possibly empty)
 * inside one of these sentences such that the two sentences become equal. Note that the inserted sentence must be
 * separated from existing words by spaces.
 *
 * For example,
 * * s1 = "Hello Jane" and s2 = "Hello my name is Jane" can be made equal by inserting "my name is" between "Hello" and
 * "Jane" in s1.
 * * s1 = "Frog cool" and s2 = "Frogs are cool" are not similar, since although there is a sentence "s are" inserted into
 * s1, it is not separated from "Frog" by a space.
 *
 * Given two sentences sentence1 and sentence2, return true if sentence1 and sentence2 are similar.
 * Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/group-anagrams/)
 */
object SentenceSimilarityIII {
    fun areSentencesSimilar(sentence1: String, sentence2: String): Boolean {
        if (sentence1.length > sentence2.length) {
            return areSentencesSimilar(sentence2, sentence1)
        }
        val words1 = sentence1.split(' ')
        val words2 = sentence2.split(' ')

        var start = 0
        var end = 0
        val n = words1.size

        while (start < n && words1[start] == words2[start]) {
            start++
        }
        while (n > end && words1[n - 1 - end] == words2[words2.size - 1 - end]) {
            end++
        }
        return start >= (n - end)
    }
}