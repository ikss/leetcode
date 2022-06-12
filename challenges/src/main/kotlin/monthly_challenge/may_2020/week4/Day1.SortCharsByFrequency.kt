package monthly_challenge.may_2020.week4

object SortCharsByFrequency {
    fun frequencySort(s: String): String {
        return s.groupBy { it }
            .map { entry -> entry.key to entry.value.size }
            .sortedByDescending { it.second }
            .joinToString(separator = "") { it.first.toString().repeat(it.second) }
    }
}
