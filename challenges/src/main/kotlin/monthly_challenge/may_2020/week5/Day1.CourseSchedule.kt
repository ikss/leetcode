package monthly_challenge.may_2020.week5

object CourseSchedule {

    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val adj = Array<ArrayList<Int>>(numCourses) { ArrayList() }
        for ((from, to) in prerequisites) {
            adj[from].add(to)
        }
        val color = IntArray(numCourses)
        for (i in 0 until numCourses) {
            if (dfs(adj, i, color)) {
                return false
            }
        }
        return true
    }

    private fun dfs(adj: Array<ArrayList<Int>>, v: Int, color: IntArray): Boolean {
        color[v] = 1
        for (neighbor in adj[v]) {
            if (color[neighbor] == 1 || (color[neighbor] == 0 && dfs(adj, neighbor, color))) {
                return true
            }
        }
        color[v] = 2
        return false
    }
}
