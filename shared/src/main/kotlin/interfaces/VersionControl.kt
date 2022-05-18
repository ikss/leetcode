package interfaces

interface VersionControl {
    fun isBadVersion(version: Int): Boolean
}
