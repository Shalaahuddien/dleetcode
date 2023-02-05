class Solution {
  bool isPerfectSquare(int num) {
  if (num < 0) return false;
  if (num <= 1) return true;
  
  int left = 0, right = num;
  while (left <= right) {
    int mid = (left + right) ~/ 2;
    int guess = mid * mid;
    if (guess == num) return true;
    if (guess < num) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }
  
  return false;
}

}