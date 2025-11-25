package medium

/**
 * You are given a positive integer array skill of even length n where `skill[i]` denotes the skill of the ith player.
 * Divide the players into n / 2 teams of size 2 such that the total skill of each team is equal.
 *
 * The chemistry of a team is equal to the product of the skills of the players on that team.
 *
 * Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into teams
 * such that the total skill of each team is equal.
 *
 * [URL](https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/)
 */
object DividePlayersIntoTeamsOfEqualSkill {
    fun dividePlayers(skill: IntArray): Long {
        val n = skill.size
        skill.sort()

        val equalSkill = skill[0] + skill[n - 1]

        var chemistry = 0L

        for (i in 0 until n / 2) {
            val team = skill[i] to skill[n - 1 - i]
            if (team.first + team.second != equalSkill) return -1L
            chemistry += team.first.toLong() * team.second
        }

        return chemistry
    }
}
