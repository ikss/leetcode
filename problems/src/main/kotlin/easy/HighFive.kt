package easy

import java.util.PriorityQueue

/**
 * Given a list of the scores of different students, items, where `items[i] = [IDi, scorei]` represents one score from
 * a student with IDi, calculate each student's top five average.
 *
 * Return the answer as an array of pairs result, where `result[j] = [IDj, topFiveAveragej]` represents the student
 * with IDj and their top five average. Sort result by IDj in increasing order.
 *
 * A student's top five average is calculated by taking the sum of their top five scores and dividing
 * it by 5 using integer division.
 *
 * [URL](https://leetcode.com/problems/high-five/)
 */
object HighFive {
    fun highFive(items: Array<IntArray>): Array<IntArray> {
        val scoresPerStudent = HashMap<Int, PriorityQueue<Int>>()

        for ((id, score) in items) {
            val queue = scoresPerStudent.computeIfAbsent(id) { PriorityQueue() }
            queue.offer(score)
            if (queue.size > 5) {
                queue.poll()
            }
        }

        return scoresPerStudent.map { (id, scores) ->
            intArrayOf(id, scores.sum() / 5)
        }.sortedBy { it[0] }
            .toTypedArray()
    }
}
