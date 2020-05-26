package week1

class FirstBadVersion(private val versionControl: VersionControl) {
    fun firstBadVersion(n: Int): Int {
        var min = 1
        var max = n
        while (min < max) {
            val curr = min + (max - min) / 2
            if (versionControl.isBadVersion(curr)) {
                max = curr
            } else {
                min = curr + 1
            }
        }
        return min
    }
}

open class VersionControl {
    open fun isBadVersion(version: Int): Boolean {
        return false
    }
}
