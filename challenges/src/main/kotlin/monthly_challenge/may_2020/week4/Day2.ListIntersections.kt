package monthly_challenge.may_2020.week4

object ListIntersections {
    fun intervalIntersection(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray> {
        val result = mutableListOf<IntArray>()
        var currA = 0
        var currB = 0
        while (currA < A.size && currB < B.size) {
            val currentStart = maxOf(A[currA][0], B[currB][0])
            val currentEnd = minOf(A[currA][1], B[currB][1])
            if (currentStart <= currentEnd) result += intArrayOf(currentStart, currentEnd)
            if (B[currB][1] < A[currA][1]) {
                currB++
            } else {
                currA++
            }
        }
        return result.toTypedArray()
    }
}
