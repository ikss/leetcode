package design.medium

/**
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 *
 * Implement the WordDictionary class:
 * * WordDictionary() Initializes the object.
 * * void addWord(word) Adds word to the data structure, it can be matched later.
 * * bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise.
 * word may contain dots '.' where dots can be matched with any letter.
 *
 * [URL](https://leetcode.com/problems/design-add-and-search-words-data-structure/)
 */
object DesignUndergroundSystem {
    class UndergroundSystem() {
        private val activeCheckins = HashMap<Int, Pair<String, Int>>()
        private val average = HashMap<String, HashMap<String, ArrayList<Int>>>()

        fun checkIn(id: Int, stationName: String, t: Int) {
            activeCheckins[id] = stationName to t
        }

        fun checkOut(id: Int, stationName: String, t: Int) {
            val (start, startT) = activeCheckins[id]!!
            average.computeIfAbsent(start) { hashMapOf() }.computeIfAbsent(stationName) { arrayListOf() }
                .add(t - startT)
        }

        fun getAverageTime(startStation: String, endStation: String): Double {
            val times = average[startStation]!![endStation]!!
            return times.average()
        }

    }
}