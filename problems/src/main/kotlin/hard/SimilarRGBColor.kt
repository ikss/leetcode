package hard

/**
 * The red-green-blue color "#AABBCC" can be written as "#ABC" in shorthand.
 * * For example, "#15c" is shorthand for the color "#1155cc".
 *
 * The similarity between the two colors "#ABCDEF" and "#UVWXYZ" is -(AB - UV)2 - (CD - WX)2 - (EF - YZ)2.
 *
 * Given a string color that follows the format "#ABCDEF", return a string represents the color that is most similar to the given color and has a shorthand (i.e., it can be represented as some "#XYZ").
 *
 * Any answer which has the same highest similarity as the best answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/similar-rgb-color/)
 */
object SimilarRGBColor {
    fun similarRGB(color: String): String {
        var best = -Double.MAX_VALUE
        var result = ""
        val uv = color.substring(1, 3).hexToInt().toDouble()
        val wx = color.substring(3, 5).hexToInt().toDouble()
        val yz = color.substring(5, 7).hexToInt().toDouble()

        for (a in 0..15) {
            val aa = a * 16 + a
            for (b in 0..15) {
                val bb = b * 16 + b
                for (c in 0..15) {
                    val cc = c * 16 + c
                    val similarity = -Math.pow(aa - uv, 2.0) - Math.pow(bb - wx, 2.0) - Math.pow(cc - yz, 2.0)
                    if (similarity > best) {
                        best = similarity
                        result = "#" + aa.toString(16).padStart(2, '0') + bb.toString(16).padStart(2, '0') + cc.toString(16).padStart(2, '0')
                    }
                }
            }
        }

        return result
    }
}
