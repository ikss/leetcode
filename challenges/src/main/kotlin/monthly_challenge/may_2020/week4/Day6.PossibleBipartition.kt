package monthly_challenge.may_2020.week4

object PossibleBipartition {
    private lateinit var graph: Array<ArrayList<Int>>
    var color = mutableMapOf<Int, Int>()

    fun possibleBipartition(N: Int, dislikes: Array<IntArray>): Boolean {
        graph = Array(N + 1) { ArrayList<Int>() }
        for (edge in dislikes) {
            graph[edge[0]].add(edge[1])
            graph[edge[1]].add(edge[0])
        }
        for (node in 1..N) {
            if (!color.contains(node) && !dfs(node, 0)) return false
        }
        return true
    }

    private fun dfs(node: Int, c: Int): Boolean {
        if (color.contains(node)) return color[node] == c
        color[node] = c
        for (relatives in graph[node]) {
            if (!dfs(relatives, c xor 1)) return false
        }
        return true
    }
}
