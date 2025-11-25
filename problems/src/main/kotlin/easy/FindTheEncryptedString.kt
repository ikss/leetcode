package easy

/**
 * You are given a string s and an integer k. Encrypt the string using the following algorithm:
 *
 * For each character c in s, replace c with the kth character after c in the string (in a cyclic manner).
 * Return the encrypted string.
 *
 * [URL](https://leetcode.com/problems/find-the-encrypted-string/)
 */
object FindTheEncryptedString {
    fun getEncryptedString(s: String, k: Int): String {
        val builder = StringBuilder(s.length)

        for (i in s.indices) {
            builder.append(s[(i + k) % s.length])
        }

        return builder.toString()
    }
}
