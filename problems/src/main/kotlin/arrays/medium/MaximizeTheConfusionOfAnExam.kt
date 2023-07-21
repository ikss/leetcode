package arrays.medium

/**
 * A teacher is writing a test with n true/false questions, with 'T' denoting true and 'F' denoting false.
 * He wants to confuse the students by maximizing the number of consecutive questions with the same answer
 * (multiple trues or multiple falses in a row).
 *
 * You are given a string answerKey, where `answerKey[i]` is the original answer to the ith question.
 * In addition, you are given an integer k, the maximum number of times you may perform the following operation:
 * * Change the answer key for any question to 'T' or 'F' (i.e., set `answerKey[i]` to 'T' or 'F').
 * * Return the maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at most
 * k times.
 *
 * [URL](https://leetcode.com/problems/maximize-the-confusion-of-an-exam/)
 */
object MaximizeTheConfusionOfAnExam {
    fun maxConsecutiveAnswersSlidingWindow(answerKey: String, k: Int): Int {
        var result = 0
        val count = HashMap<Char, Int>()
        for (right in answerKey.indices) {
            count.merge(answerKey[right], 1, Integer::sum)
            val minor = minOf(count.getOrDefault('T', 0), count.getOrDefault('F', 0))
            if (minor <= k) {
                result++
            } else {
                val char = answerKey[right - result]
                count.merge(char, -1, Integer::sum)
            }
        }
        return result
    }

    fun maxConsecutiveAnswersPQ(answerKey: String, k: Int): Int {
        val maxT = findSequence('T', answerKey, k)
        val maxF = findSequence('F', answerKey, k)

        return maxOf(maxF, maxT)
    }

    private fun findSequence(char: Char, answerKey: String, k: Int): Int {
        var result = 0
        var start = 0
        val priorityQueue = java.util.ArrayDeque<Int>()
        var k = k

        for (i in answerKey.indices) {
            if (char != answerKey[i]) {
                priorityQueue.offer(i)
                if (k > 0) {
                    k--
                } else {
                    start = priorityQueue.poll() + 1
                }
            }
            result = maxOf(result, i - start + 1)
        }

        return result
    }
}
