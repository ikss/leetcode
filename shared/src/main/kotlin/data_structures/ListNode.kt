package data_structures

data class ListNode(var `val`: Int, var next: ListNode? = null) {

    override fun toString(): String {
        return "$`val` -> $next"
    }
}

object ListBuilder {
    fun build(vararg values: Int): ListNode? {
        if (values.isEmpty()) return null
        return build(values.toList())
    }

    fun build(values: List<Int?>?): ListNode? {
        if (values.isNullOrEmpty()) return null
        return build(values, 0)
    }

    private fun build(values: List<Int?>, index: Int): ListNode? {
        if (index >= values.size) return null
        val `val` = values[index]
            ?: return null
        return ListNode(`val`, build(values, index + 1))
    }
}
