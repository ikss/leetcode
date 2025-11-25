package hard

import java.util.*

/**
 * There are n 1-indexed robots, each having a position on a line, health, and movement direction.
 *
 * You are given 0-indexed integer arrays positions, healths, and a string directions (`directions[i]` is either 'L'
 * for left or 'R' for right). All integers in positions are unique.
 *
 * All robots start moving on the line simultaneously at the same speed in their given directions.
 * If two robots ever share the same position while moving, they will collide.
 *
 * If two robots collide, the robot with lower health is removed from the line, and the health of the other robot
 * decreases by one. The surviving robot continues in the same direction it was going.
 * If both robots have the same health, they are both removed from the line.
 *
 * Your task is to determine the health of the robots that survive the collisions, in the same order that the robots
 * were given, i.e. final heath of robot 1 (if survived), final health of robot 2 (if survived), and so on.
 * If there are no survivors, return an empty array.
 *
 * Return an array containing the health of the remaining robots (in the order they were given in the input),
 * after no further collisions can occur.
 *
 * Note: The positions may be unsorted.
 *
 * [URL](https://leetcode.com/problems/robot-collisions/)
 */
object RobotCollisions {
    private data class Robot(val index: Int, val start: Int, var health: Int, val direction: Char)

    fun survivedRobotsHealths(positions: IntArray, healths: IntArray, directions: String): List<Int> {
        val robots = ArrayList<Robot>()

        for (i in positions.indices) {
            robots.add(Robot(index = i, start = positions[i], health = healths[i], direction = directions[i]))
        }

        robots.sortBy { it.start }

        return checkCollisions(robots)
    }

    private fun checkCollisions(robots: ArrayList<Robot>): List<Int> {
        val stack = Stack<Robot>()

        for (r in robots) {
            if (stack.isEmpty() || stack.peek().direction == 'L' || r.direction == 'R') {
                stack.push(r)
                continue
            }

            while (stack.isNotEmpty() && stack.peek().direction == 'R') {
                val top = stack.pop()
                if (top.health > r.health) {
                    top.health--
                    r.health = 0
                    stack.push(top)
                    break
                } else if (top.health < r.health) {
                    r.health--
                } else {
                    r.health = 0
                    break
                }
            }
            if (r.health > 0) {
                stack.push(r)
            }
        }
        return if (stack.isEmpty()) {
            emptyList()
        } else {
            stack.sortedBy { it.index }.map { it.health }
        }
    }
}