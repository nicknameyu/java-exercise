/*
Given a number n, count number of n length strings with consecutive 1’s in them.
Example:
    Input  : n = 2
    Output : 1
    There are 4 strings of length 2, the
    strings are 00, 01, 10 and 11. Only the 
    string 11 has consecutive 1's.

    Input  : n = 3
    Output : 3
    There are 8 strings of length 3, the
    strings are 000, 001, 010, 011, 100, 
    101, 110 and 111.  The strings with
    consecutive 1's are 011, 110 and 111.

    Input : n = 5
    Output : 19
 */

import java.util.Scanner;

class CountConsecutive1s {
    public static void main(String[] args) {

        int num;
        System.out.printf("Enter a number: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        s.close();

        if ( num <= 0 || num > 31 ){
            System.out.println("Invalid input. Input must be a positive integer smaller than 32. ");
            return ;
        }
        double biggestIntInDouble = Math.pow(2, num) - 1;
        int biggestInt = (int)biggestIntInDouble;
        int numOfConsecutive1 = 0;
        for(int i=0; i <= biggestInt; i++){
            String binString = String.format("%s", Integer.toBinaryString(i));
            if(binString.contains("11")){
                numOfConsecutive1 += 1;
            }
        }
        System.out.println("Number of consecutive 1s is : " + numOfConsecutive1); 
    }
}