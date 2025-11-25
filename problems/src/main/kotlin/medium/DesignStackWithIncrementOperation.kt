package medium

/**
 * Design a stack that supports increment operations on its elements.
 *
 * Implement the CustomStack class:
 * * CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack.
 * * void push(int x) Adds x to the top of the stack if the stack has not reached the maxSize.
 * * int pop() Pops and returns the top of the stack or -1 if the stack is empty.
 * * void inc(int k, int val) Increments the bottom k elements of the stack by val.
 * If there are less than k elements in the stack, increment all the elements in the stack.
 *
 * [URL](https://leetcode.com/problems/design-a-stack-with-increment-operation/)
 */
object DesignStackWithIncrementOperation {
    class CustomStack(val maxSize: Int) {
        private val array = IntArray(maxSize)
        var head = -1

        fun push(x: Int) {
            if (head == maxSize - 1) return

            array[++head] = x
        }

        fun pop(): Int {
            if (head == -1) return -1

            return array[head--]
        }

        fun increment(k: Int, `val`: Int) {
            for (i in 0 until minOf(k, head + 1)) {
                array[i] += `val`
            }
        }

    }
}