package arrays.medium

/**
 * Given the availability time slots arrays slots1 and slots2 of two people and a meeting duration duration,
 * return the earliest time slot that works for both of them and is of duration duration.
 *
 * If there is no common time slot that satisfies the requirements, return an empty array.
 *
 * The format of a time slot is an array of two elements `[start, end]` representing an inclusive
 * time range from start to end.
 *
 * It is guaranteed that no two availability slots of the same person intersect with each other.
 * That is, for any two time slots `[start1, end1]` and `[start2, end2]` of the same person, either
 * start1 > end2 or start2 > end1.
 *
 * [URL](https://leetcode.com/problems/meeting-scheduler/)
 */
object MeetingScheduler {
    fun minAvailableDuration(slots1: Array<IntArray>, slots2: Array<IntArray>, duration: Int): List<Int> {
        slots1.sortBy { it[0] }
        slots2.sortBy { it[0] }

        var p1 = 0
        var p2 = 0

        while (p1 < slots1.size && p2 < slots2.size) {
            val slot1 = slots1[p1]
            val slot2 = slots2[p2]
            val leftBound = maxOf(slot1[0], slot2[0])
            val rightBound = minOf(slot1[1], slot2[1])

            if (rightBound - leftBound >= duration) {
                return listOf(leftBound, leftBound + duration)
            }

            if (slot1[1] < slot2[1]) {
                p1++
            } else {
                p2++
            }
        }
        return emptyList()
    }
}
