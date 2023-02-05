class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val magazineMap = HashMap<Char, Int>()
    for (c in magazine) {
        magazineMap[c] = magazineMap.getOrDefault(c, 0) + 1
    }
    for (c in ransomNote) {
        if (magazineMap.getOrDefault(c, 0) <= 0) {
            return false
        }
        magazineMap[c] = magazineMap[c]!! - 1
    }
    return true
}

}