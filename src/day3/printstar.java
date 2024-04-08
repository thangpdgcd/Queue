//package day3;
//public class printstar {
//    public static void main(String[] args){
//        printFigure(5);
//    }
//    static void printFigure(int n) {
//        printLineOfChars('*', 5);  // n = 5
//        printLineOfChars('*', 4);  // n - 1
//        printLineOfChars('*', 3);  // n - 1 - 1
//        printLineOfChars('*', 2);  // n - 1 - 1 - 1
//        printLineOfChars('*', 1);  // n - 1 - 1 - 1 - 1
//
//        //
//
//        printLineOfChars('*', 1);  // n = 1
//        printLineOfChars('*', 2);  // n + 1
//        printLineOfChars('*', 3);  // n + 1 + 1
//        printLineOfChars('*', 4);  // n + 1 + 1 + 1
//        printLineOfChars('*', 5);  // n + 1 + 1 + 1 + 1
//    }
//
//    public static void printFigure(int n){
//        // base condition
//        printFigure(n - 1);
//    }
//
//
//    static void printLineOfChars(char ch, int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.print(ch);
//        }
//        System.out.println();
//    }
//}
//
