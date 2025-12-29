package medium

/**
 * You are stacking blocks to form a pyramid. Each block has a color, which is represented by a single letter.
 * Each row of blocks contains one less block than the row beneath it and is centered on top.
 *
 * To make the pyramid aesthetically pleasing, there are only specific triangular patterns that are allowed.
 * A triangular pattern consists of a single block stacked on top of two blocks. The patterns are given as a list of
 * three-letter strings allowed, where the first two characters of a pattern represent the left and right bottom blocks
 * respectively, and the third character is the top block.
 *
 * * For example, "ABC" represents a triangular pattern with a 'C' block stacked on top of an 'A' (left) and 'B' (right)
 * block. Note that this is different from "BAC" where 'B' is on the left bottom and 'A' is on the right bottom.
 *
 * You start with a bottom row of blocks bottom, given as a single string, that you must use as the base of the pyramid.
 *
 * Given bottom and allowed, return true if you can build the pyramid all the way to the top such that every triangular
 * pattern in the pyramid is in allowed, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/pyramid-transition-matrix/)
 */
object PyramidTransitionMatrix {
    fun pyramidTransition(bottom: String, allowed: List<String>): Boolean {
        val allowedMap = HashMap<Pair<Char, Char>, ArrayList<Char>>()

        for (s in allowed) {
            allowedMap.computeIfAbsent(s[0] to s[1]) { ArrayList() }.add(s[2])
        }

        val seen = HashSet<String>()

        return checkTransition(bottom, allowedMap, 0, StringBuilder(), seen)
    }

    private fun checkTransition(
        str: String,
        allowedMap: Map<Pair<Char, Char>, ArrayList<Char>>,
        curr: Int,
        builder: StringBuilder,
        seen: HashSet<String>,
    ): Boolean {
        if (str.length == 1) return true

        if (builder.length == str.length - 1) {
            val newStr = builder.toString()
            if (!seen.add(newStr)) return false

            return checkTransition(newStr, allowedMap, 0, StringBuilder(), seen)
        }

        val nextchars = allowedMap[str[curr] to str[curr + 1]] ?: return false

        for (next in nextchars) {
            builder.append(next)
            if (checkTransition(str, allowedMap, curr + 1, builder, seen)) {
                return true
            }
            builder.setLength(builder.length - 1)
        }

        return false
    }
}