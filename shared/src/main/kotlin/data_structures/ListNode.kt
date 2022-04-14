package data_structures

data class ListNode(var value: Int, var next: ListNode? = null) {

    override fun toString(): String {
        return "$value -> $next"
    }
}
