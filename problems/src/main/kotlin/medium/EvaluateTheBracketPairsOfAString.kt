package medium

import java.util.*

/**
 * You are given a string s that contains some bracket pairs, with each pair containing a non-empty key.
 * * For example, in the string "(name)is(age)yearsold", there are two bracket pairs that contain the keys "name" and "age".
 *
 * You know the values of a wide range of keys. This is represented by a 2D string array knowledge where each
 * `knowledge[i] = [keyi, valuei]` indicates that key keyi has a value of valuei.
 *
 * You are tasked to evaluate all of the bracket pairs. When you evaluate a bracket pair that contains some key keyi, you will:
 * * Replace keyi and the bracket pair with the key's corresponding valuei.
 * * If you do not know the value of the key, you will replace keyi and the bracket pair with a question mark "?"
 * (without the quotation marks).
 *
 * Each key will appear at most once in your knowledge. There will not be any nested brackets in s.
 *
 * Return the resulting string after evaluating all of the bracket pairs.
 *
 * [URL](https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/)
 */
object EvaluateTheBracketPairsOfAString {
    fun evaluateStack(s: String, knowledge: List<List<String>>): String {
        val keys = HashMap<String, String>(knowledge.size)

        for ((k, v) in knowledge) {
            keys[k] = v
        }

        val chars = Stack<Char>()

        for (c in s) {
            if (c != ')') {
                chars.push(c)
                continue
            }

            val key = StringBuilder()
            while (chars.isNotEmpty()) {
                val next = chars.pop()
                if (next == '(') break
                key.append(next)
            }
            val rev = key.reversed().toString()
            val v = keys.getOrDefault(rev, "?")

            for (cv in v) {
                chars.push(cv)
            }
        }
        val result = StringBuilder(chars.size)
        while (chars.isNotEmpty()) {
            result.append(chars.pop())
        }
        return result.reversed().toString()
    }

    fun evaluateOnePass(s: String, knowledge: List<List<String>>): String {
        val keys = knowledge.associateBy({ it[0] }, { it[1] })

        val result = StringBuilder(s.length)

        var openBracket = -1

        val kb = StringBuilder()
        for (i in s.indices) {
            val c = s[i]

            if (c == '(') {
                openBracket = i
                continue
            }
            if (c == ')') {
                result.append(keys.getOrDefault(kb.toString(), "?"))
                kb.setLength(0)
                openBracket = -1
                continue
            }
            if (openBracket != -1) {
                kb.append(c)
                continue
            }
            result.append(c)
        }

        return result.toString()
    }
}
