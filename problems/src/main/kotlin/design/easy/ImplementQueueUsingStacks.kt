package design.easy

import java.util.*

/**
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 *
 * Implement the MyQueue class:
 * * void push(int x) Pushes element x to the back of the queue.
 * * int pop() Removes the element from the front of the queue and returns it.
 * * int peek() Returns the element at the front of the queue.
 * * boolean empty() Returns true if the queue is empty, false otherwise.
 *
 * __Notes:__
 * * You must use only standard operations of a stack, which means only push to top,
 * peek/pop from top, size, and is empty operations are valid.
 * * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or
 * deque(double-ended queue) as long as you use only a stack's standard operations.
 *
 * [URL](https://leetcode.com/problems/implement-queue-using-stacks/
 */
object ImplementQueueUsingStacks {
    class MyQueue {
        private val s1 = Stack<Int>()
        private val s2 = Stack<Int>()
        private var front = 0

        // Push element x to the back of queue.
        fun push(x: Int) {
            if (s1.empty()) {
                front = x
            }
            s1.push(x)
        }

        fun pop(): Int {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop())
                }
            }
            return s2.pop()
        }

        fun peek(): Int =
            when {
                s2.isEmpty() -> front
                else -> s2.peek()
            }

        fun empty(): Boolean =
            s1.isEmpty() && s2.isEmpty()
    }
}