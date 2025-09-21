package design.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignMovieRentalSystemTest {
    @Test
    fun test1() {
        val entries = arrayOf(
            intArrayOf(0, 1, 5),
            intArrayOf(0, 2, 6),
            intArrayOf(0, 3, 7),
            intArrayOf(1, 1, 4),
            intArrayOf(1, 2, 7),
            intArrayOf(2, 1, 5),
        )
        val movieRentingSystem = DesignMovieRentalSystem.MovieRentingSystem(3, entries)
        assertEquals(listOf(1, 0, 2), movieRentingSystem.search(1))
        movieRentingSystem.rent(0, 1)
        movieRentingSystem.rent(1, 2)
        assertEquals(listOf(listOf(0, 1), listOf(1, 2)), movieRentingSystem.report())
        movieRentingSystem.drop(1, 2)
        assertEquals(listOf(0, 1), movieRentingSystem.search(2))
    }
}