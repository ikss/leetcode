package monthly_challenge.may_2020.week1

object FirstUniqueCharacterInString {
    fun firstUniqChar(s: String): Int {
        val temp = IntArray(26)
        val charArr = s.toCharArray()
        charArr.forEach {
            temp[it - 'a']++
        }
        charArr.forEachIndexed { index, char ->
            if (temp[char - 'a'] == 1) return index
        }
        return -1
    }
}
