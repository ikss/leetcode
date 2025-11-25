package easy

import interfaces.VersionControl

abstract class FirstBadVersion : VersionControl {
    fun firstBadVersion(n: Int): Int {
        var min = 1
        var max = n
        while (min < max) {
            val curr = min + (max - min) / 2
            if (isBadVersion(curr)) {
                max = curr
            } else {
                min = curr + 1
            }
        }
        return min
    }
}
