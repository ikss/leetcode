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
    class UndergroundSystem {
        val activeCheckins = HashMap<Int, Pair<String, Int>>()
        val average = HashMap<Pair<String, String>, Pair<Double, Int>>()

        fun checkIn(id: Int, stationName: String, t: Int) {
            activeCheckins[id] = stationName to t
        }

        fun checkOut(id: Int, stationName: String, t: Int) {
            val (start, startT) = activeCheckins[id]!!
            val oldVal = average.computeIfAbsent(start to stationName) { 0.0 to 0 }
            val newCount = oldVal.second + 1
            average[start to stationName] = ((oldVal.first * oldVal.second) + (t - startT)) / newCount to newCount
        }

        fun getAverageTime(startStation: String, endStation: String): Double {
            val times = average[startStation to endStation]!!
            return times.first
        }
    }
}