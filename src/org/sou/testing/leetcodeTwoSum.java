package org.sou.testing;

import java.util.HashMap;
import java.util.Map;

public class leetcodeTwoSum {
  public static void main(String[] args) {
    int[] a = {3,2,4};
    int target = 6;
   // int[] ans = twoSum(a,target);
    //System.out.println(ans[0]+","+ans[1]);
    System.out.println("dvdf"+lengthOfLongestSubstring("dvdf"));
    System.out.println("abcd"+lengthOfLongestSubstring("abcd"));
    System.out.println("aaaa"+lengthOfLongestSubstring("aaaa"));
    System.out.println("aaab"+lengthOfLongestSubstring("aaab"));
    System.out.println("aaacccfff"+lengthOfLongestSubstring("aaacccfff"));
    System.out.println("abcbcd"+lengthOfLongestSubstring("abcbcd"));
  }


  public static int lengthOfLongestSubstring(String s) {
    Map<Character,Integer> m = new HashMap();
    if(s.length()<2)
      return s.length();
    int start = 0;
    int end = 0;
    int ans = 0;
    int j;
    int i = 0;
    for( i =0;i<s.length();i++){
      Character c = s.charAt(i);
      if(m.get(c)!=null){
        if(i-start>ans)
          ans = i-start;
        int old = m.get(c);
        for( j = start;j<=old;j++)
          m.remove(s.charAt(j));
        start = j;
      }
      m.put(c,i);
    }
    return ans>m.size()?ans:m.size();
  }

  public static int[] twoSum(int[] nums, int target) {
    // Arrays.sort(nums);
    int ans[] = new int[2];
    String s = "ajdj";
    s.length();
    s.charAt(1);
    int n = nums.length;
    Map<Integer, Integer> m = new HashMap();
    for(int i = 0;i<n;i++){
      if(m.get(target-nums[i])!=null){
        ans[1] = i;
        ans[0] = m.get(target-nums[i]);
        break;
      }
      m.put(nums[i],i);
    }
    // System.out.println(i);
    return ans;
  }
}
