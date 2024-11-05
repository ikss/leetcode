package arrays.easy

import java.util.*

/**
 * Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie.
 *
 * Each child i has a greed factor `g[i]`, which is the minimum size of a cookie that the child will be content with;
 * and each cookie j has a size `s[j]`. If `s[j] >= g[i]`, we can assign the cookie j to the child i, and the child i
 * will be content. Your goal is to maximize the number of your content children and output the maximum number.
 *
 * [URL](https://leetcode.com/problems/assign-cookies/)
 */
object AssignCookies {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()
        var currChild = 0
        var currCookie = 0

        while (currCookie < s.size && currChild < g.size) {
            if (s[currCookie] >= g[currChild]) {
                currChild++
            }
            currCookie++
        }
        return currChild
    }
}
