package medium

import java.util.*

/**
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0.
 * Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
 *
 * When you visit a room, you may find a set of distinct keys in it. Each key has a number on it,
 * denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
 *
 * Given an array rooms where `rooms[i]` is the set of keys that you can obtain if you visited room i,
 * return true if you can visit all the rooms, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/keys-and-rooms/)
 */
object KeysAndRooms {
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val size = rooms.size
        val keys = Stack<Int>()
        val visited = hashSetOf<Int>()
        keys.push(0)
        while (keys.isNotEmpty()) {
            val key = keys.pop()
            if (!visited.add(key)) continue
            for (k in rooms[key]) {
                if (!visited.contains(k)) keys.push(k)
            }
        }
        return visited.size == size
    }
}
