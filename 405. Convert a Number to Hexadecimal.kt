class Solution {
    fun toHex(num: Int): String {
    if (num == 0) return "0"
    val map = "0123456789abcdef"
    val result = StringBuilder()
    var n = num
    while (n != 0) {
        result.append(map[n.and(15)])
        n = n.ushr(4)
    }
    return result.reverse().toString()
}

}