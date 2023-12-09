package org.sou;

public class BinSearch {
  public static void main(String[] args) {
    int[] a = {4,5,6,7,0,1,2};
    System.out.println(findUtil(a,0,a.length-1));
    System.out.println(findMin(a,0,a.length-1));
  }
  private static int findUtil(int[] a, int l, int r) {
    if (r < l)
      return a[0];
    if (l == r)
      return a[l];
    int m = (l + r) / 2;
    if (m < r && a[m] > a[m + 1])
      return a[m + 1];
    if (m > l && a[m] < a[m - 1])
      return a[m];
    if (a[m] < a[r])
      return findUtil(a, l, m - 1);
    return findUtil(a, m + 1, r);
  }
  static int findMin(int arr[], int low, int high) {
    if (high < low) return arr[0];
    if (high == low) return arr[low];
    int mid = low + (high - low) / 2; /*(low + high)/2;*/
    if (mid < high && arr[mid + 1] < arr[mid])
      return arr[mid + 1];
    if (mid > low && arr[mid] < arr[mid - 1])
      return arr[mid];
    if (arr[high] > arr[mid])
      return findMin(arr, low, mid - 1);
    return findMin(arr, mid + 1, high);
  }
}
