package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindAllPossibleRecipesFromGivenSuppliesTest {
    @Test
    fun test1Straightforward() {
        val recipes = arrayOf("bread")
        val ingredients = listOf(listOf("yeast", "flour"))
        val supplies = arrayOf("yeast", "flour", "corn")
        val expected = listOf("bread")

        assertEquals(expected, FindAllPossibleRecipesFromGivenSupplies.findAllRecipesStraightforward(recipes, ingredients, supplies))
    }

    @Test
    fun test2Straightforward() {
        val recipes = arrayOf("bread", "sandwich")
        val ingredients = listOf(listOf("yeast", "flour"), listOf("bread", "meat"))
        val supplies = arrayOf("yeast", "flour", "corn", "meat")
        val expected = listOf("bread", "sandwich")

        assertEquals(expected, FindAllPossibleRecipesFromGivenSupplies.findAllRecipesStraightforward(recipes, ingredients, supplies))
    }

    @Test
    fun test3Straightforward() {
        val recipes = arrayOf("bread", "sandwich", "burger")
        val ingredients = listOf(listOf("yeast", "flour"), listOf("bread", "meat"), listOf("sandwich", "cheese"))
        val supplies = arrayOf("yeast", "flour", "corn", "meat", "cheese")
        val expected = listOf("bread", "sandwich", "burger")

        assertEquals(expected, FindAllPossibleRecipesFromGivenSupplies.findAllRecipesStraightforward(recipes, ingredients, supplies))
    }
    
    @Test
    fun test1TopologicalSort() {
        val recipes = arrayOf("bread")
        val ingredients = listOf(listOf("yeast", "flour"))
        val supplies = arrayOf("yeast", "flour", "corn")
        val expected = listOf("bread")

        assertEquals(expected, FindAllPossibleRecipesFromGivenSupplies.findAllRecipesTopologicalSort(recipes, ingredients, supplies))
    }

    @Test
    fun test2TopologicalSort() {
        val recipes = arrayOf("bread", "sandwich")
        val ingredients = listOf(listOf("yeast", "flour"), listOf("bread", "meat"))
        val supplies = arrayOf("yeast", "flour", "corn", "meat")
        val expected = listOf("bread", "sandwich")

        assertEquals(expected, FindAllPossibleRecipesFromGivenSupplies.findAllRecipesTopologicalSort(recipes, ingredients, supplies))
    }

    @Test
    fun test3TopologicalSort() {
        val recipes = arrayOf("bread", "sandwich", "burger")
        val ingredients = listOf(listOf("yeast", "flour"), listOf("bread", "meat"), listOf("sandwich", "cheese"))
        val supplies = arrayOf("yeast", "flour", "corn", "meat", "cheese")
        val expected = listOf("bread", "sandwich", "burger")

        assertEquals(expected, FindAllPossibleRecipesFromGivenSupplies.findAllRecipesTopologicalSort(recipes, ingredients, supplies))
    }
}