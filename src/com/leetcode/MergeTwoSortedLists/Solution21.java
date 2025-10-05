package com.leetcode.MergeTwoSortedLists;

public class Solution21 {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode merge = null;

    if (list1 == null && list2 == null) {
      return merge;
    } else if (list1 == null) {
      return list2;
    } else if (list2 == null) {
      return list1;
    } else {

      // Inicio lista con el menor nodo comparando list1 y list2
      merge = (list1.val < list2.val) ? new ListNode(list1.val) : new ListNode(list2.val);

      // Avanzar la lista usada para iniciar
      if (list1.val < list2.val) {
        list1 = list1.next;
      } else {
        list2 = list2.next;
      }

      // Creo una lista para recorrer mi merge sin perder la cabeza
      ListNode tempMerge = merge;

      while (list1 != null || list2 != null) {

        if (list1 == null) {
          tempMerge.next = list2;
          return merge;
        } else if (list2 == null) {
          tempMerge.next = list1;
          return merge;
        } else {
          if (list1.val < list2.val) {
            tempMerge.next = new ListNode(list1.val);
            list1 = list1.next;
          } else {
            tempMerge.next = new ListNode(list2.val);
            list2 = list2.next;
          }
  
          tempMerge = tempMerge.next;
        }
      }
      return merge;
    }

  }
}
