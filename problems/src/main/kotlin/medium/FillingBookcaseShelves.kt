package medium

/**
 * You are given an array books where `books[i] = [thicknessi, heighti]` indicates the thickness and height of the
 * ith book. You are also given an integer shelfWidth.
 *
 * We want to place these books in order onto bookcase shelves that have a total width shelfWidth.
 *
 * We choose some of the books to place on this shelf such that the sum of their thickness is less than or equal to
 * shelfWidth, then build another level of the shelf of the bookcase so that the total height of the bookcase has
 * increased by the maximum height of the books we just put down.
 * We repeat this process until there are no more books to place.
 *
 * Note that at each step of the above process, the order of the books we place is the same order as the given sequence of books.
 *  * For example, if we have an ordered list of 5 books, we might place the first and second book onto the first shelf,
 *  the third book on the second shelf, and the fourth and fifth book on the last shelf.
 *  
 * Return the minimum possible height that the total bookshelf can be after placing shelves in this manner.
 *
 * [URL](https://leetcode.com/problems/filling-bookcase-shelves/)
 */
object FillingBookcaseShelves {
    fun minHeightShelves(books: Array<IntArray>, shelfWidth: Int): Int {
        val memo = Array(books.size) { IntArray(shelfWidth + 1)}
        return recursive(0, 0, shelfWidth, memo, books, shelfWidth)
    }

    private fun recursive(currBook: Int, maxHeight: Int, remainingWidth: Int, memo: Array<IntArray>, books: Array<IntArray>, shelfWidth: Int): Int {
        val (currWidth, currHeight) = books[currBook]
        val updatedHeight = maxOf(maxHeight, currHeight)

        if (currBook == books.size - 1) {
            return if (currWidth <= remainingWidth) {
                updatedHeight
            } else {
                maxHeight + currHeight
            }
        }

        if (memo[currBook][remainingWidth] != 0) {
            return memo[currBook][remainingWidth]
        }

        var result = maxHeight + recursive(currBook + 1, currHeight, shelfWidth - currWidth, memo, books, shelfWidth)

        if (currWidth <= remainingWidth) {
            result = minOf(
                result,
                recursive(currBook + 1, updatedHeight, remainingWidth - currWidth, memo, books, shelfWidth)
            )
        }
        memo[currBook][remainingWidth] = result
        return result
    }
}
