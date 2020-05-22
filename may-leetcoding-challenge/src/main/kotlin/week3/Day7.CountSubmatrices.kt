package week3

object CountSubmatrices {

    fun countSquares(matrix: Array<IntArray>): Int {
        if (matrix.isEmpty()) return 0
        var result = 0
        for (y in matrix.indices) {
            for (x in matrix[0].indices) {
                if (matrix[y][x] > 0 && y > 0 && x > 0) {
                    matrix[y][x] = minOf(matrix[y - 1][x - 1], matrix[y - 1][x], matrix[y][x - 1]) + 1
                }
                result += matrix[y][x]
            }
        }
        return result
    }

    fun countSquares2(matrix: Array<IntArray>): Int {
        var result = 0
        matrix.forEachIndexed { y, array ->
            array.forEachIndexed { x, value ->
                if (value == 1) {
                    result += calculateSquaresAround(matrix, x, y)
                }
            }
        }
        return result
    }

    private fun calculateSquaresAround(matrix: Array<IntArray>, x: Int, y: Int): Int {
        var result = 1
        while (true) {
            for (indexX in x..x + result) {
                if (indexX > matrix[0].size - 1) return result
                for (indexY in y..y + result) {
                    if (indexY > matrix.size - 1 || matrix[indexY][indexX] == 0) return result
                }
            }
            result++
        }
    }
}
