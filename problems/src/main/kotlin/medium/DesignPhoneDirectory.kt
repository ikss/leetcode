package medium

/**
 * Design a phone directory that initially has maxNumbers empty slots that can store numbers.
 * The directory should store numbers, check if a certain slot is empty or not, and empty a given slot.
 *
 * Implement the PhoneDirectory class:
 *
 * * PhoneDirectory(int maxNumbers) Initializes the phone directory with the number of available slots maxNumbers.
 * * int get() Provides a number that is not assigned to anyone. Returns -1 if no number is available.
 * * bool check(int number) Returns true if the slot number is available and false otherwise.
 * * void release(int number) Recycles or releases the slot number.
 *
 * [URL](https://leetcode.com/problems/design-phone-directory/)
 */
object DesignPhoneDirectory {
    class PhoneDirectory(maxNumbers: Int) {
        private val queue = java.util.ArrayDeque<Int>(maxNumbers)
        private val free = BooleanArray(maxNumbers) { true }

        init {
            for (i in 0 until maxNumbers) {
                queue.offer(i)
            }
        }

        fun get(): Int {
            if (queue.isEmpty()) {
                return -1
            }
            val num = queue.poll()
            free[num] = false

            return num
        }

        fun check(number: Int): Boolean {
            return free[number]
        }

        fun release(number: Int) {
            if (free[number]) return
            free[number] = true
            queue.offer(number)
        }

    }
}
