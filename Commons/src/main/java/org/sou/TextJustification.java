package org.sou;

/*
We are building a word processor and we would like to implement a "reflow" functionality that also applies full justification to the text.
Given an array containing lines of text and a new maximum width, re-flow the text to fit the new width. Each line should have the exact specified width. If any line is too short, insert '-' (as stand-ins for spaces) between words as equally as possible until it fits.
Note: we are using '-' instead of spaces between words to make testing and visual verification of the results easier.


lines = [ "The day began as still as the",
          "night abruptly lighted with",
          "brilliant flame" ]

reflowAndJustify(lines, 24) "reflow lines and justify to length 24" =>

        [ "The--day--began-as-still",
          "as--the--night--abruptly",
          "lighted--with--brilliant",
          "flame" ] // <--- a single word on a line is not padded with spaces

reflowAndJustify(lines, 25) "reflow lines and justify to length 25" =>

        [ "The-day-began-as-still-as"
          "the-----night----abruptly"
          "lighted---with--brilliant"
          "flame" ]

reflowAndJustify(lines, 26) "reflow lines and justify to length 26" =>

        [ "The--day-began-as-still-as",
          "the-night-abruptly-lighted",
          "with----brilliant----flame" ]

reflowAndJustify(lines, 40) "reflow lines and justify to length 40" =>

        [ "The--day--began--as--still--as-the-night",
          "abruptly--lighted--with--brilliant-flame" ]

reflowAndJustify(lines, 14) "reflow lines and justify to length 14" =>

        ['The--day-began',
         'as---still--as',
         'the------night',
         'abruptly',
         'lighted---with',
         'brilliant',
         'flame']

         take a slice that doesnot overflow your line lets say length of slice = n
         #spaces = width-n
         #spaces in between words = #spaces/#words in that line
         add the words with spaces in final op
         in last line if#words>1 then apply same logic other wise just put the last single word


n = number of words OR total characters

*/

import java.io.*;
import java.util.*;

public class TextJustification {

  private static List<String> reflowAndJustify(String[] lines, int width){
    List<String> words = new ArrayList();
    List<String> ans = new ArrayList();
    int left = 0;
    for(String s: lines){
      for(String s1:s.split(" "))
        words.add(s1);
    }
    while(left<words.size()){
      int right = getRight(words,width,left);
      ans.add(justify(left,right,words,width));
      left = right+1;
    }
    return ans;
  }

  private static int getRight(List<String> words, int width, int start){
    int curWidth = -1;
    int i = start;
    for(;i<words.size();i++){
      curWidth = curWidth+words.get(i).length()+1;
      if(curWidth>=width)
        break;
    }
    return i-1;
  }

  private static String justify(int left, int right, List<String> words, int width){
    int wordsLength = 0;
    int numSpaces = 0;
    int wordCount = right -left;
    StringBuilder sb  = new StringBuilder();
    if(left == right)
      return words.get(left);
    for(int i =left;i<=right;i++){
      wordsLength =wordsLength+words.get(i).length();
    }
    numSpaces = width - wordsLength;
    //numSpaces = numSpaces+wordCount;
    int spaceLen = numSpaces/wordCount;
    String betweenSpace = getDelim(spaceLen);
    int rem = numSpaces%wordCount;
    for(int i = left;i<right;i++){
      sb.append(words.get(i)).append(betweenSpace).append(rem -- >0?"-":"");
    }

    sb.append(words.get(right));
    return sb.toString();
  }

  static String getDelim(int size){
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<size;i++)
      sb.append("-");
    return sb.toString();
  }


  public static void main(String[] argv) {
    String[] lines = {"The day began as still as","the night abruptly lighted with","brilliant flame"};
    int testReflowWidth1 = 24;
    int testReflowWidth2 = 25;
    int testReflowWidth3 = 26;
    int testReflowWidth4 = 40;
    int testReflowWidth5 = 14;
    List<String> ans = reflowAndJustify(lines,testReflowWidth2);
    for(String s:ans){
      System.out.println(s);
    }

  }
}
