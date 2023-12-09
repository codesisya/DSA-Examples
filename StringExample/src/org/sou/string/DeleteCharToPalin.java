package org.sou.string;

public class DeleteCharToPalin {
  public static boolean validPalindrome(String s) {
    int n = s.length();
    int count = 0;
    int i =0;
    for(i =0;i<n/2;i++){
      if(s.charAt(i)!=s.charAt(n-i-1)){
        break;
      }
    }
    if(n/2-i>1)
      return (isPalin(s,i+1,n-i-1)||isPalin(s,i,n-i-2));
    return true;
  }
  public static boolean isPalin(String str, int s, int e){
    for(int i = s;i<e/2;i++){
      if(str.charAt(s)!=str.charAt(e-i-1))
        return false;
    }
    return true;
  }
  public static void main(String[] args) {
    String s = "abc";
    System.out.println(validPalindrome(s));
  }
}

