package week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

object PossibleBipartitionTest {

    @Test
    fun test1() {
        val array = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 4))
        assertEquals(true, PossibleBipartition.possibleBipartition(4, array))
    }

    @Test
    fun test2() {
        val array = arrayOf(
            intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 1), intArrayOf(8, 9),
            intArrayOf(1, 6), intArrayOf(5, 8), intArrayOf(1, 2), intArrayOf(6, 7),
            intArrayOf(3, 10), intArrayOf(8, 10), intArrayOf(1, 5), intArrayOf(7, 10),
            intArrayOf(1, 10), intArrayOf(3, 5), intArrayOf(3, 6), intArrayOf(1, 4),
            intArrayOf(3, 9), intArrayOf(2, 3), intArrayOf(1, 9), intArrayOf(7, 9),
            intArrayOf(2, 7), intArrayOf(6, 8), intArrayOf(5, 7), intArrayOf(3, 4)
        )
        assertEquals(false, PossibleBipartition.possibleBipartition(10, array))
    }
}
