package data_structures

data class TreeNode(val `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

object TreeBuilder {
    fun build(values: List<Int?>?): TreeNode? {
        if (values.isNullOrEmpty()) return null
        return build(values, 0)
    }

    private fun build(values: List<Int?>, index: Int): TreeNode? {
        if (index >= values.size) return null
        val `val` = values[index]
            ?: return null
        return TreeNode(`val`, build(values, index * 2 + 1), build(values, index * 2 + 2))
    }
}
