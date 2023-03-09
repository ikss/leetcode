package data_structures

class ListNodeCycled(var `val`: Int, var next: ListNodeCycled? = null) {
    fun last(): ListNodeCycled {
        var node = this
        while (node.next != null) {
            node = node.next!!
        }
        return node
    }

    override fun toString(): String {
        return "$`val` -> $next"
    }
}

data class ListNode(var `val`: Int, var next: ListNode? = null) {
    fun last(): ListNode {
        var node = this
        while (node.next != null) {
            node = node.next!!
        }
        return node
    }

    override fun toString(): String {
        return "$`val` -> $next"
    }
}

object ListBuilder {
    fun build(): ListNode? = null

    fun build(vararg values: Int): ListNode {
        return build(values.toList(), 0)!!
    }

    private fun build(values: List<Int?>, index: Int): ListNode? {
        if (index >= values.size) return null
        val `val` = values[index]
            ?: return null
        return ListNode(`val`, build(values, index + 1))
    }

    fun buildCycled(): ListNodeCycled? = null

    fun buildCycled(vararg values: Int): ListNodeCycled {
        return buildCycled(values.toList(), 0)!!
    }

    private fun buildCycled(values: List<Int?>, index: Int): ListNodeCycled? {
        if (index >= values.size) return null
        val `val` = values[index]
            ?: return null
        return ListNodeCycled(`val`, buildCycled(values, index + 1))
    }
}
