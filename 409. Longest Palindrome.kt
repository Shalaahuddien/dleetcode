class Solution {
  fun longestPalindrome(s: String): Int {
    val charCount = HashMap<Char, Int>()
    for (c in s) {
        charCount[c] = charCount.getOrDefault(c, 0) + 1
    }
    var result = 0
    var hasOdd = false
    for (count in charCount.values) {
        if (count % 2 == 0) {
            result += count
        } else {
            result += count - 1
            hasOdd = true
        }
    }
    return if (hasOdd) result + 1 else result
}

}