/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) return listOf()
        val result = mutableListOf<String>()
        val path = StringBuilder()
        dfs(root, path, result)
        return result
    }

    private fun dfs(node: TreeNode?, path: StringBuilder, result: MutableList<String>) {
        if (node == null) return
        val len = path.length
        path.append(node.`val`)
        if (node.left == null && node.right == null) {
            result.add(path.toString())
        } else {
            path.append("->")
            dfs(node.left, path, result)
            dfs(node.right, path, result)
        }
        path.setLength(len)
    }
}
