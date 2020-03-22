class Matrix(private val matrixAsString: String) {

    private val matrix = matrixAsString.split("\n")

    fun column(colNr: Int): List<Int> {
        return matrix.map { it.splitIntBySpace()[colNr - 1] }
    }

    fun row(rowNr: Int): List<Int> {
        return matrix[rowNr - 1].splitIntBySpace()
    }

    private fun String.splitIntBySpace() =
            this.split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
}
