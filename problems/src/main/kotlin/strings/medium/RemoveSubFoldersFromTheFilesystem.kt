package strings.medium

/**
 * Given a list of folders folder, return the folders after removing all sub-folders in those folders.
 * You may return the answer in any order.
 *
 * If a `folder[i]` is located within another `folder[j]`, it is called a sub-folder of it. A sub-folder of `folder[j]`
 * must start with folder[j], followed by a "/". For example, "/a/b" is a sub-folder of "/a",
 * but "/b" is not a sub-folder of "/a/b/c".
 *
 * The format of a path is one or more concatenated strings of the form: '/' followed by one or more lowercase English
 * letters.
 *
 * For example, "/leetcode" and "/leetcode/problems" are valid paths while an empty string and "/" are not.
 *
 * [URL](https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/)
 */
object RemoveSubFoldersFromTheFilesystem {
    private data class TrieNode(var present: Boolean = false) {
        val nodes = HashMap<String, TrieNode>()
    }

    fun removeSubfolders(folder: Array<String>): List<String> {
        folder.sort()

        val root = TrieNode()
        val result = ArrayList<String>()

        for (path in folder) {
            var curr = root
            var found = false
            for (f in path.split('/')) {
                if (f.isEmpty()) continue
                if (curr.present) {
                    found = true
                    break
                }
                curr = curr.nodes.computeIfAbsent(f) { TrieNode() }
            }
            curr.present = true
            if (!found) result.add(path)
        }

        return result
    }
}