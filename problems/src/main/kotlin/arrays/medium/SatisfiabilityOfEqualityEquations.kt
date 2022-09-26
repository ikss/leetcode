package arrays.medium

/**
 * You are given an array of strings equations that represent relationships between variables
 * where each string `equations[i]` is of length 4 and takes one of two different forms: "xi==yi" or "xi!=yi".
 * Here, xi and yi are lowercase letters (not necessarily different) that represent one-letter variable names.
 *
 * Return true if it is possible to assign integers to variable names so as to satisfy all the given equations,
 * or false otherwise.
 *
 * [URL](https://leetcode.com/problems/satisfiability-of-equality-equations/)
 */
object SatisfiabilityOfEqualityEquations {
    fun equationsPossible(equations: Array<String>): Boolean {
        val parents = IntArray(26) { it }

        for (e in equations) {
            if (e[1] == '=') {
                val first = e[0] - 'a'
                val second = e[3] - 'a'
                connect(first, second, parents)
            }
        }
        for (e in equations) {
            if (e[1] == '!') {
                val first = e[0] - 'a'
                val second = e[3] - 'a'
                if (findRoot(first, parents) == findRoot(second, parents)) {
                    return false
                }
            }
        }
        return true
    }

    private fun connect(first: Int, second: Int, parents: IntArray) {
        val roota = findRoot(first, parents)
        val rootb = findRoot(second, parents)
        if (roota == rootb) return

        if (first < second) {
            parents[rootb] = roota
        } else {
            parents[roota] = rootb
        }
    }

    private fun findRoot(a: Int, parents: IntArray): Int {
        var a = a
        while (parents[a] != a) {
            parents[a] = parents[parents[a]]
            a = parents[a]
        }
        return a
    }
}
