package data_structures

data class TreeNode(val `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

object TreeBuilder {
    fun build(vararg values: Int?): TreeNode? {
        return build(values.toList())
    }

    private fun build(values: List<Int?>): TreeNode? {
        if (values.isEmpty()) return null
        val root = TreeNode(values.first()!!)
        var index = 1
        val queue = java.util.ArrayDeque<TreeNode>()
        queue.offer(root)

        while (index < values.size && queue.isNotEmpty()) {
            val node = queue.poll()!!
            // add left
            values[index++]?.let {
                node.left = TreeNode(it).also(queue::add)
            }
            if (index >= values.size) break
            // add right
            values[index++]?.let {
                node.right = TreeNode(it).also(queue::add)
            }
        }
        return root
    }
}
