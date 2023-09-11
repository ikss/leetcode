package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GroupThePeopleGivenTheGroupSizeTheyBelongToTest {
    @Test
    fun test1() {
        val groupSizes = intArrayOf(3, 3, 3, 3, 3, 1, 3)
        val expected = listOf(
            listOf(0, 1, 2),
            listOf(5),
            listOf(3, 4, 6),
        )

        assertEquals(expected, GroupThePeopleGivenTheGroupSizeTheyBelongTo.groupThePeople(groupSizes))
    }

    @Test
    fun test2() {
        val groupSizes = intArrayOf(2, 1, 3, 3, 3, 2)
        val expected = listOf(
            listOf(1),
            listOf(2, 3, 4),
            listOf(0, 5),
        )

        assertEquals(expected, GroupThePeopleGivenTheGroupSizeTheyBelongTo.groupThePeople(groupSizes))
    }
}