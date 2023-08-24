package strings.hard

/**
 * Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.
 *
 * A concatenated word is defined as a string that is comprised entirely of at least two shorter words in the given array.
 *
 * [URL](https://leetcode.com/problems/text-justification/)
 */
object TextJustification {
    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        val result = ArrayList<String>()
        var startIndex = 0

        while (startIndex < words.size) {
            val endIndex = getLineIndex(words, startIndex, maxWidth)
            result.add(justify(words, startIndex, endIndex, maxWidth))
            startIndex = endIndex + 1
        }

        return result
    }

    private fun getLineIndex(words: Array<String>, index: Int, maxWidth: Int): Int {
        var length = 0
        var index = index
        while (index < words.size) {
            if ((length + words[index].length) > maxWidth) {
                return index - 1
            }
            length += 1 + words[index].length
            index++
        }

        return words.size
    }

    private fun justify(words: Array<String>, startIndex: Int, endIndex: Int, maxWidth: Int): String {
        val builder = StringBuilder(maxWidth)

        if (endIndex == words.size) {
            for (i in startIndex until endIndex) {
                builder.append(words[i])
                if (builder.length < maxWidth) {
                    builder.append(' ')
                }
            }
            while (builder.length < maxWidth) {
                builder.append(' ')
            }
            return builder.toString()
        }

        val wordsCount = maxOf(endIndex - startIndex, 1)

        var wordsLength = 0
        for (i in startIndex..endIndex) {
            wordsLength += words[i].length
        }

        val spaces = maxWidth - wordsLength
        val spacesPerWord = spaces / wordsCount
        var needsExtraSpace = spaces % wordsCount

        for (i in startIndex..endIndex) {
            builder.append(words[i])
            if (builder.length < maxWidth) {
                repeat(spacesPerWord) {
                    builder.append(' ')
                }
                if (needsExtraSpace > 0) {
                    builder.append(' ')
                    needsExtraSpace--
                }
            }
        }
        return builder.toString()
    }
}