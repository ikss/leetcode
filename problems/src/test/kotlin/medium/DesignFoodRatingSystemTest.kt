package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignFoodRatingSystemTest {
    @Test
    fun test1() {
        val foodRatings = DesignFoodRatingSystem.FoodRatings(
            arrayOf("kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"),
            arrayOf("korean", "japanese", "japanese", "greek", "japanese", "korean"),
            intArrayOf(9, 12, 8, 15, 14, 7),
        )
        assertEquals("kimchi", foodRatings.highestRated("korean")) // return "kimchi"
        // "kimchi" is the highest rated korean food with a rating of 9.

        assertEquals("ramen", foodRatings.highestRated("japanese")) // return "ramen"
        // "ramen" is the highest rated japanese food with a rating of 14.

        foodRatings.changeRating("sushi", 16) // "sushi" now has a rating of 16.
        assertEquals("sushi", foodRatings.highestRated("japanese")) // return "sushi"
        // "sushi" is the highest rated japanese food with a rating of 16.

        foodRatings.changeRating("ramen", 16) // "ramen" now has a rating of 16.

        assertEquals("ramen", foodRatings.highestRated("japanese")) // return "ramen"
        // Both "sushi" and "ramen" have a rating of 16.
        // However, "ramen" is lexicographically smaller than "sushi".
    }
}