package easy

/**
 * You are given the array paths, where `paths[i] = [cityAi, cityBi]` means there exists a direct path going
 * from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
 *
 * It is guaranteed that the graph of paths forms a line without any loop, therefore,
 * there will be exactly one destination city.
 *
 * [URL](https://leetcode.com/problems/destination-city/)
 */
object DestinationCity {
    fun destCity(paths: List<List<String>>): String {
        val cities = HashSet<String>()

        for ((from, _) in paths) {
            cities.add(from)
        }

        for ((_, to) in paths) {
            if (!cities.contains(to)) {
                return to
            }
        }
        return ""
    }
}
