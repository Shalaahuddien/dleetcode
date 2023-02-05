class Solution {
  int thirdMax(List<int> nums) {
  Set<int> set = Set.from(nums);
  List<int> list = set.toList();
  list.sort((a, b) => b - a);
  return list.length >= 3 ? list[2] : list[0];
}

}