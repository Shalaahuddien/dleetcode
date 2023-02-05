class Solution {
  int missingNumber(List<int> nums) {
  int missing = nums.length;
  for (int i = 0; i < nums.length; i++) {
    missing ^= i ^ nums[i];
  }
  return missing;
}

}