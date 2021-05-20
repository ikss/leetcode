package collections.linked_lists.util

class ListNode(var value: Int, var next: ListNode? = null) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListNode

        var l: ListNode? = this
        var r: ListNode? = other
        while (l != null && r != null) {
            if (l.value != r.value) return false
            l = l.next
            r = r.next
        }
        return l == r
    }

    override fun hashCode(): Int {
        var result = value
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "$value -> $next"
    }
}
