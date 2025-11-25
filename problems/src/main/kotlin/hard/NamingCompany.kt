package hard

/**
 * You are given an array of strings ideas that represents a list of names to be used in the process of naming a company.
 * The process of naming a company is as follows:
 *
 * Choose 2 distinct names from ideas, call them ideaA and ideaB.
 * Swap the first letters of ideaA and ideaB with each other.
 * If both of the new names are not found in the original ideas, then the name ideaA ideaB(the concatenation of
 * ideaA and ideaB, separated by a space) is a valid company name.
 * Otherwise, it is not a valid name.
 * Return the number of distinct valid names for the company.
 *
 * [URL](https://leetcode.com/problems/naming-a-company/)
 */
object NamingCompany {
    fun distinctNames(ideas: Array<String>): Long {
        // Group idea by their initials.
        val initialGroup = Array(26) { hashSetOf<String>() }
        for (idea in ideas) {
            initialGroup[idea[0] - 'a'].add(idea.substring(1))
        }

        // Calculate number of valid names from every pair of groups.
        var answer = 0L
        for (i in 0 until initialGroup.size - 1) {
            for (j in i + 1 until initialGroup.size) {
                // Get the number of mutual suffixes.
                var numOfMutual = 0L
                for (ideaA in initialGroup[i]) {
                    if (initialGroup[j].contains(ideaA)) {
                        numOfMutual++
                    }
                }

                // Valid names are only from distinct suffixes in both groups.
                // Since we can swap a with b and swap b with a to create two valid names, multiple answer by 2.
                answer += 2 * (initialGroup[i].size - numOfMutual) * (initialGroup[j].size - numOfMutual)
            }
        }
        return answer
    }
}
