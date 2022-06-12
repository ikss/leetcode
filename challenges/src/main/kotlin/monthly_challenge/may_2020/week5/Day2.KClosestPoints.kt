package monthly_challenge.may_2020.week5

object KClosestPoints {

    fun kClosest(points: Array<IntArray>, K: Int): Array<IntArray> {
        return points.sortedBy { Math.sqrt(it[0] * it[0] + it[1] * it[1].toDouble()) }
            .take(K)
            .toTypedArray()
    }
}
