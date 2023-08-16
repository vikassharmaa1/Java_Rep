package com.interview.related;

import java.util.Arrays;
public class Anagram {

  public static void main(String args[]) {

    String str_1 = "Brag";
    String str_2 = "Grab";

    str_1 = str_1.toLowerCase();
    str_2 = str_2.toLowerCase();

    if ((str_1.isEmpty() || str_1 == null) || (str_2.isEmpty() || str_2 == null)) {
      throw new IllegalArgumentException("String(s) is either null or Empty");
    }

    if (str_1.length() != str_2.length()) {
      System.out.println("Both Strings are not Anagrams");
    } else {
      char[] str1 = str_1.toCharArray();
      Arrays.sort(str1);
      char[] str2 = str_2.toCharArray();
      Arrays.sort(str2);

      if (Arrays.equals(str1, str2)) {
        System.out.println("Both Strings are Anagrams");
      } else {
        System.out.println("Both Strings are not Anagrams");
      }
    }
  }
}