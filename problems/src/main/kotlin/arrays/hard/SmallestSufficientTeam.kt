package arrays.hard

import java.util.*

/**
 * In a project, you have a list of required skills req_skills, and a list of people.
 * The ith person `people[i]` contains a list of skills that the person has.
 *
 * Consider a sufficient team: a set of people such that for every required skill in req_skills, there is at least one
 * person in the team who has that skill. We can represent these teams by the index of each person.
 *
 * For example, `team = [0, 1, 3]` represents the people with skills `people[0]`, `people[1]`, and `people[3]`.
 * Return any sufficient team of the smallest possible size, represented by the index of each person.
 * You may return the answer in any order.
 *
 * It is guaranteed an answer exists.
 *
 * [URL](https://leetcode.com/problems/smallest-sufficient-team/)
 */
object SmallestSufficientTeam {
    fun smallestSufficientTeam(req_skills: Array<String>, people: List<List<String>>): IntArray {
        val n = people.size
        val m = req_skills.size
        val skillId = HashMap<String, Int>()
        for (i in 0 until m) {
            skillId[req_skills[i]] = i
        }
        val skillsMaskOfPerson = IntArray(n)
        for (i in 0 until n) {
            for (skill in people[i]) {
                skillsMaskOfPerson[i] = skillsMaskOfPerson[i] or (1 shl skillId[skill]!!)
            }
        }
        val dp = LongArray(1 shl m)
        Arrays.fill(dp, (1L shl n) - 1)
        dp[0] = 0

        for (skillsMask in 1 until (1 shl m)) {
            for (i in 0 until n) {
                val smallerSkillsMask = skillsMask and skillsMaskOfPerson[i].inv()
                if (smallerSkillsMask != skillsMask) {
                    val peopleMask = dp[smallerSkillsMask] or (1L shl i)
                    if (peopleMask.countOneBits() < dp[skillsMask].countOneBits()) {
                        dp[skillsMask] = peopleMask
                    }
                }
            }
        }
        val answerMask = dp[(1 shl m) - 1]
        val ans = IntArray(answerMask.countOneBits())
        var ptr = 0
        for (i in 0 until n) {
            if (answerMask shr i and 1L == 1L) {
                ans[ptr++] = i
            }
        }
        return ans
    }
}
