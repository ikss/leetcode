package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CutOffTreesForGolfEventTest {

    @Test
    fun test1() {
        val forest = listOf(
            listOf(1, 2, 3),
            listOf(0, 0, 4),
            listOf(7, 6, 5),
        )
        val expected = 6

        assertEquals(expected, CutOffTreesForGolfEvent.cutOffTree(forest))
    }

    @Test
    fun test2() {
        val forest = listOf(
            listOf(1, 2, 3),
            listOf(0, 0, 0),
            listOf(7, 6, 5),
        )
        val expected = -1

        assertEquals(expected, CutOffTreesForGolfEvent.cutOffTree(forest))
    }

    @Test
    fun test3() {
        val forest = listOf(
            listOf(2, 3, 4),
            listOf(0, 0, 5),
            listOf(8, 7, 6),
        )
        val expected = 6

        assertEquals(expected, CutOffTreesForGolfEvent.cutOffTree(forest))
    }
}