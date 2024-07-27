package design.hard

import java.util.*

/**
 * Design a search autocomplete system for a search engine. Users may input a sentence(at least one word and end with a
 * special character '#').
 *
 * You are given a string array sentences and an integer array times both of length n where `sentences[i]` is a
 * previously typed sentence and `times[i]` is the corresponding number of times the sentence was typed. For each input
 * character except '#', return the top 3 historical hot sentences that have the same prefix as the part of the sentence
 * already typed.
 *
 * Here are the specific rules:
 *
 * * The hot degree for a sentence is defined as the number of times a user typed the exactly same sentence before.
 * * The returned top 3 hot sentences should be sorted by hot degree (The first is the hottest one).
 * If several sentences have the same hot degree, use ASCII-code order (smaller one appears first).
 * * If less than 3 hot sentences exist, return as many as you can.
 * * When the input is a special character, it means the sentence ends, and in this case, you need to return an empty list.
 *
 * Implement the AutocompleteSystem class:
 * * AutocompleteSystem(String[] sentences, int[] times) Initializes the object with the sentences and times arrays.
 * * List<String> input(char c) This indicates that the user typed the character c.
 * * Returns an empty array [] if c == '#' and stores the inputted sentence in the system.
 * * Returns the top 3 historical hot sentences that have the same prefix as the part of the sentence already typed.
 * If there are fewer than 3 matches, return them all.
 *
 * [URL](https://leetcode.com/problems/design-search-autocomplete-system/)
 */
object DesignSearchAutocompleteSystem {
    class AutocompleteSystem(sentences: Array<String>, times: IntArray) {
        private val trie = Trie()
        private val input = StringBuilder()
        private var currNode: Trie.TrieNode? = trie.root

        init {
            for (i in sentences.indices) {
                trie.addWord(sentences[i], times[i])
            }
        }

        fun input(c: Char): List<String> {
            if (c == '#') {
                trie.addWord(input.toString(), 1, true)
                input.setLength(0)
                currNode = trie.root
                return emptyList()
            }
            input.append(c)
            currNode = currNode?.getNode(c)

            return currNode?.getWords() ?: emptyList()
        }

        class Trie {
            class TrieNode(val c: Char, var word: String? = null, var rank: Int = 0) {
                val map = HashMap<Char, TrieNode>()

                fun addNext(c: Char): TrieNode {
                    return map.computeIfAbsent(c) { TrieNode(c) }
                }

                fun getNode(c: Char): TrieNode? {
                    return map[c]
                }

                fun getWords(): List<String> {
                    val queue = java.util.ArrayDeque<TrieNode>()
                    queue.offer(this)
                    val pq = PriorityQueue<Pair<Int, String>> { i1, i2 ->
                        if (i1.first == i2.first) i2.second.compareTo(i1.second) else i1.first.compareTo(i2.first)
                    }

                    while (queue.isNotEmpty()) {
                        val curr = queue.poll()
                        if (curr.word != null) {
                            pq.offer(curr.rank to curr.word!!)
                            if (pq.size > 3) pq.poll()
                        }
                        for (node in curr.map.values) {
                            queue.offer(node)
                        }
                    }
                    val result = ArrayList<String>(3)
                    while (pq.isNotEmpty()) {
                        result.add(0, pq.poll().second)
                    }
                    return result
                }
            }

            val root = TrieNode('_')

            fun addWord(s: String, rank: Int, inc: Boolean = false) {
                var node = root
                for (i in s.indices) {
                    node = node.addNext(s[i])
                }
                node.word = s
                if (inc) node.rank += 1 else node.rank = rank
            }
        }
    }
}