package medium

/**
 * ou are given an integer array matches where `matches[i] = [winneri, loseri]` indicates that
 * the player winneri defeated player loseri in a match.
 *
 * Return a list answer of size 2 where:
 * * answer[0] is a list of all players that have not lost any matches.
 * * answer[1] is a list of all players that have lost exactly one match.
 *
 * The values in the two lists should be returned in increasing order.
 *
 * __Note__:
 * * You should only consider the players that have played at least one match.
 * * The testcases will be generated such that no two matches will have the same outcome.
 *
 * [URL](https://leetcode.com/problems/find-players-with-zero-or-one-losses/)
 */
object FindPlayersWithZeroOrOneLosses {
    fun findWinners(matches: Array<IntArray>): List<List<Int>> {
        val players = HashMap<Int, Int>()

        for ((win, loose) in matches) {
            players.putIfAbsent(win, 0)
            players.merge(loose, 1, Int::plus)
        }

        val winners = ArrayList<Int>()
        val losers = ArrayList<Int>()
        for ((player, losses) in players) {
            if (losses == 0) {
                winners.add(player)
            } else if (losses == 1) {
                losers.add(player)
            }
        }
        return listOf(winners.sorted(), losers.sorted())
    }
}
