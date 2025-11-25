package easy

/**
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town
 * judge.
 *
 * If the town judge exists, then:
 * * The town judge trusts nobody.
 * * Everybody (except for the town judge) trusts the town judge.
 *
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given an array trust where `trust[i] = [ai, bi]` representing that the person labeled ai
 * trusts the person labeled bi.
 *
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 *
 * [URL](https://leetcode.com/problems/two-sum/)
 */
object FindTheTownJudge {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val count = IntArray(n + 1)
        for ((person, trst) in trust) {
            count[person]--
            count[trst]++
        }
        for (i in count.indices) {
            if (count[i] == n - 1) return i
        }
        return -1
    }
}
