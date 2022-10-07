package numbers.hard

/**
 * A k-mirror number is a positive integer without leading zeros that reads the same both forward and backward
 * in base-10 as well as in base-k.
 *
 * * For example, 9 is a 2-mirror number. The representation of 9 in base-10 and base-2 are 9 and 1001 respectively,
 * which read the same both forward and backward.
 * * On the contrary, 4 is not a 2-mirror number. The representation of 4 in base-2 is 100, which does not read the same
 * both forward and backward.
 *
 * Given the base k and the number n, return the sum of the n smallest k-mirror numbers.
 *
 * [URL](https://leetcode.com/problems/sum-of-k-mirror-numbers/)
 */
object SumOfKMirrorNumbers {
    private val baseNums1 = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    private val baseNums2 = listOf("00", "11", "22", "33", "44", "55", "66", "77", "88", "99")

    fun kMirror(k: Int, n: Int): Long {
        var sum = 0L
        var n = n
        var nums1 = ArrayList(baseNums1)
        var nums2 = ArrayList(baseNums2)
        var round = 0

        for (strnum in nums1) { // find all 1-symbol palindromes
            val num = strnum.toLong()
            if (strnum[0] == '0' || num == 0L) continue
            if (isPalindrome(num.toString(k))) {
                sum += num
                println(num)
                if (--n == 0) return sum
            }
        }

        for (strnum in nums2) {// find all 2-symbol palindromes
            val num = strnum.toLong()
            if (strnum[0] == '0' || num == 0L) continue
            if (isPalindrome(num.toString(k))) {
                sum += num
                println(num)
                if (--n == 0) return sum
            }
        }

        while (n > 0) {// find more than 2-symbol palindromes
            val nums = when {
                round % 2 == 0 -> nums1
                else -> nums2
            }
            val newNums = ArrayList<String>()
            for (base in baseNums1) {
                for (strnum in nums) {
                    val newStr = base + strnum + base
                    newNums.add(newStr)

                    val num = newStr.toLong()
                    if (newStr[0] == '0' || num == 0L) continue
                    if (isPalindrome(num.toString(k))) {
                        sum += num
                        println(num)
                        if (--n == 0) return sum
                    }
                }
            }
            if (round++ % 2 == 0) {
                nums1 = newNums
            } else {
                nums2 = newNums
            }
        }
        return sum
    }

    private fun isPalindrome(s: String): Boolean {
        for (i in 0..s.length / 2) {
            if (s[i] != s[s.length - i - 1]) return false
        }
        return true
    }
}
