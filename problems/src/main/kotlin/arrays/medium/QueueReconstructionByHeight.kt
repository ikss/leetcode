package arrays.medium

import java.util.*

/**
 * You are given an array of people, people, which are the attributes of some people in a queue
 * (not necessarily in order). Each `people[i] = [hi, ki]` represents the ith person of height hi with exactly ki other
 * people in front who have a height greater than or equal to hi.
 *
 * Reconstruct and return the queue that is represented by the input array people. The returned queue should be
 * formatted as an array queue, where q`ueue[j] = [hj, kj]` is the attributes of the jth person in the queue
 * (`queue[0]` is the person at the front of the queue).
 *
 * [URL](https://leetcode.com/problems/queue-reconstruction-by-height/)
 */
object QueueReconstructionByHeight {
    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        //pick up the tallest guy first
        //when insert the next tall guy, just need to insert him into kth position
        //repeat until all people are inserted into list
        people.sortWith { o1, o2 -> if (o1[0] != o2[0]) o2[0] - o1[0] else o1[1] - o2[1] }
        val res = LinkedList<IntArray>()
        for (cur in people) {
            res.add(cur[1], cur)
        }
        return res.toTypedArray()
    }
}