/*
Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings that can be formed by replacing each wildcard character by ‘0’ or ‘1’. 
Example : 

Input: str = “1??0?101”
Output: 
10000101
10001101
10100101
10101101
11000101
11001101
11100101
11101101
*/

import java.util.Scanner;

public class generate {

  public static void main(String[] args) {
    System.out.printf("Enter a pattern: ");
    Scanner s = new Scanner(System.in);
    String pattern = s.nextLine();
    s.close();
    int wildcardCount = 0;
    for(int i = 0; i < pattern.length(); i++){
      if(pattern.charAt(i) == '?' ){
        wildcardCount++;
      }
    }
    if(wildcardCount == 0){
      System.out.println("No wildcard found in the pattern. ");
      return;
    }
    int[] position = new int[wildcardCount];

    for(int i = 0, index = -1; i < wildcardCount; i++){
      index = pattern.indexOf("?", index +1 );
      if(index != -1){
        position[i] = index;
      }
    }
    int numCombinations = (int)Math.pow(2, wildcardCount);

    for(int i = 0; i < numCombinations; i++){
      String replacingString = Integer.toBinaryString(i);
      while((wildcardCount - replacingString.length()) > 0)replacingString = "0" + replacingString;
      String str = pattern; 
      for(int j = 0; j < wildcardCount; j++){
        str = str.substring(0, position[j]) + replacingString.charAt(j) + str.substring(position[j]+1, str.length()); 
      }
      System.out.println(str);
    }


  }
}
