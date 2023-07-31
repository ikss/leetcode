package strings.medium

/**
 * In the world of Dota2, there are two parties: the Radiant and the Dire.
 *
 * The Dota2 senate consists of senators coming from two parties. Now the Senate wants to decide on a change in the
 * Dota2 game. The voting for this change is a round-based procedure.
 * In each round, each senator can exercise one of the two rights:
 * * Ban one senator's right: A senator can make another senator lose all his rights in this and all the following rounds.
 * * Announce the victory: If this senator found the senators who still have rights to vote are all from the same party, he can announce the victory and decide on the change in the game.
 *
 * Given a string senate representing each senator's party belonging. The character 'R' and 'D' represent
 * the Radiant party and the Dire party. Then if there are n senators, the size of the given string will be n.
 *
 * The round-based procedure starts from the first senator to the last senator in the given order. This procedure will
 * last until the end of voting. All the senators who have lost their rights will be skipped during the procedure.
 *
 * Suppose every senator is smart enough and will play the best strategy for his own party. Predict which party will
 * finally announce the victory and change the Dota2 game. The output should be "Radiant" or "Dire".
 *
 * [URL](https://leetcode.com/problems/dota2-senate/)
 */
object Dota2Senate {
    fun predictPartyVictory(senate: String): String {
        // Number of Senators of each party
        var rCount = 0
        var dCount = 0

        // Floating Ban Count
        var dFloatingBan = 0
        var rFloatingBan = 0

        // Queue of Senators
        val q = java.util.ArrayDeque<Char>()
        for (c in senate) {
            q.add(c)
            if (c == 'R') rCount++ else dCount++
        }

        // While any party has eligible Senators
        while (rCount > 0 && dCount > 0) {
            // Pop the senator with turn
            val curr = q.poll()

            // If eligible, float the ban on the other party, enqueue again.
            // If not, decrement the floating ban and count of the party.
            if (curr == 'D') {
                if (dFloatingBan > 0) {
                    dFloatingBan--
                    dCount--
                } else {
                    rFloatingBan++
                    q.add('D')
                }
            } else {
                if (rFloatingBan > 0) {
                    rFloatingBan--
                    rCount--
                } else {
                    dFloatingBan++
                    q.add('R')
                }
            }
        }

        // Return the party with eligible Senators
        return if (rCount > 0) "Radiant" else "Dire"
    }
}
