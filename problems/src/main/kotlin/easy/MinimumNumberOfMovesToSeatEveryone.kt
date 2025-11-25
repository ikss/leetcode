package easy

/**
 * There are n seats and n students in a room. You are given an array seats of length n,
 * where `seats[i]` is the position of the ith seat. You are also given the array students of length n,
 * where `students[j]` is the position of the jth student.
 *
 * You may perform the following move any number of times:
 *
 * Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1)
 * Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.
 *
 * Note that there may be multiple seats or students in the same position at the beginning.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/)
 */
object MinimumNumberOfMovesToSeatEveryone {
    fun minMovesToSeatSort(seats: IntArray, students: IntArray): Int {
        seats.sort()
        students.sort()

        var result = 0

        for (i in seats.indices) {
            result += Math.abs(seats[i] - students[i])
        }

        return result
    }

    fun minMovesToSeatCountSort(seats: IntArray, students: IntArray): Int {
        val maxPosition = findMax(seats, students)

        val differences = IntArray(maxPosition)

        for (i in seats.indices) {
            differences[seats[i] - 1]++
            differences[students[i] - 1]--
        }

        var moves = 0
        var unmatched = 0
        for (difference in differences) {
            moves += Math.abs(unmatched)
            unmatched += difference
        }

        return moves
    }

    private fun findMax(seats: IntArray, students: IntArray): Int {
        var result = 0
        for (i in seats.indices) {
            result = maxOf(result, seats[i], students[i])
        }
        return result
    }
}
