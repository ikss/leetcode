package medium

/**
 * Given two version numbers, version1 and version2, compare them.
 *
 * Version numbers consist of one or more revisions joined by a dot '.'.
 * Each revision consists of digits and may contain leading zeros. Every revision contains at least one character.
 * Revisions are 0-indexed from left to right, with the leftmost revision being revision 0,
 * the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.
 *
 * To compare version numbers, compare their revisions in left-to-right order. Revisions are compared using their
 * integer value ignoring any leading zeros. This means that revisions 1 and 001 are considered equal. If a version
 * number does not specify a revision at an index, then treat the revision as 0. For example, version 1.0 is less than
 * version 1.1 because their revision 0s are the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.
 *
 * Return the following:
 * * If version1 < version2, return -1.
 * * If version1 > version2, return 1.
 * * Otherwise, return 0.
 *
 * [URL](https://leetcode.com/problems/compare-version-numbers/)
 */
object CompareVersionNumbers {
    fun compareVersion(version1: String, version2: String): Int {
        var i1 = 0
        var i2 = 0

        while (i1 < version1.length || i2 < version2.length) {
            val parsed1 = parseVersion(version1, i1)
            i1 = parsed1.first
            val v1 = parsed1.second
            val parsed2 = parseVersion(version2, i2)
            i2 = parsed2.first
            val v2 = parsed2.second

            if (v1 < v2) {
                return -1
            } else if (v1 > v2) {
                return 1
            }
        }

        return 0
    }

    private fun parseVersion(version: String, index: Int): Pair<Int, Int> {
        if (index >= version.length) return index to 0

        var v = 0
        var i = index

        while (i < version.length) {
            val ch = version[i++]
            if (ch == '.') break
            else if (ch == '0' && v == 0) continue
            v = v * 10 + (ch - '0')
        }

        return i to v
    }
}