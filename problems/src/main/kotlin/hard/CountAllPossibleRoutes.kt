package hard

/**
 * You are given an array of distinct positive integers locations where `locations[i]` represents the position of city i.
 * You are also given integers start, finish and fuel representing the starting city, ending city,
 * and the initial amount of fuel you have, respectively.
 *
 * At each step, if you are at city i, you can pick any city j such that j != i and 0 <= j < locations.length and move
 * to city j. Moving from city i to city j reduces the amount of fuel you have by `|locations[i] - locations[j]|`.
 * Please notice that |x| denotes the absolute value of x.
 *
 * Notice that fuel cannot become negative at any point in time, and that you are allowed to visit any city more than
 * once (including start and finish).
 *
 * Return the count of all possible routes from start to finish. Since the answer may be too large,
 * return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/count-all-possible-routes/)
 */
object CountAllPossibleRoutes {
    private const val MOD = 1_000_000_007

    fun countRoutes(locations: IntArray, start: Int, finish: Int, fuel: Int): Int {
        val n = locations.size
        val dp = Array(n) { IntArray(fuel + 1) }
        dp[finish].fill(1)

        for (f in 0..fuel) {
            for (from in 0 until n) {
                for (to in 0 until n) {
                    if (from == to) continue

                    val fuelNeed = Math.abs(locations[from] - locations[to])
                    if (fuelNeed > f) continue

                    dp[from][f] = (dp[from][f] + dp[to][f - fuelNeed]) % MOD
                }
            }
        }
        return dp[start][fuel]
    }
}
