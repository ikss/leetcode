package monthly_challenge.may_2020.week1

object RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (ransomNote.isEmpty()) return true
        val letterCount = ransomNote.groupingBy { it }.eachCountTo(mutableMapOf())
        magazine.forEach {
            val value = letterCount[it]
            if (value != null) {
                if (value == 1) {
                    letterCount.remove(it)
                    if (letterCount.isEmpty()) {
                        return true
                    }
                } else {
                    letterCount[it] = value - 1
                }
            }
        }
        return false
    }
}
