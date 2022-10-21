package strings.medium

import java.util.*

/**
 * Given an array of strings words and an integer k, return the k most frequent strings.
 *
 * Return the answer sorted by the frequency from highest to lowest.
 * Sort the words with the same frequency by their lexicographical order.
 *
 * [URL](https://leetcode.com/problems/top-k-frequent-words/)
 */
object TopKFrequentWords {
    fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val map = words.groupingBy { it }.eachCount()
        val queue = PriorityQueue<Pair<String, Int>> { p1, p2 ->
            val res = p1.second.compareTo(p2.second)
            if (res != 0) res else p1.first.compareTo(p2.first)
        }
        val pq: PriorityQueue<Pair<String, Int>> = PriorityQueue { a, b ->
            if (a.second == b.second) b.first.compareTo(a.first) else a.second - b.second
        }

        for (entry in map.entries) {
            pq.offer(entry.key to entry.value)
            if (pq.size > k) pq.poll()
        }
        val result = LinkedList<String>()
        while (!pq.isEmpty()) result.add(0, pq.poll().first)

        return result
    }
}