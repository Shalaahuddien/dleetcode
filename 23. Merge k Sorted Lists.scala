/**
  * Definition for singly-linked list.
  * class ListNode(var _x: Int = 0) {
  *   var next: ListNode = null
  *   var x: Int = _x
  * }
  */

object Solution {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    if (lists.isEmpty) return null
    var amount = lists.length
    var interval = 1
    while (interval < amount) {
      for (i <- 0 until (amount - interval, interval * 2)) {
        lists(i) = mergeTwoLists(lists(i), lists(i + interval))
      }
      interval *= 2
    }
    return lists(0)
  }

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) return l2
    if (l2 == null) return l1
    if (l1.x < l2.x) {
      l1.next = mergeTwoLists(l1.next, l2)
      return l1
    } else {
      l2.next = mergeTwoLists(l1, l2.next)
      return l2
    }
  }
}
