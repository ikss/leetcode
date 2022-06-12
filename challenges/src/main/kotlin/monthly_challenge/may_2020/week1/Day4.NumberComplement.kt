package monthly_challenge.may_2020.week1

object NumberComplement {
    fun findComplement(num: Int): Int {
        var mask = 0
        while (mask < num) {
            mask = mask shl 1 or 1
        }
        return num xor mask
    }
}
