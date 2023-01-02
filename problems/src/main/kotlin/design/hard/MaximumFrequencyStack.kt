package design.hard

import java.util.*

/**
 * Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.
 *
 * Implement the FreqStack class:
 * * FreqStack() constructs an empty frequency stack.
 * * void push(int val) pushes an integer val onto the top of the stack.
 * * int pop() removes and returns the most frequent element in the stack.
 * * If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.
 *
 * [URL](https://leetcode.com/problems/maximum-frequency-stack/)
 */
object MaximumFrequencyStack {
    class FreqStack {
        private val freq = hashMapOf<Int, Int>()
        private val groups = hashMapOf<Int, Stack<Int>>()
        private var maxFrequency = 0

        fun push(`val`: Int) {
            val newFreq = freq.merge(`val`, 1, Integer::sum)!!
            maxFrequency = maxOf(maxFrequency, newFreq)
            groups.computeIfAbsent(newFreq) { Stack() }.push(`val`)
        }

        fun pop(): Int {
            val group = groups[maxFrequency]!!
            val x = group.pop()
            freq[x] = freq[x]!! - 1
            if (group.isEmpty()) {
                maxFrequency--
            }
            return x
        }
    }
}