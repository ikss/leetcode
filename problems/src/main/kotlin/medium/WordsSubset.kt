package medium

/**
 * You are given two string arrays words1 and words2.
 *
 * A string b is a subset of string a if every letter in b occurs in a including multiplicity.
 *
 * * For example, "wrr" is a subset of "warrior" but is not a subset of "world".
 *
 * A string a from words1 is universal if for every string b in words2, b is a subset of a.
 *
 * Return an array of all the universal strings in words1. You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/word-subsets/)
 */
object WordsSubset {
    fun wordSubsetsMap(words1: Array<String>, words2: Array<String>): List<String> {
        val result = mutableListOf<String>()
        val secondHash = joinHashes(words2)
        for (w in words1) {
            val hash = getHash(w)
            if (checkHash(secondHash, hash)) {
                result.add(w)
            }
        }
        return result
    }

    private fun joinHashes(words2: Array<String>): Map<Char, Int> {
        val result = mutableMapOf<Char, Int>()
        for (word in words2) {
            val hash = getHash(word)
            for (e in hash) {
                val count = result.getOrDefault(e.key, 0)
                result[e.key] = maxOf(e.value, count)
            }
        }
        return result
    }

    private fun checkHash(secondHash: Map<Char, Int>, hash: Map<Char, Int>): Boolean {
        for (entries in secondHash) {
            val count = hash[entries.key]
            if (count == null || count < entries.value) {
                return false
            }
        }
        return true
    }

    private fun getHash(word: String): Map<Char, Int> {
        val occurrencesMap = mutableMapOf<Char, Int>()
        for (c in word) {
            val count = occurrencesMap.getOrDefault(c, 0)
            occurrencesMap[c] = count + 1
        }
        return occurrencesMap
    }

    fun wordSubsetsArray(words1: Array<String>, words2: Array<String>): List<String> {
        val universalHash = IntArray(26)
        for (w2 in words2) {
            val w2hash = getHashArray(w2)
            for (i in universalHash.indices) {
                universalHash[i] = maxOf(universalHash[i], w2hash[i])
            }
        }

        val result = ArrayList<String>()

        for (w1 in words1) {
            val w1hash = getHashArray(w1)
            var fit = true
            for (i in universalHash.indices) {
                if (universalHash[i] > w1hash[i]) {
                    fit = false
                    break
                }
            }
            if (fit) result.add(w1)
        }

        return result
    }

    private fun getHashArray(word: String): IntArray {
        val hash = IntArray(26)
        for (c in word) {
            hash[c - 'a']++
        }
        return hash
    }
}
