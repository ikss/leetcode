package medium

/**
 * You are given an integer numberOfUsers representing the total number of users and an array events of size n x 3.
 *
 * Each `events[i]` can be either of the following two types:
 *
 * 1. Message Event: ["MESSAGE", "timestampi", "mentions_stringi"]
 *    * This event indicates that a set of users was mentioned in a message at timestampi.
 *    * The mentions_stringi string can contain one of the following tokens:
 *    * id<number>: where <number> is an integer in range [0,numberOfUsers - 1]. There can be multiple ids separated by a
 * single whitespace and may contain duplicates. This can mention even the offline users.
 *    * ALL: mentions all users.
 *    * HERE: mentions all online users.
 *
 * 2. Offline Event: `["OFFLINE", "timestampi", "idi"]`
 * This event indicates that the user idi had become offline at timestampi for 60 time units.
 * The user will automatically be online again at time timestampi + 60.
 *
 * Return an array mentions where `mentions[i]` represents the number of mentions the user
 * with id i has across all MESSAGE events.
 *
 * All users are initially online, and if a user goes offline or comes back online,
 * their status change is processed before handling any message event that occurs at the same timestamp.
 *
 * Note that a user can be mentioned multiple times in a single message event, and each mention should be counted separately.
 *
 * [URL](https://leetcode.com/problems/count-mentions-per-user/)
 */
object CountMentionsPerUser {
    fun countMentions(numberOfUsers: Int, events: List<List<String>>): IntArray {
        val eventsSorted = events.sortedWith { e1, e2 -> if (e1[1].toInt() == e2[1].toInt()) e2[0].compareTo(e1[0]) else e1[1].toInt() - e2[1].toInt() }
        val nextOnline = java.util.ArrayDeque<Pair<Int, Int>>()
        val online = BooleanArray(numberOfUsers) { true }
        val mentions = IntArray(numberOfUsers)


        for ((type, timestr, usersstr) in eventsSorted) {
            val time = timestr.toInt()

            while (nextOnline.isNotEmpty() && nextOnline.peek().first <= time) {
                online[nextOnline.poll().second] = true
            }

            if (type == "MESSAGE") {
                if (usersstr == "ALL") {
                    for (i in mentions.indices) {
                        mentions[i]++
                    }
                } else if (usersstr == "HERE") {
                    for (i in online.indices) {
                        if (online[i]) mentions[i]++
                    }
                } else {
                    val users = usersstr.split(" ")
                    for (u in users) {
                        mentions[u.drop(2).toInt()]++
                    }
                }
            } else if (type == "OFFLINE") {
                val user = usersstr.toInt()
                online[user] = false
                nextOnline.offer(time + 60 to user)
            }
        }

        return mentions
    }
}
