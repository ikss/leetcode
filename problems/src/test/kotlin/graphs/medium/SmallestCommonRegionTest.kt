package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestCommonRegionTest {
    @Test
    fun test1() {
        val regions = listOf(
            listOf("Earth", "North America", "South America"),
            listOf("North America", "United States", "Canada"),
            listOf("United States", "New York", "Boston"),
            listOf("Canada", "Ontario", "Quebec"),
            listOf("South America", "Brazil"),
        )
        val region1 = "Quebec"
        val region2 = "New York"
        val expected = "North America"

        assertEquals(expected, SmallestCommonRegion.findSmallestRegion(regions, region1, region2))
    }

    @Test
    fun test2() {
        val regions = listOf(
            listOf("Earth", "North America", "South America"),
            listOf("North America", "United States", "Canada"),
            listOf("United States", "New York", "Boston"),
            listOf("Canada", "Ontario", "Quebec"),
            listOf("South America", "Brazil"),
        )
        val region1 = "Canada"
        val region2 = "South America"
        val expected = "Earth"

        assertEquals(expected, SmallestCommonRegion.findSmallestRegion(regions, region1, region2))
    }

}