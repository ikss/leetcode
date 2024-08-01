package strings.easy

/**
 * You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:
 * * The first ten characters consist of the phone number of passengers.
 * * The next character denotes the gender of the person.
 * * The following two characters are used to indicate the age of the person.
 * * The last two characters determine the seat allotted to that person.
 *
 * Return the number of passengers who are strictly more than 60 years old.
 *
 * [URL](https://leetcode.com/problems/number-of-senior-citizens/)
 */
object NumberOfSeniorCitizens {
    fun countSeniors(details: Array<String>): Int {
        var result = 0

        for (d in details) {
            val age = (d[11] - '0') * 10 + (d[12] - '0')
            if (age > 60) result++
        }

        return result
    }
}