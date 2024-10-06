package strings.medium

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
 * * `sentence1[i] and sentence2[i]` are similar.
 *
 * Notice that a word is always similar to itself, also notice that the similarity relation is transitive.
 * For example, if the words a and b are similar, and the words b and c are similar, then a and c are similar.
 *
 * [URL](https://leetcode.com/problems/sentence-similarity-ii/)
 */
object SentenceSimilarityII {
    private class UnionFind {
        val parent = HashMap<String, String>()
        val rank = HashMap<String, Int>()

        fun addWord(w: String) {
            if (parent.contains(w)) return
            parent[w] = w
            rank[w] = 1
        }

        fun hasWord(w: String): Boolean = parent.containsKey(w)

        fun find(w: String): String {
            if (parent[w] != w) {
                parent[w] = find(parent[w]!!)
            }
            return parent[w]!!
        }

        fun union(w1: String, w2: String) {
            val parent1 = find(w1)
            val parent2 = find(w2)

            if (parent1 == parent2) return
            val r1 = rank[parent1]!!
            val r2 = rank[parent2]!!

            if (r1 >= r2) {
                parent[parent2] = parent1
                rank[parent1] = r1 + r2
            } else {
                parent[parent1] = parent2
                rank[parent2] = r1 + r2
            }
        }
    }

    fun areSentencesSimilarTwo(
        sentence1: Array<String>,
        sentence2: Array<String>,
        similarPairs: List<List<String>>,
    ): Boolean {
        if (sentence1.size != sentence2.size) return false

        val uf = UnionFind()

        for (words in similarPairs) {
            val first = words[0]
            uf.addWord(first)
            for (i in 1 until words.size) {
                val w = words[i]
                uf.addWord(w)
                uf.union(first, w)
            }
        }

        for (i in sentence1.indices) {
            val w1 = sentence1[i]
            val w2 = sentence2[i]
            if (w1 == w2 || (uf.hasWord(w1) && uf.hasWord(w2) && uf.find(w1) == uf.find(w2))) continue
            return false
        }
        return true
    }
}