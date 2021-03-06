package week1

object JewelsAndStones {
    fun numJewelsInStones(J: String, S: String): Int {
        val jewels = J.toCharArray().toSet()
        return S.toCharArray().filter { jewels.contains(it) }.count()
    }
}
