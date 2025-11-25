package medium

/**
 * Design a Snake game that is played on a device with screen size height x width. Play the game online if you are not
 * familiar with the game.
 *
 * The snake is initially positioned at the top left corner (0, 0) with a length of 1 unit.
 *
 * You are given an array food where `food[i] = (ri, ci)` is the row and column position of a piece of food that the
 * snake can eat. When a snake eats a piece of food, its length and the game's score both increase by 1.
 *
 * Each piece of food appears one by one on the screen, meaning the second piece of food will not appear until the
 * snake eats the first piece of food.
 *
 * When a piece of food appears on the screen, it is guaranteed that it will not appear on a block occupied by the snake.
 *
 * The game is over if the snake goes out of bounds (hits a wall) or if its head occupies a space that its body occupies
 * after moving (i.e. a snake of length 4 cannot run into itself).
 *
 * Implement the SnakeGame class:
 *
 * SnakeGame(int width, int height, int[][] food) Initializes the object with a screen of size
 * height x width and the positions of the food.
 * int move(String direction) Returns the score of the game after applying one direction move by the snake.
 * If the game is over, return -1.
 *
 * [URL](https://leetcode.com/problems/design-snake-game/)
 */
object DesignSnakeGame {
    class SnakeGame(val width: Int, val height: Int, val food: Array<IntArray>) {

        data class Node(var position: Pair<Int, Int>) {
            var next: Node? = null
        }

        private val directions = mapOf(
            "U" to (-1 to 0),
            "D" to (1 to 0),
            "L" to (0 to -1),
            "R" to (0 to 1),
        )
        private var head = Node(0 to 0)
        private var currFood = 0
        private var score = 0

        fun move(direction: String): Int {
            val newPos = getNewHeadPos(direction)
            val (newr, newc) = newPos

            if (newr !in 0..<height || newc !in 0..<width) {
                return -1
            }

            if (currFood < food.size) {
                val (foodr, foodc) = food[currFood]
                if (foodr == newr && foodc == newc) {
                    currFood++
                    val newHead = Node(newr to newc)
                    newHead.next = head
                    head = newHead
                    return ++score
                }
            }

            val bodyPositions = HashSet<Pair<Int, Int>>()
            var node = head

            while (node.next != null) {
                bodyPositions.add(node.position)
                node = node.next!!
            }

            if (newPos in bodyPositions) {
                return -1
            }

            val newHead = Node(newPos)
            newHead.next = head
            head = newHead

            // If no food was eaten, remove the tail
            // Find the node before tail
            node = head
            while (node.next?.next != null) {
                node = node.next!!
            }
            // Remove the tail
            node.next = null

            return score
        }

        private fun getNewHeadPos(direction: String): Pair<Int, Int> {
            val (dr, dc) = directions[direction]!!
            val (curr, curc) = head.position

            return dr + curr to dc + curc
        }

    }
}