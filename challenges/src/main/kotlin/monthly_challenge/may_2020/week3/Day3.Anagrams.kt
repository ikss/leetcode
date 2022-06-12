package monthly_challenge.may_2020.week3

object Anagrams {
    fun findAnagrams(s: String, p: String): List<Int> {
        val result = mutableListOf<Int>()
        val hash = IntArray(26)
        for (element in p) {
            hash[element - 'a']++
        }
        var start = 0
        var end = 0
        var count = p.length
        while (end < s.length) {
            if (hash[s[end++] - 'a']-- >= 1) {
                count--
            }
            if (count == 0) {
                result.add(start)
            }
            if (end - start == p.length && hash[s[start++] - 'a']++ >= 0) {
                count++
            }
        }
        return result
    }
}
