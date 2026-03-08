package medium

import java.util.*

/**
 * You are given several logs, where each log contains a unique ID and timestamp.
 * Timestamp is a string that has the following format: Year:Month:Day:Hour:Minute:Second, for example,
 * 2017:01:01:23:59:59. All domains are zero-padded decimal numbers.
 *
 * Implement the LogSystem class:
 *
 * * LogSystem() Initializes the LogSystem object.
 * * void put(int id, string timestamp) Stores the given log (id, timestamp) in your storage system.
 * * int[] retrieve(string start, string end, string granularity) Returns the IDs of the logs whose timestamps are within
 * the range from start to end inclusive. start and end all have the same format as timestamp,
 * and granularity means how precise the range should be (i.e. to the exact Day, Minute, etc.).
 * For example, start = "2017:01:01:23:59:59", end = "2017:01:02:23:59:59", and granularity = "Day" means that we need
 * to find the logs within the inclusive range from Jan. 1st 2017 to Jan. 2nd 2017, and the Hour, Minute, and Second
 * for each log entry can be ignored.
 *
 *
 * [URL](https://leetcode.com/problems/design-log-storage-system/)
 */
object DesignLogStorageSystem {
    class LogSystem {
        val map = TreeMap<Long, HashSet<Int>>()

        fun put(id: Int, timestamp: String) {
            val st = timestamp.split(':').map { it.toInt() }.toIntArray()
            val num = convert(st)

            map.computeIfAbsent(num) { HashSet() }.add(id)
        }

        fun convert(st: IntArray): Long {
            st[1] = st[1] - (if (st[1] == 0) 0 else 1)
            st[2] = st[2] - (if (st[2] == 0) 0 else 1)
            val num =
                (st[0] - 1999L) * (31 * 12) * 24 * 60 * 60 + st[1] * 31 * 24 * 60 * 60 + st[2] * 24 * 60 * 60 + st[3] * 60 * 60 + st[4] * 60 + st[5]

            return num
        }

        fun retrieve(s: String, e: String, gra: String): MutableList<Int> {
            val res = ArrayList<Int>()
            val start = granularity(s, gra, false)
            val end = granularity(e, gra, true)
            for ((key, value) in map.tailMap(start)) {
                if (key!! >= start && key < end) res.addAll(value)
            }
            return res
        }

        val h = mapOf(
            "Year" to 0,
            "Month" to 1,
            "Day" to 2,
            "Hour" to 3,
            "Minute" to 4,
            "Second" to 5,
        )

        fun granularity(s: String, gra: String, end: Boolean): Long {
            val res = arrayOf("1999", "00", "00", "00", "00", "00")
            val st = s.split(':')
            for (i in 0..h[gra]!!) {
                res[i] = st[i]
            }
            val t = res.map { it.toInt() }.toIntArray()
            if (end) t[h[gra]!!]++
            return convert(t)
        }
    }
}
