package arrays.medium

import java.util.*

/**
 * You are playing a game that contains multiple characters, and each of the characters has two main properties:
 * attack and defense. You are given a 2D integer array properties where `properties[i] = [attacki, defensei]`
 * represents the properties of the ith character in the game.
 *
 * A character is said to be weak if any other character has both attack and defense levels strictly greater than this
 * character's attack and defense levels. More formally, a character i is said to be weak if there exists another
 * character j where attackj > attacki and defensej > defensei.
 *
 * Return the number of weak characters.
 *
 * [URL](https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/)
 */
object NumberOfWeakCharactersInTheGame {
    fun numberOfWeakCharacters(properties: Array<IntArray>): Int {
        var count = 0
        Arrays.sort(properties) { a: IntArray, b: IntArray -> if (b[0] == a[0]) a[1] - b[1] else b[0] - a[0] }
        var max = 0
        for (i in properties.indices) {
            if (properties[i][1] < max) {
                count++
            } else {
                max = properties[i][1]
            }
        }
        return count
    }
}