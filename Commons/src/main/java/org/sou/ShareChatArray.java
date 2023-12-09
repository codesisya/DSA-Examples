package org.sou;

public class ShareChatArray {
  public static void main(String[] args) {
   // int[] arr ={2,2,3,3,7,7,9,10,10,12,12};
    //int[] arr ={2,2,3};
    //int[] arr ={2,3,3};
    int[] arr ={2};
    getSingleElement(arr,0,arr.length-1);
    //System.out.println(ans);
  }

  public static void getSingleElement(int[] arr, int l, int r) {
    if(arr.length == 1) {
      System.out.println("data is=" + arr[0]);
      return;
    }
    if (l > r)
      return;
    if (l == r) {
      System.out.println("data is=" +arr[l]);
      return ;
    }
    int mid = l + (r - l) / 2;
    if (mid % 2 == 0) {
      if (arr[mid] == arr[mid + 1])
        getSingleElement(arr, mid + 2, r);
      else
        getSingleElement(arr, l, mid);
    } else {
      if (arr[mid] == arr[mid - 1])
        getSingleElement(arr, mid + 1, r);
      else
        getSingleElement(arr, l, mid - 1);
    }
    //return -1;
  }
}
