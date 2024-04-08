package arrays.easy

/**
 * The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1
 * respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.
 *
 * The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack.
 * At each step:
 * * If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
 * * Otherwise, they will leave it and go to the queue's end.
 *
 * This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
 *
 * You are given two integer arrays students and sandwiches where `sandwiches[i]` is the type of the ith sandwich
 * in the stack (i = 0 is the top of the stack) and `students[j]` is the preference of the jth student in the initial
 * queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
 *
 * [URL](https://leetcode.com/problems/binary-search/)
 */
object NumberOfStudentsUnableToEatLunch {
    fun countStudentsQueue(students: IntArray, sandwiches: IntArray): Int {
        var currSandwich = 0
        val studentsLeft = java.util.ArrayDeque(students.toList())

        var lastServed = 0
        while (studentsLeft.isNotEmpty() && lastServed < studentsLeft.size) {
            val currStudent = studentsLeft.poll()
            if (sandwiches[currSandwich] == currStudent) {
                currSandwich++
                lastServed = 0
            } else {
                studentsLeft.addLast(currStudent)
                lastServed++
            }
        }
        return studentsLeft.size
    }

    fun countStudentsCounting(students: IntArray, sandwiches: IntArray): Int {
        var circleStudentCount = 0
        var squareStudentCount = 0

        for (student in students) {
            if (student == 0) {
                circleStudentCount++
            } else {
                squareStudentCount++
            }
        }

        for (sandwich in sandwiches) {
            if (sandwich == 0 && circleStudentCount == 0) {
                return squareStudentCount
            }
            if (sandwich == 1 && squareStudentCount == 0) {
                return circleStudentCount
            }
            if (sandwich == 0) {
                circleStudentCount--
            } else {
                squareStudentCount--
            }
        }

        return 0
    }
}
