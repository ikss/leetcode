package medium

/**
 * You are asked to design a file system that allows you to create new paths and associate them with different values.
 *
 * The format of a path is one or more concatenated strings of the form: / followed by one or more lowercase English
 * letters. For example, "/leetcode" and "/leetcode/problems" are valid paths while an empty string "" and "/" are not.
 *
 * Implement the FileSystem class:
 * * bool createPath(string path, int value) Creates a new path and associates a value to it if possible and returns true.
 * Returns false if the path already exists or its parent path doesn't exist.
 * * int get(string path) Returns the value associated with path or returns -1 if the path doesn't exist.
 *
 * [URL](https://leetcode.com/problems/design-file-system/)
 */
object DesignFileSystem {
    class FileSystem() {
        private data class PathNode(val value: Int) {
            val children = HashMap<String, PathNode>()
        }

        private val parent = PathNode(-1)


        fun createPath(path: String, value: Int): Boolean {
            var curr = parent
            val paths = path.split('/')

            for (i in 1 until paths.size - 1) {
                val p = paths[i]
                if (p.isEmpty()) return false
                curr = curr.children[p] ?: return false
            }
            val last = paths.last()

            if (last in curr.children) return false
            curr.children[last] = PathNode(value)
            return true
        }

        fun get(path: String): Int {
            var curr = parent
            val paths = path.split('/')

            for (i in 1 until paths.size) {
                val p = paths[i]
                if (p.isEmpty()) return -1
                curr = curr.children[p] ?: return -1
            }
            return curr.value
        }

    }
}