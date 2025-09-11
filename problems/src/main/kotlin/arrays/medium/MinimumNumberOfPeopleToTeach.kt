package arrays.medium


/**
 * On a social network consisting of m users and some friendships between users, two users can communicate with each
 * other if they know a common language.
 *
 * You are given an integer n, an array languages, and an array friendships where:
 * * There are n languages numbered 1 through n,
 * * languages[i] is the set of languages the iuser knows, and
 * * friendships[i] = [ui, vi] denotes a friendship between the users ui and vi.
 *
 * You can choose one language and teach it to some users so that all friends can communicate with each other.
 * Return the minimum number of users you need to teach.
 *
 * Note that friendships are not transitive, meaning if x is a friend of y and y is a friend of z,
 * this doesn't guarantee that x is a friend of z.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-people-to-teach/)
 */
object MinimumNumberOfPeopleToTeach {

    fun minimumTeachings(n: Int, languages: Array<IntArray>, friendships: Array<IntArray>): Int {
        val cantCommunicate = HashSet<Int>()
        for ((fr1, fr2) in friendships) {
            val mp = HashSet<Int>()
            var canCommunicate = false
            for (lan1 in languages[fr1 - 1]) {
                mp.add(lan1)
            }
            for (lan2 in languages[fr2 - 1]) {
                if (lan2 in mp) {
                    canCommunicate = true
                    break
                }
            }
            if (!canCommunicate) {
                cantCommunicate.add(fr1 - 1)
                cantCommunicate.add(fr2 - 1)
            }
        }
        var maxCnt = 0
        val cnt = IntArray(n + 1)
        for (friendship in cantCommunicate) {
            for (lan in languages[friendship]) {
                cnt[lan]++
                maxCnt = maxOf(maxCnt, cnt[lan])
            }
        }
        return cantCommunicate.size - maxCnt
    }
}
