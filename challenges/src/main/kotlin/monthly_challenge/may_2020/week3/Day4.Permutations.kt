package monthly_challenge.may_2020.week3

object Permutation {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val hash = IntArray(26)
        for (element in s1) {
            hash[element - 'a']++
        }
        var start = 0
        var end = 0
        var count = s1.length
        while (end < s2.length) {
            if (hash[s2[end++] - 'a']-- >= 1) {
                count--
            }
            if (count == 0) {
                return true
            }
            if (end - start == s1.length && hash[s2[start++] - 'a']++ >= 0) {
                count++
            }
        }
        return false
    }
}
