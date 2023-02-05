class Solution {
 String findTheDifference(String s, String t) {
  int sum = 0;
  for (int i = 0; i < t.length; i++) {
    sum += t.codeUnitAt(i);
  }
  for (int i = 0; i < s.length; i++) {
    sum -= s.codeUnitAt(i);
  }
  return String.fromCharCode(sum);
}

}