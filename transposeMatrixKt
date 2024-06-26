fun main() {

    var matrix = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(5,6,7),
        intArrayOf(9,10,11),
    )

    val result = transpose(matrix)

    for (row in result) {
        println(row.contentToString())
    }
}

fun transpose(matrix: Array<IntArray>): Array<IntArray> {

    //For transpose Matrix it means
    /*
        [1,2,3]               [1,5,9  ]
        [5,6,7]  ->         [2,6,10]
        [9,10,11]           [3,7,11]
        
        For debug purpose Println(x) has been used
     */

    //Take an empty array
    var transposeMatrix :Array<IntArray> = arrayOf()

    for (col in  0 until matrix[0].size) {
//        println("col  $col")
        var  newRow = intArrayOf()

        for (row in matrix.indices) {
//            println("col $col <-> row  $row")
            newRow += matrix[row][col]
//            println("newRow  ${newRow.contentToString()}")
        }
        transposeMatrix += newRow
    }

    return  transposeMatrix
}
