package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DetonateTheMaximumBombsTest {
    @Test
    fun test1() {
        val bombs = arrayOf(intArrayOf(2, 1, 3), intArrayOf(6, 1, 4))
        val expected = 2

        assertEquals(expected, DetonateTheMaximumBombs.maximumDetonation(bombs))
    }

    @Test
    fun test2() {
        val bombs = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(2, 3, 1),
            intArrayOf(3, 4, 2),
            intArrayOf(4, 5, 3),
            intArrayOf(5, 6, 4),
        )
        val expected = 5

        assertEquals(expected, DetonateTheMaximumBombs.maximumDetonation(bombs))
    }

    @Test
    fun test3() {
        val bombs = arrayOf(intArrayOf(1, 1, 5), intArrayOf(10, 10, 5))
        val expected = 1

        assertEquals(expected, DetonateTheMaximumBombs.maximumDetonation(bombs))
    }

    @Test
    fun test4() {
        val bombs = arrayOf(
            intArrayOf(855, 82, 158),
            intArrayOf(17, 719, 430),
            intArrayOf(90, 756, 164),
            intArrayOf(376, 17, 340),
            intArrayOf(691, 636, 152),
            intArrayOf(565, 776, 5),
            intArrayOf(464, 154, 271),
            intArrayOf(53, 361, 162),
            intArrayOf(278, 609, 82),
            intArrayOf(202, 927, 219),
            intArrayOf(542, 865, 377),
            intArrayOf(330, 402, 270),
            intArrayOf(720, 199, 10),
            intArrayOf(986, 697, 443),
            intArrayOf(471, 296, 69),
            intArrayOf(393, 81, 404),
            intArrayOf(127, 405, 177),
        )
        val expected = 9

        assertEquals(expected, DetonateTheMaximumBombs.maximumDetonation(bombs))
    }
}