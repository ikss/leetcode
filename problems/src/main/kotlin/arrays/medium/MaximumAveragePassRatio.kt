package arrays.medium

import java.util.*

/**
 * There is a school that has classes of students and each class will be having a final exam.
 * You are given a 2D integer array classes, where `classes[i] = [passi, totali]`. You know beforehand that in the ith
 * class, there are totali total students, but only passi number of students will pass the exam.
 *
 * You are also given an integer extraStudents. There are another extraStudents brilliant students that are guaranteed
 * to pass the exam of any class they are assigned to. You want to assign each of the extraStudents students to a class
 * in a way that maximizes the average pass ratio across all the classes.
 *
 * The pass ratio of a class is equal to the number of students of the class that will pass the exam divided by the
 * total number of students of the class. The average pass ratio is the sum of pass ratios of all the classes divided
 * by the number of the classes.
 *
 * Return the maximum possible average pass ratio after assigning the extraStudents students.
 * Answers within 10-5 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/maximum-average-pass-ratio/)
 */
object MaximumAveragePassRatio {
    fun maxAverageRatio(classes: Array<IntArray>, extraStudents: Int): Double {
        var students = extraStudents
        val maxHeap = PriorityQueue<DoubleArray> { a, b -> b[0].compareTo(a[0]) }

        for (clazz in classes) {
            val passes = clazz[0].toDouble()
            val totalStudents = clazz[1].toDouble()
            val gain = calculateGain(passes, totalStudents)
            maxHeap.offer(doubleArrayOf(gain, passes, totalStudents))
        }

        while (students-- > 0) {
            val (_, p, t) = maxHeap.poll()
            maxHeap.offer(doubleArrayOf(calculateGain(p + 1, t + 1), p + 1, t + 1))
        }

        var sum = 0.0
        while (!maxHeap.isEmpty()) {
            val (_, p, t) = maxHeap.poll()
            sum += p / t
        }

        return sum / classes.size
    }

    private fun calculateGain(passes: Double, totalStudents: Double): Double {
        return (passes + 1) / (totalStudents + 1) - passes / totalStudents
    }
}
