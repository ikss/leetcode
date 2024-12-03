package graphs.medium

/**
 * Suppose you are at a party with n people labeled from 0 to n - 1 and among them, there may exist one celebrity.
 * The definition of a celebrity is that all the other n - 1 people know the celebrity,
 * but the celebrity does not know any of them.
 *
 * Now you want to find out who the celebrity is or verify that there is not one. You are only allowed to ask questions
 * like: "Hi, A. Do you know B?" to get information about whether A knows B. You need to find out the celebrity
 * (or verify there is not one) by asking as few questions as possible (in the asymptotic sense).
 *
 * You are given an integer n and a helper function bool knows(a, b) that tells you whether a knows b.
 * Implement a function int findCelebrity(n). There will be exactly one celebrity if they are at the party.
 *
 * Return the celebrity's label if there is a celebrity at the party. If there is no celebrity, return -1.
 *
 * Note that the n x n 2D array graph given as input is not directly available to you, and instead only accessible
 * through the helper function knows. `graph[i][j] == 1` represents person i knows person j, wherease `graph[i][j] == 0`
 * represents person j does not know person i.
 *
 * [URL](https://leetcode.com/problems/find-the-celebrity/)
 */
object FindTheCelebrity {
    abstract class Relation(val graph: Array<IntArray>) {
        abstract fun findCelebrity(n: Int): Int
        fun knows(a: Int, b: Int): Boolean = graph[a][b] == 1
    }

    class Solution(graph: Array<IntArray>) : Relation(graph) {

        override fun findCelebrity(n: Int): Int {
            var celebrityCandidate = 0
            for (i in 0..<n) {
                if (knows(celebrityCandidate, i)) {
                    celebrityCandidate = i
                }
            }
            if (isCelebrity(celebrityCandidate, n)) {
                return celebrityCandidate
            }
            return -1
        }

        private fun isCelebrity(i: Int, n: Int): Boolean {
            for (j in 0 until n) {
                if (i == j) continue  // Don't ask if they know themselves.

                if (knows(i, j) || !knows(j, i)) {
                    return false
                }
            }
            return true
        }
    }
}
