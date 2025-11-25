package easy

/**
 * We can represent a sentence as an array of words, for example, the sentence "I am happy with leetcode" can be
 * represented as `arr = ["I","am",happy","with","leetcode"]`.
 *
 * Given two sentences sentence1 and sentence2 each represented as a string array and given an array of string pairs
 * similarPairs where `similarPairs[i] = [xi, yi]` indicates that the two words xi and yi are similar.
 *
 * Return true if sentence1 and sentence2 are similar, or false if they are not similar.
 *
 * Two sentences are similar if:
 * * They have the same length (i.e., the same number of words)
 * * sentence1[i] and sentence2[i] are similar.
 *
 * Notice that a word is always similar to itself, also notice that the similarity relation is not transitive. For
 * example, if the words a and b are similar, and the words b and c are similar, a and c are not necessarily similar.
 *
 * [URL](https://leetcode.com/problems/sentence-similarity/)
 */
object SentenceSimilarity {
    fun areSentencesSimilar(
        sentence1: Array<String>,
        sentence2: Array<String>,
        similarPairs: List<List<String>>,
    ): Boolean {
        if (sentence1.size != sentence2.size) return false
        val similarities = HashMap<String, HashSet<String>>()

        for ((w1, w2) in similarPairs) {
            similarities.computeIfAbsent(w1) { HashSet() }.add(w2)
            similarities.computeIfAbsent(w2) { HashSet() }.add(w1)
        }

        for (i in sentence1.indices) {
            val w1 = sentence1[i]
            val w2 = sentence2[i]
            if (w1 != w2 && w1 !in similarities.getOrDefault(w2, emptySet())) {
                return false
            }
        }

        return true
    }
}