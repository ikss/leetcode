package graphs.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TheEarliestMomentWhenEveryoneBecomeFriendsTest {
    @Test
    fun test1() {
        val logs = arrayOf(
            intArrayOf(20190101, 0, 1),
            intArrayOf(20190104, 3, 4),
            intArrayOf(20190107, 2, 3),
            intArrayOf(20190211, 1, 5),
            intArrayOf(20190224, 2, 4),
            intArrayOf(20190301, 0, 3),
            intArrayOf(20190312, 1, 2),
            intArrayOf(20190322, 4, 5),
        )
        val n = 6
        val expected = 20190301

        assertEquals(expected, TheEarliestMomentWhenEveryoneBecomeFriends.earliestAcq(logs, n))
    }

    @Test
    fun test2() {
        val logs = arrayOf(
            intArrayOf(0, 2, 0),
            intArrayOf(1, 0, 1),
            intArrayOf(3, 0, 3),
            intArrayOf(4, 1, 2),
            intArrayOf(7, 3, 1),
        )
        val n = 4
        val expected = 3

        assertEquals(expected, TheEarliestMomentWhenEveryoneBecomeFriends.earliestAcq(logs, n))
    }
}