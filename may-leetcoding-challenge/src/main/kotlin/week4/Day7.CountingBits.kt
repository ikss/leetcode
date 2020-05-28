package week4

object CountingBits {
    fun countBits(num: Int): IntArray {
        val result = IntArray(num + 1)
        result[0] = 0
        for (i in 1..num) {
            result[i] = result[i / 2] + i % 2
        }
        return result
    }
}
