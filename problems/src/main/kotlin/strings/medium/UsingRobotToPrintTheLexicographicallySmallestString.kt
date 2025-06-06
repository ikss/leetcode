package strings.medium

import java.util.*

/**
 * You are given a string s and a robot that currently holds an empty string t.
 * Apply one of the following operations until s and t are both empty:
 * * Remove the first character of a string s and give it to the robot. The robot will append this character to the string t.
 * * Remove the last character of a string t and give it to the robot. The robot will write this character on paper.
 *
 * Return the lexicographically smallest string that can be written on the paper.
 *
 * [URL](https://leetcode.com/problems/using-a-robot-to-print-the-lexicographically-smallest-string/)
 */
object UsingRobotToPrintTheLexicographicallySmallestString {
    fun robotWithString(s: String): String {
        val cnt = IntArray(26)
        for (c in s) {
            cnt[c - 'a']++
        }

        val stack = Stack<Char>()
        val res = StringBuilder()
        var minCharacter = 'a'
        for (c in s) {
            stack.push(c)
            cnt[c - 'a']--
            while (minCharacter != 'z' && cnt[minCharacter - 'a'] == 0) {
                minCharacter++
            }
            while (!stack.isEmpty() && stack.peek()!! <= minCharacter) {
                res.append(stack.pop())
            }
        }

        return res.toString()
    }
}