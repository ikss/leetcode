package monthly_challenge.may_2020.week1

object JewelsAndStones {
    fun numJewelsInStones(J: String, S: String): Int {
        val jewels = J.toCharArray().toSet()
        return S.toCharArray().count { jewels.contains(it) }
    }
}
