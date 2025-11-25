package hard

/**
 * Due to a bug, there are many duplicate folders in a file system. You are given a 2D array paths,
 * where `paths[i]` is an array representing an absolute path to the ith folder in the file system.
 *
 * For example, ["one", "two", "three"] represents the path "/one/two/three".
 * Two folders (not necessarily on the same level) are identical if they contain the same non-empty set of identical
 * subfolders and underlying subfolder structure. The folders do not need to be at the root level to be identical.
 * If two or more folders are identical, then mark the folders as well as all their subfolders.
 *
 * * For example, folders "/a" and "/b" in the file structure below are identical.
 * They (as well as their subfolders) should all be marked:
 * * * /a
 * * * /a/x
 * * * /a/x/y
 * * * /a/z
 * * * /b
 * * * /b/x
 * * * /b/x/y
 * * * /b/z
 *
 * * However, if the file structure also included the path "/b/w", then the folders "/a" and "/b" would not be identical.
 *
 * Note that "/a/x" and "/b/x" would still be considered identical even with the added folder.
 * Once all the identical folders and their subfolders have been marked, the file system will delete all of them.
 * The file system only runs the deletion once, so any folders that become identical after the initial deletion are not deleted.
 *
 * Return the 2D array ans containing the paths of the remaining folders after deleting all the marked folders.
 * The paths may be returned in any order.
 *
 * [URL](https://leetcode.com/problems/delete-duplicate-folders-in-system/)
 */
object DeleteDuplicateFoldersInSystem {

    private class Trie {
        var serial: String? = null // current node structure's serialized representation
        var children = LinkedHashMap<String, Trie>() // current node's child nodes
    }

    fun deleteDuplicateFolder(paths: List<List<String>>): List<List<String>> {
        val root = Trie() // root node

        // build a trie tree
        for (path in paths) {
            var cur = root
            for (node in path) {
                cur = cur.children.computeIfAbsent(node) { Trie() }
            }
        }

        val freq = HashMap<String, Int>()
        construct(root, freq)

        val result = ArrayList<ArrayList<String>>()
        // operate the trie, delete duplicate folders
        operate(root, freq, ArrayList(), result)

        return result
    }

    private fun construct(node: Trie, freq: MutableMap<String, Int>) {
        if (node.children.isEmpty()) return  // if it is a leaf node, no operation is needed.

        val v = ArrayList<String>()
        for (entry in node.children.entries) {
            construct(entry.value, freq)
            v.add(entry.key + "(" + entry.value.serial + ")")
        }

        v.sort()
        val sb = StringBuilder()
        for (s in v) {
            sb.append(s)
        }
        node.serial = sb.toString()
        val prev = freq.getOrDefault(node.serial, 0)
        if (prev > 1) return
        freq.put(node.serial!!, prev + 1)
    }

    private fun operate(
        node: Trie,
        freq: Map<String, Int>,
        path: ArrayList<String>,
        ans: ArrayList<ArrayList<String>>,
    ) {
        if (freq.getOrDefault(node.serial, 0) > 1) return

        if (!path.isEmpty()) {
            ans.add(ArrayList(path))
        }

        for (entry in node.children.entries) {
            path.add(entry.key)
            operate(entry.value, freq, path, ans)
            path.removeLast()
        }
    }
}
