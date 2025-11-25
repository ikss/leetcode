package medium

/**
 * A room is represented by a 0-indexed 2D binary matrix room where a 0 represents an empty space and a 1 represents
 * a space with an object. The top left corner of the room will be empty in all test cases.
 *
 * A cleaning robot starts at the top left corner of the room and is facing right.
 * The robot will continue heading straight until it reaches the edge of the room or it hits an object,
 * after which it will turn 90 degrees clockwise and repeat this process.
 * The starting space and all spaces that the robot visits are cleaned by it.
 *
 * Return the number of clean spaces in the room if the robot runs indefinetely.
 *
 * [URL](https://leetcode.com/problems/number-of-spaces-cleaning-robot-cleaned/)
 */
object NumberOfSpacesCleaningRobotCleaned {
    val directions = listOf(0 to 1, 1 to 0, 0 to -1, -1 to 0)

    fun numberOfCleanRooms(room: Array<IntArray>): Int {
        var dir = 0
        var result = 0
        var i = 0
        var j = 0

        while (room[i][j] != (-dir - 1)) {
            if (room[i][j] == 0) {
                result++
                room[i][j] = -dir - 1
            }
            val (di, dj) = directions[dir]
            val nexti = i + di
            val nextj = j + dj
            if (nexti !in room.indices || nextj !in room[0].indices || room[nexti][nextj] == 1) {
                dir = (dir + 1) % 4
                continue
            }
            i = nexti
            j = nextj
        }

        return result
    }

}