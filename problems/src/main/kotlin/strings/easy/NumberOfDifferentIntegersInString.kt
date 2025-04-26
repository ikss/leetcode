package strings.easy

import java.util.regex.Pattern

/**
 * You are given a string word that consists of digits and lowercase English letters.
 *
 * You will replace every non-digit character with a space. For example, "a123bc34d8ef34" will become " 123  34 8  34". Notice that you are left with some integers that are separated by at least one space: "123", "34", "8", and "34".
 *
 * Return the number of different integers after performing the replacement operations on word.
 *
 * Two integers are considered different if their decimal representations without any leading zeros are different.
 *
 * [URL](https://leetcode.com/problems/number-of-different-integers-in-a-string/)
 */
object NumberOfDifferentIntegersInString {
    fun numDifferentIntegers(word: String): Int {
        val pattern = Pattern.compile("\\d+")
        val matches = pattern.matcher(word)
        val result = HashSet<String>()
        while (matches.find()) {
            val match = matches.group()
            val trimmedMatch = match.trimStart('0').ifEmpty { "0" }
            result.add(trimmedMatch)
        }
        return result.size
    }
}
