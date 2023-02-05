class Solution {
    fun readBinaryWatch(turnedOn: Int): List<String> {
        val result = mutableListOf<String>()
        for (i in 0..11) {
            for (j in 0..59) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    result.add("$i:${if (j < 10) "0" else ""}$j")
                }
            }
        }
        return result
    }
}
