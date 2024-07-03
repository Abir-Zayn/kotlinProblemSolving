import java.util.*

//Data class TreeNode is creating a node
data class TreeNode(
    val value: Int,
    var left: TreeNode? = null,
    var right: TreeNode? = null
)

//here 5 will be printed at first as its top value, 
//5 has 3,8 as its left and right. As we are going to follow pre order therefore
//8 will stacked and then 3 will be stacked. 3 will be popped. 
// after that 3 has left (1) and right(4). so 4 will be stacked first then 1 . 
// 1 will be pop. and now 1 doesnt has any left or right so 4 be popped.
// now current value is 8 . it has right 11. 
//8 will be popped then 11. 
fun printPreOrderIterative(root: TreeNode?) {
    if (root == null) return

    val stack = Stack<TreeNode>()
    stack.push(root)

    while (stack.isNotEmpty()) {
        val current = stack.pop()
        println(current.value.toString() + " ")

        if (current.right != null) {
            stack.push(current.right)
        }

        if (current.left != null) {
            stack.push(current.left)
        }
    }
}

fun countElementsIterative(root: TreeNode?): Int {
    if (root == null) return 0

    val stack = Stack<TreeNode>()
    stack.push(root)
    var count = 0

    while (stack.isNotEmpty()) {
        val current = stack.pop()
        count++

        if (current.right != null) {
            stack.push(current.right)
        }
        if (current.left != null) {
            stack.push(current.left)
        }
    }

    return count
}


fun countLessThan(root: TreeNode?, value: Int): Int {
    if (root == null) return 0
    var count = 0
    if (root.value < value) {
        count++
    }
    count += countLessThan(root.left, value) + countLessThan(root.right, value)
    return count
}



fun add(root: TreeNode?, value: Int): TreeNode? {
    //If root is null make  the upcoming value as its root
    if (root == null) {
        return TreeNode(value)
    }

    //if the root value is less than the upcoming value then insert it in the left subtree
    //else insert it in the right subtree
    if (value < root.value) {
        root.left = add(root.left, value)
    } else {
        root.right = add(root.right, value)
    }
    return root
}
fun depth(root: TreeNode?): Int {
    if (root == null) return 0
    return 1 + maxOf(depth(root.left), depth(root.right))
}


fun main() {
    //Initializing node with 5
    val root = TreeNode(5)
    add(root, 3)
    add(root, 8)
    add(root, 1)
    add(root, 4)
    add(root, 11)

    println("Pre-order traversal: ")
    printPreOrderIterative(root)
    println("\nDepth: ${depth(root)}")
    println("Number of elements: ${countElementsIterative(root)}")
    println("Number of elements less than 10: ${countLessThan(root, 10)}")
}
