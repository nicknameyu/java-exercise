/*
Given n binary strings, return their sum (also a binary string).

Examples:  

Input:  arr[] = ["11", "1"]
Output: "100"
Input : arr[] = ["1", "10", "11"]
Output : "110" 
*/

import java.util.Scanner;

class addBinaryStrings {
    public static void main(String[] args){
    System.out.printf("Enter an array: ");
    Scanner s = new Scanner(System.in);
    String arrString = s.nextLine();
    s.close();
    arrString = arrString.trim();
    if(arrString.charAt(0) != '[' || arrString.charAt(arrString.length()-1) != ']'){
        System.out.println("Array must be enclosed with '[' and ']'.");
        return;
    }
    String[] arr = arrString.substring(1, arrString.length() - 1).split(",");
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += Integer.parseInt(arr[i].trim().replace("\"", ""), 2);
    }
    System.out.println("Output: " + Integer.toBinaryString(sum));
  }
}
