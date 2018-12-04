/**
 * Requirement
 * Write a program that returns the numbers from N to M both inclusive.
 * But for multiples of three give "Fizz" instead of the number and for the multiples of five give "Buzz".
 * For numbers which are multiples of both three and five, give "FizzBuzz".
 */

public class Main {
    public static void main(String[] args){
        System.out.println("Solution output:");
        int N = 0;
        int M = 15;
        String programOutput = Solution.run(N, M);
        System.out.println(programOutput);
    }
}

class Solution {

    public static String run(int N, int M) {
        int myN = N < M ? N : M;
        int myM = N < M ? M : N;

        String fizzString = "Fizz";
        int fizzNumber = 3;
        String buzzString = "Buzz";
        int buzzNumber = 5;
        String sequence = "";

        for(int i = myN; i <= myM; i++){
            if( i % fizzNumber == 0 || i % buzzNumber == 0){
                sequence += i % fizzNumber == 0 ? fizzString : "";
                sequence += i % buzzNumber == 0 ? buzzString : "";
            }
            else{
                sequence += i;
            }
            sequence += ",";
        }
        sequence = sequence.substring(0, sequence.length() - 1);

        return sequence;
    }
}