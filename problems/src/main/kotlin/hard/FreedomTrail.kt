package hard

/**
 * In the video game Fallout 4, the quest "Road to Freedom" requires players to reach a metal dial called the
 * "Freedom Trail Ring" and use the dial to spell a specific keyword to open the door.
 *
 * Given a string ring that represents the code engraved on the outer ring and another string key that represents
 * the keyword that needs to be spelled, return the minimum number of steps to spell all the characters in the keyword.
 *
 * Initially, the first character of the ring is aligned at the "12:00" direction. You should spell all the characters
 * in key one by one by rotating ring clockwise or anticlockwise to make each character of the string key aligned
 * at the "12:00" direction and then by pressing the center button.
 *
 * At the stage of rotating the ring to spell the key character `key[i]`:
 * * You can rotate the ring clockwise or anticlockwise by one place, which counts as one step.
 * The final purpose of the rotation is to align one of ring's characters at the "12:00" direction,
 * where this character must equal `key[i]`.
 * * If the character `key[i]` has been aligned at the "12:00" direction, press the center button to spell,
 * which also counts as one step. After the pressing, you could begin to spell the next character in the key
 * (next stage). Otherwise, you have finished all the spelling.
 *
 * [URL](https://leetcode.com/problems/freedom-trail/)
 */
object FreedomTrail {
    fun findRotateStepsTopDownDp(ring: String, key: String): Int {
        val result = key.length

        return result + rotate(0, 0, ring, key, HashMap())
    }

    private fun rotate(currChar: Int, currI: Int, ring: String, key: String, memo: HashMap<Pair<Int, Int>, Int>): Int {
        if (currChar == key.length) return 0

        memo[currChar to currI]?.let { return(it) }

        val result = if (ring[currI] == key[currChar]) {
            rotate(currChar + 1, currI, ring, key, memo)
        } else {
            val left = findLeft(currI, ring, key[currChar])
            val right = findRight(currI, ring, key[currChar])

            if (left.second == right.second) {
                minOf(left.first, right.first) + rotate(currChar + 1, left.second, ring, key, memo)
            } else {
                minOf(
                    left.first + rotate(currChar + 1, left.second, ring, key, memo),
                    right.first + rotate(currChar + 1, right.second, ring, key, memo)
                )
            }
        }
        memo[currChar to currI] = result

        return result
    }

    private fun findLeft(curr: Int, ring: String, char: Char): Pair<Int, Int> {
        var steps = 0
        var curr = curr
        while (ring[curr] != char) {
            curr--
            steps++
            if (curr == -1) curr = ring.length - 1
        }
        return steps to curr
    }

    private fun findRight(curr: Int, ring: String, char: Char): Pair<Int, Int> {
        var steps = 0
        var curr = curr
        while (ring[curr] != char) {
            curr++
            steps++
            if (curr == ring.length) curr = 0
        }
        return steps to curr
    }
}