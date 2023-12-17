package design.medium

import java.util.*

/**
 * Design a food rating system that can do the following:
 * * Modify the rating of a food item listed in the system.
 * * Return the highest-rated food item for a type of cuisine in the system.
 *
 * Implement the FoodRatings class:
 * * FoodRatings(String[] foods, String[] cuisines, int[] ratings) Initializes the system. The food items are described
 * by foods, cuisines and ratings, all of which have a length of n.
 * * * `foods[i]` is the name of the ith food,
 * * * `cuisines[i]` is the type of cuisine of the ith food, and
 * * * `ratings[i]` is the initial rating of the ith food.
 * * void changeRating(String food, int newRating) Changes the rating of the food item with the name food.
 * * String highestRated(String cuisine) Returns the name of the food item that has the highest rating for the given
 * type of cuisine. If there is a tie, return the item with the lexicographically smaller name.
 *
 * Note that a string x is lexicographically smaller than string y if x comes before y in dictionary order, that is,
 * either x is a prefix of y, or if i is the first position such that `x[i] != y[i]`, then `x[i]` comes before `y[i]`
 * in alphabetic order.
 *
 * [URL](https://leetcode.com/problems/design-a-food-rating-system/)
 */

private typealias CuisineRating = Pair<String, Int>

object DesignFoodRatingSystem {
    class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {
        // Map food with its rating.
        private val foodRatingMap = HashMap<String, Int>()

        // Map food with cuisine it belongs to.
        private val foodCuisineMap = HashMap<String, String>()

        // Store all food of a cuisine in set (to sort them on ratings/name)
        private val cuisineFoodMap = HashMap<String, TreeSet<CuisineRating>>()

        init {
            for (i in foods.indices) {
                // Store 'rating' and 'cuisine' of current 'food' in 'foodRatingMap' and 'foodCuisineMap' maps.
                foodRatingMap[foods[i]] = ratings[i]
                foodCuisineMap[foods[i]] = cuisines[i]

                // Insert the '(-1 * rating, name)' element in the current cuisine's set.
                cuisineFoodMap.computeIfAbsent(cuisines[i]) { k: String ->
                    TreeSet<CuisineRating>(
                        Comparator { a: CuisineRating, b: CuisineRating ->
                            val compareByRating = a.second.compareTo(b.second)
                            if (compareByRating == 0) {
                                // If ratings are equal, compare by food name (in ascending order).
                                return@Comparator a.first.compareTo(b.first)
                            }
                            compareByRating
                        })
                }.add(foods[i] to -ratings[i])
            }
        }

        fun changeRating(food: String, newRating: Int) {
            // Fetch cuisine name for food.
            val cuisineName = foodCuisineMap[food]

            if (foodRatingMap[food] == newRating) {
                // If rating is not changed, return.
                return
            }

            // Find and delete the element from the respective cuisine's set.
            val cuisineSet = cuisineFoodMap[cuisineName]!!
            val oldElement = food to -foodRatingMap[food]!!
            cuisineSet.remove(oldElement)

            // Update food's rating in 'foodRating' map.
            foodRatingMap[food] = newRating
            // Insert the '(-1 * new rating, name)' element in the respective cuisine's set.
            cuisineSet.add(food to -newRating)
        }

        fun highestRated(cuisine: String): String {
            val highestRated = cuisineFoodMap[cuisine]!!.first()
            // Return name of the highest rated 'food' of 'cuisine'.
            return highestRated.first
        }
    }
}