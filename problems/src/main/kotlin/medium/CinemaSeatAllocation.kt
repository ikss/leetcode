package medium


/**
 * A cinema has n rows of seats, numbered from 1 to n. Each row has 10 seats, numbered from 1 to 10.
 *
 * You are given a 2D integer array reservedSeats, where `reservedSeats[i] = [rowi, seati]`
 * means that seat seati in row rowi is already reserved.
 *
 * A four-person group must be assigned to four seats in the same row. The group can be seated in one of the following seat blocks:
 *
 * seats 2, 3, 4, 5
 * seats 4, 5, 6, 7
 * seats 6, 7, 8, 9
 * A block can be used only if none of its seats are reserved. Each seat can be assigned to at most one group.
 *
 * Return an integer denoting the maximum number of four-person groups that can be assigned.
 *
 * [URL](https://leetcode.com/problems/cinema-seat-allocation/)
 */
object CinemaSeatAllocation {
    fun maxNumberOfFamilies(n: Int, reservedSeats: Array<IntArray>): Int {
        val left = 240
        val middle = 195
        val right = 15

        val occupied = HashMap<Int, Int>()
        for ((row, seat) in reservedSeats) {
            if (seat in 2..9) {
                val value = occupied.getOrDefault(row, 0) or (1 shl (seat - 2))
                occupied[row] = value
            }
        }

        var result = (n - occupied.size) * 2
        for (mask in occupied.values) {
            if ((mask or left) == left || (mask or middle) == middle || (mask or right) == right) {
                ++result
            }
        }
        return result
    }
}
