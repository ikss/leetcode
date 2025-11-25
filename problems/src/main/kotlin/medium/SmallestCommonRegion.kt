package medium

/**
 * You are given some lists of regions where the first region of each list includes all other regions in that list.
 *
 * Naturally, if a region x contains another region y then x is bigger than y. Also, by definition,
 * a region x contains itself.
 *
 * Given two regions: region1 and region2, return the smallest region that contains both of them.
 *
 * If you are given regions r1, r2, and r3 such that r1 includes r3, it is guaranteed there is no r2
 * such that r2 includes r3.
 *
 * It is guaranteed the smallest region exists.
 *
 * [URL](https://leetcode.com/problems/smallest-common-region/)
 */
object SmallestCommonRegion {
    fun findSmallestRegion(regions: List<List<String>>, region1: String, region2: String): String {
        val parents = HashMap<String, String>()

        for (r in regions) {
            for (i in 1 until r.size) {
                parents[r[i]] = r[0]
            }
        }

        val parents1 = HashSet<String>()
        var curr = region1
        parents1.add(region1)

        while (true) {
            val parent = parents[curr] ?: break
            parents1.add(parent)
            curr = parent
        }
        curr = region2
        if (parents1.contains(region2)) {
            return region2
        }

        while (true) {
            val parent = parents[curr] ?: break
            if (parents1.contains(parent)) {
                return parent
            }
            curr = parent
        }
        return ""
    }
}
