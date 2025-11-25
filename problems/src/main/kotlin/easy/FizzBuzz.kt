package easy

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * * `answer[i] == "FizzBuzz"` if i is divisible by 3 and 5.
 * * `answer[i] == "Fizz"` if i is divisible by 3.
 * * `answer[i] == "Buzz"` if i is divisible by 5.
 * * `answer[i] == i (as a string)` if none of the above conditions are true.
 *
 * [URL](https://leetcode.com/problems/fizz-buzz/)
 */
object FizzBuzz {
    fun fizzBuzz(n: Int): List<String> =
        (1..n).map {
            var result = ""
            if (it % 3 == 0) {
                result += "Fizz"
            }
            if (it % 5 == 0) {
                result += "Buzz"
            }
            result.ifEmpty { it.toString() }
        }
}
