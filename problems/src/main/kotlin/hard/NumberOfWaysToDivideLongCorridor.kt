package hard

/**
 * Along a long library corridor, there is a line of seats and decorative plants.
 * You are given a 0-indexed string corridor of length n consisting of letters 'S' and 'P' where each 'S' represents
 * a seat and each 'P' represents a plant.
 *
 * One room divider has already been installed to the left of index 0, and another to the right of index n - 1.
 * Additional room dividers can be installed. For each position between indices i - 1 and i (1 <= i <= n - 1),
 * at most one divider can be installed.
 *
 * Divide the corridor into non-overlapping sections, where each section has exactly two seats with any number of
 * plants. There may be multiple ways to perform the division. Two ways are different if there is a position with a room
 * divider installed in the first way but not in the second way.
 *
 * Return the number of ways to divide the corridor. Since the answer may be very large, return it modulo 10^9 + 7.
 * If there is no way, return 0.
 *
 * [URL](https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/)
 */
object NumberOfWaysToDivideLongCorridor {
    fun numberOfWays(corridor: String): Int {
        val mod = 1_000_000_007
        var result = 1L

        var l = -1
        var seatCount = 0
        for (r in corridor.indices) {
            if (corridor[r] != 'S') continue

            seatCount++
            if (seatCount == 2) {
                seatCount = 0
                l = r
            } else if (l != -1) {
                result *= (r - l)
                result %= mod
            }
        }
        if (seatCount == 1 || l == -1) {
            return 0
        }

        return result.toInt()
    }
}