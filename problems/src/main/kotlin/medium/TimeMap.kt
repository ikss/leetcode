package medium

import java.util.*

/**
 * Design a time-based key-value data structure that can store multiple values for the same key at different timestamps
 * and retrieve the key's value at a certain timestamp.
 *
 * Implement the TimeMap class:
 * * TimeMap() Initializes the object of the data structure.
 * * void set(String key, String value, int timestamp) Stores the key _key_ with the value _value_ at the given time timestamp.
 * * String get(String key, int timestamp) Returns a value such that set was called previously,
 * with timestamp_prev <= timestamp. If there are multiple such values,
 * it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
 *
 * [URL](https://leetcode.com/problems/time-based-key-value-store/)
 */
class TimeMap {
    private val map = mutableMapOf<String, TreeMap<Int, String>>()

    fun set(key: String, value: String, timestamp: Int) {
        map.getOrPut(key) { TreeMap<Int, String>() }[timestamp] = value
    }

    fun get(key: String, timestamp: Int): String {
        return map[key]?.floorEntry(timestamp)?.value ?: ""
    }
}