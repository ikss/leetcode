package graphs.medium

import java.util.*

/**
 * You have information about n different recipes. You are given a string array recipes and a 2D string array
 * ingredients. The ith recipe has the name `recipes[i]`, and you can create it if you have all the needed ingredients
 * from `ingredients[i]`. A recipe can also be an ingredient for other recipes, i.e., `ingredients[i]` may contain a
 * string that is in recipes.
 *
 * You are also given a string array supplies containing all the ingredients that you initially have, and you have an
 * infinite supply of all of them.
 *
 * Return a list of all the recipes that you can create. You may return the answer in any order.
 *
 * Note that two recipes may contain each other in their ingredients.
 *
 * [URL](https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/)
 */
object FindAllPossibleRecipesFromGivenSupplies {
    fun findAllRecipes(recipes: Array<String>, ingredients: List<List<String>>, supplies: Array<String>): List<String> {
        val ingredientsByRecipe = HashMap<String, MutableSet<String>>()

        for (i in recipes.indices) {
            ingredientsByRecipe[recipes[i]] = ingredients[i].toMutableSet()
        }

        val suppliesQueue = java.util.ArrayDeque<String>()
        for (s in supplies) {
            suppliesQueue.offer(s)
        }

        val result = ArrayList<String>()

        while (suppliesQueue.isNotEmpty()) {
            val supply = suppliesQueue.poll()
            val iter = ingredientsByRecipe.iterator()
            for ((k, v) in iter) {
                if (v.remove(supply)) {
                    if (v.isEmpty()) {
                        result.add(k)
                        suppliesQueue.offer(k)
                        iter.remove()
                    }
                }
            }
        }

        return result
    }
}
