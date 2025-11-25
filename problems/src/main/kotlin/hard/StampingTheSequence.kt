package hard

import java.util.*

/**
 * You are given two strings stamp and target.
 * Initially, there is a string s of length target.length with all `s[i] == '?'`.
 *
 * In one turn, you can place stamp over s and replace every letter in the s with the corresponding letter from stamp.
 *
 * * For example, if stamp = "abc" and target = "abcba", then s is "?????" initially. In one turn you can:
 *     * place stamp at index 0 of s to obtain "abc??",
 *     * place stamp at index 1 of s to obtain "?abc?", or
 *     * place stamp at index 2 of s to obtain "??abc".
 *
 *    Note that stamp must be fully contained in the boundaries of s in order to stamp (i.e., you cannot place stamp
 *    at index 3 of s).
 *
 * We want to convert s to target using at most 10 * target.length turns.
 *
 * Return an array of the index of the left-most letter being stamped at each turn.
 * If we cannot obtain target from s within 10 * target.length turns, return an empty array.
 *
 * [URL](https://leetcode.com/problems/stamping-the-sequence/)
 */
object StampingTheSequence {
    class Node(var made: Set<Int>, var todo: MutableSet<Int>)

    fun movesToStamp(stamp: String, target: String): IntArray {
        val M = stamp.length
        val N = target.length
        val queue: Queue<Int> = ArrayDeque()
        val done = BooleanArray(N)
        val ans: Stack<Int> = Stack()
        val A: MutableList<Node> = ArrayList<Node>()
        for (i in 0..N - M) {
            // For each window [i, i+M), A[i] will contain
            // info on what needs to change before we can
            // reverse stamp at this window.
            val made: MutableSet<Int> = HashSet()
            val todo: MutableSet<Int> = HashSet()
            for (j in 0 until M) {
                if (target[i + j] == stamp[j]) made.add(i + j) else todo.add(i + j)
            }
            A.add(Node(made, todo))

            // If we can reverse stamp at i immediately,
            // enqueue letters from this window.
            if (todo.isEmpty()) {
                ans.push(i)
                for (j in i until i + M) if (!done[j]) {
                    queue.add(j)
                    done[j] = true
                }
            }
        }

        // For each enqueued letter (position),
        while (!queue.isEmpty()) {
            val i = queue.poll()

            // For each window that is potentially affected,
            // j: start of window
            for (j in maxOf(0, i - M + 1)..minOf(N - M, i)) {
                if (A[j].todo.contains(i)) {  // This window is affected
                    A[j].todo.remove(i)
                    if (A[j].todo.isEmpty()) {
                        ans.push(j)
                        for (m in A[j].made) if (!done[m]) {
                            queue.add(m)
                            done[m] = true
                        }
                    }
                }
            }
        }
        for (b in done) {
            if (!b) return IntArray(0)
        }
        val ret = IntArray(ans.size)
        var t = 0
        while (!ans.isEmpty()) {
            ret[t++] = ans.pop()
        }
        return ret
    }
}
