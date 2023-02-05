class Solution {
    fun firstUniqChar(s: String): Int {
    val charCount = HashMap<Char, Int>()
    for (ch in s) {
        charCount[ch] = charCount.getOrDefault(ch, 0) + 1
    }

    for (i in s.indices) {
        if (charCount[s[i]] == 1) {
            return i
        }
    }
    return -1
}

}