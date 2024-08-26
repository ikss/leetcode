package data_structures

data class NaryTreeNode(val `val`: Int, var children: List<NaryTreeNode?> = emptyList())

object NaryTreeBuilder {
    fun build(vararg values: Int?): NaryTreeNode? {
        return build(values.toList())
    }

    private fun build(values: List<Int?>): NaryTreeNode? {
        val rootVal = values.firstOrNull() ?: return null
        val root = NaryTreeNode(rootVal)
        var index = 2
        val queue = java.util.ArrayDeque<NaryTreeNode>()
        queue.offer(root)

        while (index < values.size && queue.isNotEmpty()) {
            val currNode = queue.poll()!!
            
            // add current level
            val currLevel = ArrayList<NaryTreeNode>()
            while (index < values.size && values[index] != null) {
                val childNode = NaryTreeNode(values[index++]!!)
                currLevel.add(childNode)
                queue.offer(childNode)
            }
            currNode.children = currLevel
            // skip null
            index++
        }
        return root
    }
}