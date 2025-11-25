package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SmallestSufficientTeamTest {
    @Test
    fun test1() {
        val req_skills = arrayOf("java", "nodejs", "reactjs")
        val people = listOf(listOf("java"), listOf("nodejs"), listOf("nodejs", "reactjs"))
        val expected = intArrayOf(0, 2)

        assertArrayEquals(expected, SmallestSufficientTeam.smallestSufficientTeam(req_skills, people))
    }

    @Test
    fun test2() {
        val req_skills = arrayOf("algorithms", "math", "java", "reactjs", "csharp", "aws")
        val people = listOf(
            listOf("algorithms", "math", "java"),
            listOf("algorithms", "math", "reactjs"),
            listOf("java", "csharp", "aws"),
            listOf("reactjs", "csharp"),
            listOf("csharp", "math"),
            listOf("aws", "java"),
        )
        val expected = intArrayOf(1, 2)

        assertArrayEquals(expected, SmallestSufficientTeam.smallestSufficientTeam(req_skills, people))
    }
}