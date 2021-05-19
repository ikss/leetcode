package collections.linked_lists.medium

class ListNode(var value: Int) {
    var next: ListNode? = null

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
        return "ListNode(`val`=$value, next=$next)"
    }
}

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val result = ListNode(0)
        var p = l1
        var q = l2
        var curr = result
        var carry = 0
        while (p != null || q != null) {
            val x = p?.value ?: 0
            val y = q?.value ?: 0
            val sum = x + y + carry
            carry = sum / 10
            curr.next = ListNode(sum % 10)
            curr = curr.next!!
            p = p?.next
            q = q?.next
        }
        if (carry > 0) {
            curr.next = ListNode(carry)
        }
        return result.next
    }

}
