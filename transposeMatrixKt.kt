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

//The transpose function takes a 2D array matrix as input and 
//returns a new 2D array that is the transpose of the original matrix.
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

    //Loops through each column of the original matrix. 
    //eg. for column(0),--> column(n=its size)
    for (col in  0 until matrix[0].size) {
//        println("col  $col")
        var  newRow = intArrayOf()

         //Loops through each column of the original matrix. 
    //eg. for row(0),--> row(n=its size)
        for (row in matrix.indices) {
//            println("col $col <-> row  $row")
            //getting new arrays values as we traversing from (col,row) (0,0) to (col,row)(n,m) n=col.size, m=row.size
            newRow += matrix[row][col]
//            println("newRow  ${newRow.contentToString()}")
        }
        //getting the new arrays values in transposeMatrix
        transposeMatrix += newRow
    }

    return  transposeMatrix
}
