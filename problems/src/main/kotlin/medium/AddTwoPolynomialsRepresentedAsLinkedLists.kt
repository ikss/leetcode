package medium

/**
 * A polynomial linked list is a special type of linked list where every node represents a term in a polynomial
 * expression.
 *
 * Each node has three attributes:
 * * coefficient: an integer representing the number multiplier of the term. The coefficient of the term 9x4 is 9.
 * * power: an integer representing the exponent. The power of the term 9x4 is 4.
 * *  next: a pointer to the next node in the list, or null if it is the last node of the list.
 *
 * Given two polynomial linked list heads, poly1 and poly2, add the polynomials together and return the head of the sum
 * of the polynomials.
 *
 * [URL](https://leetcode.com/problems/add-two-polynomials-represented-as-linked-lists/)
 */
object AddTwoPolynomialsRepresentedAsLinkedLists {
    data class PolyNode(
        var coefficient: Int,
        var power: Int,
        var next: PolyNode? = null,
    )

    fun addPoly(poly1: PolyNode?, poly2: PolyNode?): PolyNode? {
        if (poly1 == null) {
            return poly2
        }

        if (poly2 == null) {
            return poly1
        }
        val next: PolyNode?
        val curr: PolyNode?

        if (poly1.power > poly2.power) {
            curr = poly1
            next = addPoly(poly1.next, poly2)
        } else if (poly1.power < poly2.power) {
            curr = poly2
            next = addPoly(poly1, poly2.next)
        } else {
            next = addPoly(poly1.next, poly2.next)
            val newCoeff = poly1.coefficient + poly2.coefficient
            if (newCoeff == 0) return next
            curr = PolyNode(newCoeff, poly1.power)
        }
        curr.next = next

        return curr
    }

}
