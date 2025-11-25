package medium

import data_structures.ListBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class LinkedListRandomNodeTest {
    private val seed = 654456L

    @Test
    fun test1naive() {
        val head = ListBuilder.build(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
        val randomizer = LinkedListRandomNode.SolutionNaive(head, Random(seed))
        val expected = listOf(8, 6, 4, 3, 7, 2, 5, 6, 9, 5)

        val actual = generateSequence { randomizer.getRandom() }.take(10).toList()

        assertEquals(expected, actual)
    }

    @Test
    fun test2naive() {
        val head = ListBuilder.build(1)
        val randomizer = LinkedListRandomNode.SolutionNaive(head, Random(seed))
        val expected = listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

        val actual = generateSequence { randomizer.getRandom() }.take(10).toList()

        assertEquals(expected, actual)
    }

    @Test
    fun test1reservoirSampling() {
        val head = ListBuilder.build(3, 8, 3, 9, 1, 3, 9, 9, 2, 1)
        val randomizer = LinkedListRandomNode.SolutionReservoirSampling(head, Random(seed))
        val expected = listOf(3, 9, 3, 2, 3, 3, 2, 2, 8, 3)

        val actual = generateSequence { randomizer.getRandom() }.take(10).toList()

        assertEquals(expected, actual)
    }

    @Test
    fun test2reservoirSampling() {
        val head = ListBuilder.build(1)
        val randomizer = LinkedListRandomNode.SolutionReservoirSampling(head, Random(seed))
        val expected = listOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

        val actual = generateSequence { randomizer.getRandom() }.take(10).toList()

        assertEquals(expected, actual)
    }
}