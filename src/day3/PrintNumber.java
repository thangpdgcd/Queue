package day3;

public class PrintNumber {
    public static void main( String[] args ) {
        // printChainOfNums(5); // 5 4 3 2 1
        printChainOfNumsReversed(5); // 1 2 3 4 5
    }
    public static void printChainOfNumsReversed(int n){
        // base condition or base case
        if(n == 0){
            return;
        }
        printChainOfNumsReversed(n - 1);  // recursive call
        System.out.println( n ); // <<<<<<<
    }

    public static void printChainOfNums(int n){
        // base condition or base case
        if(n == 0){
            return;
        }
        System.out.println( n ); // <<<<<<<
        printChainOfNums(  n - 1 ); // recursive call
    }
}
