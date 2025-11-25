package hard

import java.util.*


/**
 * You have a movie renting company consisting of n shops.
 * You want to implement a renting system that supports searching for, booking, and returning movies.
 * The system should also support generating a report of the currently rented movies.
 *
 * Each movie is given as a 2D integer array entries where `entries[i] = [shopi, moviei, pricei]` indicates that there
 * is a copy of movie moviei at shop shopi with a rental price of pricei.
 * Each shop carries at most one copy of a movie moviei.
 *
 * The system should support the following functions:
 * * Search: Finds the cheapest 5 shops that have an unrented copy of a given movie.
 * The shops should be sorted by price in ascending order, and in case of a tie, the one with the smaller shopi should
 * appear first. If there are less than 5 matching shops, then all of them should be returned.
 * If no shop has an unrented copy, then an empty list should be returned.
 * * Rent: Rents an unrented copy of a given movie from a given shop.
 * * Drop: Drops off a previously rented copy of a given movie at a given shop.
 * * Report: Returns the cheapest 5 rented movies (possibly of the same movie ID) as a 2D list res where
 * `res[j] = [shopj, moviej]` describes that the jth cheapest rented movie moviej was rented from the shop shopj.
 * The movies in res should be sorted by price in ascending order, and in case of a tie, the one with the smaller shopj
 * should appear first, and if there is still tie, the one with the smaller moviej should appear first.
 * If there are fewer than 5 rented movies, then all of them should be returned. If no movies are currently being rented,
 * then an empty list should be returned.
 *
 * Implement the MovieRentingSystem class:
 * * MovieRentingSystem(int n, int[][] entries) Initializes the MovieRentingSystem object with n shops and the movies in entries.
 * * List<Integer> search(int movie) Returns a list of shops that have an unrented copy of the given movie as described above.
 * * void rent(int shop, int movie) Rents the given movie from the given shop.
 * * void drop(int shop, int movie) Drops off a previously rented movie at the given shop.
 * * List<List<Integer>> report() Returns a list of cheapest rented movies as described above.
 *
 * Note: The test cases will be generated such that rent will only be called if the shop has an unrented copy of the
 * movie, and drop will only be called if the shop had previously rented out the movie.
 *
 * [URL](https://leetcode.com/problems/design-movie-rental-system/)
 */
object DesignMovieRentalSystem {
    class MovieRentingSystem(n: Int, entries: Array<IntArray>) {
        data class Node(val shop: Int, val movie: Int, val price: Int)

        // Order: price ↑, shop ↑, movie ↑  (strict: never returns 0 for distinct nodes)
        val comparator: Comparator<Node> = Comparator { a: Node, b: Node ->
            var c = a.price.compareTo(b.price)
            if (c != 0) return@Comparator c
            c = a.shop.compareTo(b.shop)
            if (c != 0) return@Comparator c
            a.movie.compareTo(b.movie)
        }

        // Available copies grouped by movie
        private val availableByMovie = HashMap<Int, TreeSet<Node>>()

        // All currently rented copies
        private val rentedSet = TreeSet<Node>(comparator)

        // Quick lookup from (shop, movie) -> Node
        private val byPair = HashMap<Long, Node>()

        private fun key(shop: Int, movie: Int): Long {
            return ((shop.toLong()) shl 32) xor (movie.toLong() and 0xffffffffL)
        }

        init {
            for (e in entries) {
                val shop = e[0]
                val movie = e[1]
                val price = e[2]
                val node = Node(shop, movie, price)
                byPair[key(shop, movie)] = node
                availableByMovie.computeIfAbsent(movie) { _ -> TreeSet<Node>(comparator) }.add(node)
            }
        }

        // Return up to 5 shops with this movie, cheapest then shop asc.
        fun search(movie: Int): List<Int> {
            val ans = ArrayList<Int>(5)
            val set = availableByMovie.get(movie)
            if (set.isNullOrEmpty()) return ans

            return set.asSequence().take(5).map(Node::shop).toList()
        }

        // Move (shop,movie) from available -> rented
        fun rent(shop: Int, movie: Int) {
            val k = key(shop, movie)
            val node = byPair.get(k) ?: return

            val set = availableByMovie.get(movie)
            set?.remove(node)
            rentedSet.add(node)
        }

        // Move (shop,movie) from rented -> available
        fun drop(shop: Int, movie: Int) {
            val k = key(shop, movie)
            val node = byPair.get(k) ?: return

            rentedSet.remove(node)
            availableByMovie
                .computeIfAbsent(movie) { _ -> TreeSet<Node>(comparator) }
                .add(node)
        }

        // Return up to 5 rented copies [shop, movie], cheapest then shop asc, then movie asc.
        fun report(): List<List<Int>> {
            return rentedSet.asSequence().take(5).map { listOf(it.shop, it.movie) }.toList()
        }
    }
}